package com.jeff.sharding.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jeff.sharding.entity.Student;
import com.jeff.sharding.entity.User;
import com.jeff.sharding.mapper.StudentMapper;
import com.jeff.sharding.mapper.UserMapper;
import com.jeff.sharding.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    public UserMapper userMapper;

    @Resource
    public StudentMapper studentMapper;

    @Override
    public boolean insert(User u) {
        return userMapper.insert(u) > 0 ? true :false;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    @Override
    public List<User> findByUserIds(List<Integer> ids) {
        return userMapper.findByUserIds(ids);
    }
    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void transactionTestSucess() {
        User u = new User();
        u.setUserId(13);
        u.setAge(25);
        u.setName("war3 1.27");
        userMapper.insert(u);

        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe");
        studentMapper.insert(student);
    }
    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void transactionTestFailure() throws IllegalAccessException {
        User u = new User();
        u.setUserId(13);
        u.setAge(25);
        u.setName("war3 1.27 good");
        userMapper.insert(u);

        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe1");
        studentMapper.insert(student);
        throw new IllegalAccessException();
    }

}  