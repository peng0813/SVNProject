package com.svn.group1.pojo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xu zhong ran
 * 2021/4/20 13:29
 */
public class StudentTest {

    @Test
    public void createStudentTest(){
        Student student=new Student();
        student.setName("xuzhongran");
        student.setAge(25);
        student.setGender("男");
        student.setClassName("t173");
        student.setGroup("第一组");
        student.setGroupMember(Arrays.asList("xzr","wrj","pda","pjl","zlt","wb"));
        System.out.println(student);
    }
}