package org.thread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thread.domain.Student;
import org.thread.service.StudentService;
import java.util.List;

/**
 * @author Thread丶
 */
@Controller
public class HelloController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public List<Student> student(){
        List<Student> students = studentService.selectStudent();
        return students;
    }

}
