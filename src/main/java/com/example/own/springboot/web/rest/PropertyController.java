package com.example.own.springboot.web.rest;

import com.example.own.springboot.configuration.PropertyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zaney
 * @describe  配置文件属性获取测试
 * @since 2018/9/6
 **/
@RestController
public class PropertyController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private Environment env;

    @Autowired
    private PropertyConfig propertyConfig;

    @GetMapping("/sboot/property")
    public void getPropertyByValue(){
        System.out.println("该服务端口为：" + port);
    }

    @GetMapping("/sboot/env")
    public void getPropertyByEnv(){
        String port = env.getProperty("server.port");
        System.out.println("该服务端口为：" + port);
    }

    @GetMapping("/sboot/custom")
    public void getPropertyByCustom(){
        System.out.println("自定义名称为：" + propertyConfig.getName());
    }

}
