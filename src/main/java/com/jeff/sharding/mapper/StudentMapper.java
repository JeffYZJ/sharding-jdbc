package com.jeff.sharding.mapper;

import java.util.List;
import com.jeff.sharding.entity.Student;

/**
 * 处理学生的数据操作接口
 * @author jeff
 *
 */
public interface StudentMapper {

    Integer insert(Student s);

    List<Student> findAll();

    List<Student> findByStudentIds(List<Integer> studentIds);

}