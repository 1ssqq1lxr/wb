package com.lxr.wb.service.impl;

import com.lxr.wb.domain.LeaveMessage;
import com.lxr.wb.repository.LeaveRepository;
import com.lxr.wb.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 预约impl
 *
 * @author lxr
 * @create 2017-12-27 17:40
 **/
@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveRepository leaveRepository;

    @Override
    public long save(LeaveMessage leaveMessage) {
        return leaveRepository.save(leaveMessage)==null?0:1;
    }
}
