package org.ww.vhrserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.ww.vhrserver.model.Menu;
import org.ww.vhrserver.model.Role;
import org.ww.vhrserver.service.MenuService;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/19 11:56
 */
@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    @Resource
    MenuService menuService;
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        //获取当前请求路径
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<Menu> allMenuWithRoles = menuService.getAllMenuWithRoles();
        for (Menu allMenuWithRole : allMenuWithRoles) {
            if (antPathMatcher.match(allMenuWithRole.getUrl(), requestUrl)) {
                List<Role> roles = allMenuWithRole.getRoles();
                String[] arrRoles = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    arrRoles[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(arrRoles);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
