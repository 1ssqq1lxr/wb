package com.lxr.wb.repository;/**
 * Created by wangcy on 2017/12/26.
 */

import com.lxr.wb.domain.Advistor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * 访客记录
 *
 * @author lxr
 * @create 2017-12-26 10:51
 **/
@SuppressWarnings("unused")
@Component
public interface AdvistorRepository extends JpaRepository<Advistor,Long>{
}
