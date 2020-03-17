package com.cursos.helpdesk.api.security.jwt;


import com.cursos.helpdesk.api.entity.User;
import com.cursos.helpdesk.api.enums.ProfileEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;


public class JwtUserFactory {
    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(),
                mapToGrantedAuthorities(user.getProfile()));
    }

    public static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
        return authorities;
    }

    /*6. Autenticação e autorização com tokens JWT Parte 1*/
}
