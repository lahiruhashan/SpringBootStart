package com.hashtips.springBootStart.web.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class UserResource {

    @GetMapping
    public String getAll() {
        return "All Users";
    }

}
