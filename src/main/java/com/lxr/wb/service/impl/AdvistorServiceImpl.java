package com.lxr.wb.service.impl;

import com.lxr.wb.domain.Advistor;
import com.lxr.wb.repository.AdvistorRepository;
import com.lxr.wb.service.AdvistorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * impl
 *
 * @author lxr
 * @create 2017-12-26 10:58
 **/
@Service
public class AdvistorServiceImpl implements AdvistorService {

    @Autowired
    private AdvistorRepository advistorRepository;

    @Override
    public Advistor save(Advistor advistor) {
        return advistorRepository.save(advistor);
    }
}
