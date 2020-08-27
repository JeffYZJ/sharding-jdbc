package com.jeff.sharding.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeff.sharding.entity.Student;
import com.jeff.sharding.mapper.StudentMapper;
import com.jeff.sharding.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    public StudentMapper studentMapper;

    @Override
    public boolean insert(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }

}  