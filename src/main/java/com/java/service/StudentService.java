package com.java.service;

import com.java.entity.Student;

import java.util.List;

public interface StudentService {

    // 查所有
    public List<Student> findAll();

    //修改
    public int updateStu(Student student);

    //增加
    public int addStu(Student student);

    //删除
    public int deleteStu(Student student);

    // 查单条
    public Student findOne(Student student);
}
