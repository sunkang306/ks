package com.java.service.impl;

import com.java.entity.Student;
import com.java.mapper.StudentMapper;
import com.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
      @Autowired
      private  StudentMapper studentMapper;

    // 查所有
    public List<Student> findAll() {

        return studentMapper.findAll();
    }

    //修改
    public int updateStu(Student student) {

        return studentMapper.updateStu(student);
    }

    //增加
    public int addStu(Student student)
    {
        return studentMapper.addStu(student);
    }

    //删除
    public int deleteStu(Student student)
    {
        return studentMapper.deleteStu(student);
    }
 // 查单条
    @Override
    public Student findOne(Student student) {
        return studentMapper.findOne(student);
    }
}
