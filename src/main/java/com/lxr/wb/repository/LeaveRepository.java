package com.lxr.wb.repository;/**
 * Created by wangcy on 2017/12/26.
 */

import com.lxr.wb.domain.LeaveMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 访客记录
 *
 * @author lxr
 * @create 2017-12-26 10:51
 **/
public interface LeaveRepository extends JpaRepository<LeaveMessage,Long>{
}
