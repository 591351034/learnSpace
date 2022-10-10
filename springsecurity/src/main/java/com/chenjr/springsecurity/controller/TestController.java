package com.chenjr.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>
 * ClassName: TestController
 * date: 2022/10/10 16:39
 *
 * @author chenjr
 */
@RestController
@ResponseBody
public class TestController {

    @GetMapping("index")
    public String index(){
        return "hello security";
    }

}
