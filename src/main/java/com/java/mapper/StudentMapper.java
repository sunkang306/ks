package com.java.mapper;
import com.java.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentMapper {
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
