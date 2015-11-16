package com.stormpath.samples.controllers;

import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.servlet.application.ApplicationResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(HttpServletRequest req) {
        Application application = ApplicationResolver.INSTANCE.getApplication(req);
        return application.getName();
    }
}
