/*
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.prototype.springboot.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {

    @RequestMapping("/healthcheck")
    String home() {
        return "healthcheck";
    }

}
