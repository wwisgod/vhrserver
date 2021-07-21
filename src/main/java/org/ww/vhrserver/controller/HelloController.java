package org.ww.vhrserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ww
 * @Date 2021/7/19 11:47
 */
@RestController
public class HelloController {
    @GetMapping("/employee/basic/hello")
    public String hello() {
        return "/employee/basic/hello";
    }
    @GetMapping("/employee/advanced/hello")
    public String hello2() {
        return "/employee/advanced/hello";
    }
}
