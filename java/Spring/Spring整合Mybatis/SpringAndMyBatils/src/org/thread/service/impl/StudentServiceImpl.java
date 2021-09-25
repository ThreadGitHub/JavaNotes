package org.thread.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thread.domain.Student;
import org.thread.mapper.StudentMapper;
import org.thread.service.StudentService;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStudent() {
        return studentMapper.selectStudent();
    }
}
