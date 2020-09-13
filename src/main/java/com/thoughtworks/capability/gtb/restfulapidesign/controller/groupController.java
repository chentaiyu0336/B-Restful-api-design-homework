package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.service.GroupService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/groups")
    public List<Group> getGroup() {
        return groupService.getGroup();
    }

    @PatchMapping("/groups/{id}/{name}")
    public List<Group> updateGroupName(@PathVariable Integer id, @PathVariable String name) {
        return groupService.updateGroupName(id, name);
    }
}
