package org.thread.service;

import org.thread.domain.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生
     */
    public List<Student> selectStudent();
}
