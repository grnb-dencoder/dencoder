package io.github.glebremniov.dencoder.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ApplicationController {

    @CrossOrigin
    @GetMapping("/")
    String index() {
        return "Application started";
    }

}
