package com.project.jpp.ptool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @project: my_idea_workspace
 * @package: com.project.jpp.ptool.controller
 * @auther: jpp
 * @date: 2021/7/12 14:20
 * @Description: diyige
 */
@Controller
public class FirstController {
    @RequestMapping("/")
    @ResponseBody
    public String first(){
        return "hello word !";
    }
}
