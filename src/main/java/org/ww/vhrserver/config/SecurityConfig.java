package org.ww.vhrserver.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.ww.vhrserver.model.Hr;
import org.ww.vhrserver.result.ResponseResult;
import org.ww.vhrserver.service.impl.HrServiceImpl;

import javax.annotation.Resource;


/**
 * @Author ww
 * @Date 2021/7/15 10:59
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource
    HrServiceImpl hrService;
    @Resource
    MyFilter myFilter;
    @Resource
    MyDecision myDecision;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(hrService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setSecurityMetadataSource(myFilter);
                        o.setAccessDecisionManager(myDecision);
                        return o;
                    }
                })
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .successHandler((req, resp, auth) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    Hr hr = (Hr) auth.getPrincipal();
                    hr.setPassword(null);
                    ResponseResult responseResult = ResponseResult.ok("登录成功", hr);
                    resp.getWriter().write(new ObjectMapper().writeValueAsString(responseResult));
                })
                .failureHandler((req, resp, e) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    ResponseResult responseResult = ResponseResult.error("登录失败");
                    if (e instanceof BadCredentialsException) {
                        responseResult.setMsg("用户名或密码输入错误，登录失败");
                    } else if (e instanceof DisabledException) {
                        responseResult.setMsg("账户被禁用，请联系管理员");
                    }
                    resp.getWriter().write(new ObjectMapper().writeValueAsString(responseResult));
                })
                .permitAll()
                .and()
                .exceptionHandling()
                .authenticationEntryPoint((req, resp, e) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    ResponseResult responseResult = ResponseResult.error("尚未登录，请登录");
                    resp.getWriter().write(new ObjectMapper().writeValueAsString(responseResult));
                })
                .and()
                .logout()
                .logoutSuccessHandler((req, resp, auth) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    ResponseResult responseResult = ResponseResult.ok("注销成功");
                    resp.getWriter().write(new ObjectMapper().writeValueAsString(responseResult));
                })
                .and()
                .csrf().disable();
    }
}
