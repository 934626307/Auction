package com.example.demo.service.Impl;

import com.example.demo.dao.testDao;
import com.example.demo.entity.test;
import com.example.demo.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {

    @Autowired
    private testDao testDao;

    @Override
    public List<test> getTest() {
        return testDao.getTest();
    }
}
