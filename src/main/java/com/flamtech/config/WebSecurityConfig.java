package com.flamtech.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by elin on 4/24/17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // TODO set up custom login page

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        // TODO replace authentication store
        auth
            .inMemoryAuthentication()
            .withUser("test").password("test").roles("USER");
    }
}
