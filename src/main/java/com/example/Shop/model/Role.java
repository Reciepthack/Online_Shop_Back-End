package com.example.Shop.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}


