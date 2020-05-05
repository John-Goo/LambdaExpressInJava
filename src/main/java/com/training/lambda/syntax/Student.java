package com.training.lambda.syntax;

import java.util.Arrays;
import java.util.List;

public class Student {
    // 学生ID
    private Long id;
    // 姓名
    private String name;
    // 学生年龄
    private Integer age;
    // 学生地址
    private String addr;

    public Student(Long id, String name, Integer age, String addr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void show(){
        List<Student> list = Arrays.asList(
                new Student(1L,"张三",45,"深圳"),
                new Student(2L,"李四",21,"深圳"),
                new Student(3L,"王二",22,"深圳"),
                new Student(4L,"麻子",12,"深圳")
        );
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
