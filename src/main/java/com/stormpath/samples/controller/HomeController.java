package com.stormpath.samples.controller;

import com.stormpath.samples.service.HelloService;
import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.servlet.account.AccountResolver;
import com.stormpath.sdk.servlet.application.ApplicationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String home(HttpServletRequest req) {
        Application application = ApplicationResolver.INSTANCE.getApplication(req);
        return application.getName();
    }

    @RequestMapping("/restricted")
    public String restricted(HttpServletRequest req) {
        Account account = AccountResolver.INSTANCE.getAccount(req);
        return "Hello " + account.getFullName() + "!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }
}
