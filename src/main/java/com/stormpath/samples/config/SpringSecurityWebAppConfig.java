package com.stormpath.samples.config;

import com.stormpath.spring.config.StormpathWebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SpringSecurityWebAppConfig extends StormpathWebSecurityConfigurerAdapter {
    @Override
    public void doConfigure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/")
            .permitAll();
    }
}
