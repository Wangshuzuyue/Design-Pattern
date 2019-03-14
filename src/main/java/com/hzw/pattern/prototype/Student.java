package com.hzw.pattern.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 20:13
 * @Description:
 */
public class Student implements ProtoType, Serializable{

    private String id;

    private String name;

    private Integer age;

    private Date registerTime;

    private List<String> courseList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    @Override
    public ProtoType clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Student copy = (Student) ois.readObject();
            copy.setId(new String(this.getId()));
            copy.setName(new String(this.getName()));
            copy.setAge(new Integer(this.getAge()));
            copy.setRegisterTime((Date)this.getRegisterTime().clone());
            copy.setCourseList(new ArrayList<String>(this.getCourseList()));
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
