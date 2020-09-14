package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentList(String gender) {
        if (gender == null)
            return studentRepository.getStudentList();
        else
            return studentRepository.filterStudentsByGender(gender);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.searchStudentById(id);
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void deleteStudentById(Integer id) {
        studentRepository.deleteStudentById(id);
    }

    public void updateStudentInfo(Integer id, Student student) {
        studentRepository.updateStudentInfo(id, student);
    }
}
