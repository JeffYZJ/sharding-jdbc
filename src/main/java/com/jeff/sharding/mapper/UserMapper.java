package com.jeff.sharding.mapper;

import java.util.List;
import com.jeff.sharding.entity.User;


/**
 * 处理用户的数据操作接口
 * @author jeff
 *
 */
public interface UserMapper {

    Integer insert(User u);

    List<User> findAll();

    List<User> findByUserIds(List<Integer> userIds);


}