package com.appsgeorge.Login_Registration.model;

import org.springframework.security.core.GrantedAuthority;

public enum ROLE implements GrantedAuthority {
    USER,
    ADMIN;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
