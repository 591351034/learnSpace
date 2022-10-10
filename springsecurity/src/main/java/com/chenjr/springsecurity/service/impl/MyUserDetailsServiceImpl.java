package com.chenjr.springsecurity.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenjr.springsecurity.entity.Users;
import com.chenjr.springsecurity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Description:
 * <p>
 * ClassName: MyUserDetailsServiceImpl
 * date: 2022/10/10 16:53
 *
 * @author chenjr
 */
@Service("userDetailsService")
public class MyUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Users> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",username);
        Users users = userMapper.selectOne(userQueryWrapper);

        if (Objects.isNull(users)) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList("role");

        return new User(users.getUsername(),users.getPassword(),authorityList);
    }
}
