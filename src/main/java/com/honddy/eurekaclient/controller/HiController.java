package com.honddy.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @program: SpringCloudSuite
 * @description:
 * @author: lipeng
 * @create: 2018-04-13 16:27
 **/
@RestController
public class HiController
{
    @GetMapping("/name")
    public String hiGreet(@RequestParam("name") String name)
    {
       return MessageFormat.format("Hi,{0},Hello World!",name);
    }
}
