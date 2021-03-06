package com.thoughtworks.capability.gtb.restfulapidesign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    private Integer id;
    private String name;
    private String note;
    List<Student> studentList;
}
