package com.lxr.wb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

/**
 * 入口
 *
 * @author lxr
 * @create 2017-12-25 13:03
 **/
@Controller
public class WbController {


    @GetMapping("/{path}")
    public String dataView(@PathVariable("path") String path, HttpSession httpSession) {
        httpSession.setAttribute("view",1);
        return path;
    }
}
