package com.hashtips.springBootStart.web.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // this is how spring boot knows that this is an end point for api calls from outside
@EnableAutoConfiguration // configures jars and dependencies automatically to suit the project
@RequestMapping("/") // only replies to the call with the prefix "users" in the url // if you need to loaf this page when
// localhost:8080 is typed.. change the mapping
public class UserResource {

    //@GetMapping // this will reply to all get calls to this mapping // lets try this method
    // you can also use the following method to map a request
    @RequestMapping(method = RequestMethod.GET) //this method should work fine too
    public String getAll() {
        return "You are in the HOME!!!";
    }

}
