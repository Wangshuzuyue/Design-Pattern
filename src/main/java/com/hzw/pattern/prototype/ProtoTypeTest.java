package com.hzw.pattern.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 15:07
 * @Description:
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId("1");
        student1.setName("张三");
        student1.setAge(25);
        student1.setRegisterTime(new Date());
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Phython");
        courses.add("C++");
        student1.setCourseList(courses);

//        Student student2 = new Student();
//        student2.setId(new String(student1.getId()));
//        student2.setName(new String(student1.getName()));
//        student2.setAge(new Integer(student1.getAge()));
//        student2.setRegisterTime((Date)student1.getRegisterTime().clone());
//        student2.setCourseList(new ArrayList<>(student1.getCourseList()));
//        System.out.println(student1.getRegisterTime() == student2.getRegisterTime());

        Student student2 = (Student) student1.clone();
        System.out.println(student1.getRegisterTime() == student2.getRegisterTime());
        System.out.println(student1.getCourseList() == student2.getCourseList());
    }
}
