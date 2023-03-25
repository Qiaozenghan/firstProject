package com.example.demo;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);
        list.stream().filter((e) -> { return StringUtils.isBlank(e);}).collect(Collectors.toList());
    }

}
