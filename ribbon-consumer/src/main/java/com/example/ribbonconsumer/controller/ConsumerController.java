package com.example.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * Filename:    ConsumerController.java
 * Copyright:   Copyright (c) 2012-2017 All Rights Reserved.
 * Company:     golden-soft.com Inc.
 *
 * @author: liuhao
 * @version: 1.0
 * Create at:   2017-12-8 17:40
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2017-12-8      liuhao      1.0         1.0 Version
 */
@Controller
@RequestMapping("/")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon-consumer")
    public @ResponseBody String hellConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
