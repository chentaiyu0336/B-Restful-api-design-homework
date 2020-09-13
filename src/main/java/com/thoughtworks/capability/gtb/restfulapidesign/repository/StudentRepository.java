package com.thoughtworks.capability.gtb.restfulapidesign.repository;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    private static List<Student> studentList = new ArrayList<Student>();

    {
        studentList.add(new Student(1, "沈乐棋", "male", null));
        studentList.add(new Student(2, "徐慧慧", "female", null));
        studentList.add(new Student(3, "陈思聪", "male", null));
        studentList.add(new Student(4, "王江林", "male", null));
        studentList.add(new Student(5, "王登宇", "male", null));
        studentList.add(new Student(6, "杨思雨", "male", null));
        studentList.add(new Student(7, "江雨舟", "male", null));
        studentList.add(new Student(8, "廖燊", "male", null));
        studentList.add(new Student(9, "胡晓", "female", null));
        studentList.add(new Student(10, "但杰", "male", null));
        studentList.add(new Student(11, "盖迈达", "male", null));
        studentList.add(new Student(12, "肖美琦", "female", null));
        studentList.add(new Student(13, "黄云洁", "female", null));
        studentList.add(new Student(14, "齐瑾浩", "male", null));
        studentList.add(new Student(15, "刘亮亮", "male", null));
        studentList.add(new Student(16, "肖逸凡", "male", null));
        studentList.add(new Student(17, "王作文", "male", null));
        studentList.add(new Student(18, "郭瑞凌", "male", null));
        studentList.add(new Student(19, "李明豪", "male", null));
        studentList.add(new Student(20, "党泽", "male", null));
    }

    static Integer endId = 20;

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Student> filterStudentsByGender(String gender) {
        return studentList.stream().filter(student -> student.getGender().equals(gender)).collect(Collectors.toList());
    }

    public Student searchStudentById(Integer id) {
        if (id <= endId)
            return studentList.stream().filter(student -> student.getId() == id).findFirst().get();
        else
            return null;
    }

    public void addStudent(Student student) {
        endId++;
        student.setId(endId);
        studentList.add(student);
    }

    public void deleteStudentById(Integer id) {
        if (id <= endId)
            studentList.remove(id - 1);
    }

    public void updateStudentInfo(Integer id, Student student) {
        student.setId(id);
        studentList.set(id - 1, student);
    }
}
