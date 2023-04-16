package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CourseSelect {

    private Integer student_number;
    private String student_name;
    private String course;
    private int teacher_number;
    private String teacher_name;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updatetime;

}
