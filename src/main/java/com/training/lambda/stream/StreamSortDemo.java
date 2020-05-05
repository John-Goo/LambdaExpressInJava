package com.training.lambda.stream;

import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * 演示Stream Sort方法使用
 */
public class StreamSortDemo {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1L,"张三",45,"深圳"),
                new Student(2L,"李四",21,"深圳"),
                new Student(3L,"王二",22,"深圳"),
                new Student(4L,"麻子",12,"深圳")
        );
        /**
         * 匿名内部类实现方式
         */
        System.out.println("======匿名内部类实现方式 ==========");
        list.stream().sorted(Comparator.comparing(new Function<Student, Integer>() {
            @Override
            public Integer apply(Student student) {
                return student.getAge();
        }

        }).reversed()).forEach(x-> System.out.println(x));
        /**
         * lambda表达式实现的方式
         */
        System.out.println("====== lambda表达式实现的方式 ==========");
        list.stream().sorted(Comparator.comparing((Student s)->s.getAge()).reversed()).forEach(x-> System.out.println(x));

    }

}
