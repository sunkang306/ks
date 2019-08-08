package com.java.controller;
import com.java.entity.Student;
import com.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
//    查所有
    @RequestMapping("/index")
    public String findAll(Model model){
        model.addAttribute("stu",studentService.findAll());
        return "index";
    }
//   删除
    @RequestMapping("/delete")
    public String delete(Student student,Model model){
       int count = studentService.deleteStu(student);
         model.addAttribute("stu",studentService.findAll());
       return "index";
    }

//   添加
    @RequestMapping("/add")
    public String add(Student student,Model model){
        int count = studentService.addStu(student);
        model.addAttribute("stu",studentService.findAll());
        return "index";
    }

//     查单条
    @RequestMapping("/findone")
    public String findone(Student student,Model model){
        Student s  = studentService.findOne(student);
        model.addAttribute("s",s);
        System.out.println(s);
        return "update";
    }


    //     修改
    @RequestMapping("/xg")
    public String update(Student student,Model model){
        int count = studentService.updateStu(student);
        model.addAttribute("stu",studentService.findAll());
        return "index";
    }
}
