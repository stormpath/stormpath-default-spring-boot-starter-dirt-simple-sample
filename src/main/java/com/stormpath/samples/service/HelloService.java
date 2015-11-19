package com.stormpath.samples.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private static final String GROUP_HREF = "STORMPATH_GROUP_HREF";

    @PreAuthorize("hasRole('" + GROUP_HREF + "')")
    public String sayHello() {
        return "Hello!";
    }
}
