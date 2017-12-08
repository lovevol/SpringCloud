package com.example.helloservice.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * Filename:    MainController.java
 * Copyright:   Copyright (c) 2012-2017 All Rights Reserved.
 * Company:     golden-soft.com Inc.
 *
 * @author: liuhao
 * @version: 1.0
 * Create at:   2017-12-8 17:32
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2017-12-8      liuhao      1.0         1.0 Version
 */
@Controller
@RequestMapping("/")
public class MainController {
    private final Logger logger = Logger.getLogger(MainController.class);
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        logger.info("hell world");
        return "Hello World";
    }
}
