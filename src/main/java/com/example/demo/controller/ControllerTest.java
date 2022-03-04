package com.example.demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ControllerTest
 * @Description TODO
 * @Author qzh
 * @Date 2022/2/27 16:20
 * @Version 1.0
 **/
@RestController
public class ControllerTest {

    @RequestMapping("/demo1")
    public Map demo1(@RequestParam String param ){
        Map<String, Object> map = new HashMap<>();
        map.put("result", param);
        List<String> list = new ArrayList<>();
        return map;
    }
}
