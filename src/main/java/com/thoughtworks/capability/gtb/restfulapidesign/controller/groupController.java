package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.service.GroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class groupController {
    private final GroupService groupService;

    public groupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/groups")
    public List<Group> divideGroup() {
        return groupService.divideGroup();
    }
}
