package com.lxr.wb.controller;

import com.lxr.wb.domain.Advistor;
import com.lxr.wb.service.AdvistorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 流量监听
 *
 * @author lxr
 * @create 2017-12-25 13:37
 **/
@Component
@WebListener
public class WbSessionListener implements HttpSessionListener {

    @Autowired
    AdvistorService advistorService;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        Advistor advisto  = new Advistor();
        advisto.setIp("127.0.0.1");
        advisto.setTime("2017-12-26 23:15:15");
        Advistor save = advistorService.save(advisto);
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("session create:"+session.getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("session :"+session.getId());
    }
}
