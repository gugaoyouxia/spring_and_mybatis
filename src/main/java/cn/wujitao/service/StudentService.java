package cn.wujitao.service;

import cn.wujitao.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    List<Student> queryStudent();
}
