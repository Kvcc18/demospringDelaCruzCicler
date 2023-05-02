package com.desarrollo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Homepage controller.
 */

@RestController
public class IndexController {

    @GetMapping("/index")
    String index() {
        return "index";
    }

}
