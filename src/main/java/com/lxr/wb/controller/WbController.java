package com.lxr.wb.controller;

import com.lxr.wb.domain.LeaveMessage;
import com.lxr.wb.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 入口
 *
 * @author lxr
 * @create 2017-12-25 13:03
 **/
@Controller
public class WbController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping("/leave")
    public    Map<String,Object> yuyue(LeaveMessage leaveMessage){
        Map<String,Object> map= new HashMap<>();
        if(leaveService.save(leaveMessage)>0){
            map.put("status",100);
        }
        else{
            map.put("status",500);
            map.put("message","当前系统忙，请稍后再试");
        }
        return map;
    }

    @GetMapping("/{path}")
    public String dataView(@PathVariable("path") String path, HttpSession httpSession) {
        return path;
    }
}
