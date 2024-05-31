package com.lchz.simple.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichengzhi
 * @date 2024/5/30-17:13
 */
@RestController
@RequestMapping("/sd")
@Slf4j
public class simpleDepController {

    @GetMapping("/simpleDepMethod")
    public String simpleDepMethod(){
        log.info("into method simpleDepMethod!");
        return "this is simpleDepMethod return value !";
    }
}
