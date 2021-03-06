package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.repository.GroupRepository;
import com.thoughtworks.capability.gtb.restfulapidesign.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;
    private final StudentRepository studentRepository;

    public GroupService(GroupRepository groupRepository, StudentRepository studentRepository) {
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
    }

    public List<Group> divideGroup() {
        return groupRepository.divide(studentRepository.getStudentList());
    }

    public List<Group> getGroup() {
        return groupRepository.getGroup();
    }

    public List<Group> updateGroupName(Integer id, String name) {
        return groupRepository.updateGroupName(id, name);
    }

    public Group findGroupById(Integer id) {
        return groupRepository.searchGroupById(id);
    }
}
