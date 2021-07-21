package org.ww.vhrserver.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.ww.vhrserver.mapper.HrMapper;
import org.ww.vhrserver.mapper.RoleMapper;
import org.ww.vhrserver.model.Hr;
import org.ww.vhrserver.service.HrService;

import javax.annotation.Resource;

/**
 * @Author ww
 * @Date 2021/7/15 11:58
 */
@Service
public class HrServiceImpl implements HrService, UserDetailsService {
    @Resource
    HrMapper hrMapper;
    @Resource
    RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        hr.setRoles(roleMapper.getRolesByHrId(hr.getId()));
        return hr;
    }
}
