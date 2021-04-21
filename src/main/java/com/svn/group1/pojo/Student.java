package com.svn.group1.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *组员
 * Created by xu zhong ran
 * 2021/4/20 13:25
 */
@Data
public class Student implements Serializable {

    private String name; //姓名
    private Integer age; //年龄
    private String gender;//性别
    private String className;//班级
    private String group; //组名
    private List<String> groupMember; //组员
}
