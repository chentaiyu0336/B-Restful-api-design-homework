package com.thoughtworks.capability.gtb.restfulapidesign.repository;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class GroupRepository {
    List<Group> groupList = new ArrayList<>();

    {
        groupList.add(new Group(1, "Team1", null, new ArrayList<>()));
        groupList.add(new Group(2, "Team2", null, new ArrayList<>()));
        groupList.add(new Group(3, "Team3", null, new ArrayList<>()));
        groupList.add(new Group(4, "Team4", null, new ArrayList<>()));
        groupList.add(new Group(5, "Team5", null, new ArrayList<>()));
        groupList.add(new Group(6, "Team6", null, new ArrayList<>()));
    }

    public List<Group> divide(List<Student> studentList) {
        Collections.shuffle(studentList);
        int index = 0;
        for (Student student : studentList) {
            groupList.get(index % 6).getStudentList().add(student);
            index++;
        }
        return groupList;
    }
}
