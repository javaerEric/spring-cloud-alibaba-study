package com.lema.study.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : duozl
 * @date : 2019/3/15 17:23
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value(value = "${user.name}")
    private String name;

    @Value(value = "${user.age}")
    private String age;

    @RequestMapping(value = "/config")
    public String show() {
        return "hello " + name + ", you are " + age + " years old!";
    }
}
