package cn.wujitao.service.impl;

import cn.wujitao.dao.StudentDao;
import cn.wujitao.domain.Student;
import cn.wujitao.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int rows = studentDao.insertStudent(student);
        return rows;
    }
    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
