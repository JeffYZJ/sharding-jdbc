package com.jeff.sharding.service;

import java.util.List;
import com.jeff.sharding.entity.User;

/**
 * 处理用户的Service
 * @author jeff
 *
 */
public interface UserService {

    public boolean insert(User u);

    public List<User> findAll();

    public List<User> findByUserIds(List<Integer> ids);

    public void transactionTestSucess();

    public void transactionTestFailure() throws IllegalAccessException;

}  