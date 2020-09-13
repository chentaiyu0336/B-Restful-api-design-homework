package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class studentController {
    private final StudentService studentService;

    public studentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }

    @GetMapping("/students/genders/{gender}")
    public List<Student> getStudentListByGender(@PathVariable String gender) {
        return studentService.getStudentListByGender(gender);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudentInfo(@PathVariable Integer id, @RequestBody Student student) {
        studentService.updateStudentInfo(id, student);
    }
}
