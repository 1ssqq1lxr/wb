package com.lxr.wb.service;/**
 * Created by wangcy on 2017/12/27.
 */

import com.lxr.wb.domain.LeaveMessage;

/**
 * 预约
 *
 * @author lxr
 * @create 2017-12-27 17:39
 **/
public interface LeaveService {
    long save(LeaveMessage leaveMessage);
}
