package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/groups")
public class groupController {
    private final GroupService groupService;

    public groupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("")
    public List<Group> divideGroup() {
        return groupService.divideGroup();
    }

    @GetMapping("")
    public List<Group> getGroup() {
        return groupService.getGroup();
    }

    @PatchMapping("/{id}/{name}")
    public List<Group> updateGroupName(@PathVariable Integer id, @PathVariable String name) {
        return groupService.updateGroupName(id, name);
    }

    @GetMapping("/{id}")
    public Group findGroupById(@PathVariable Integer id) {
        return groupService.findGroupById(id);
    }
}
