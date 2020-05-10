package com.training.lambda.stream;

import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 构造数据集
         * */
        List<Student> list = Arrays.asList(
                new Student(1L, "张三", 42, "上海"),
                new Student(2L, "李四", 21, "上海"),
                new Student(3L, "王二", 56, "上海"),
                new Student(4L, "麻子", 19, "上海")
        );
        /*
         * 匿名内部类实现Stream sort方法
         * */
        System.out.println("==========匿名内部类实现Stream sort方法=========");
        list.stream().sorted(Comparator.comparing(new Function<Student, Integer>() {
            @Override
            public Integer apply(Student student) {
                return student.getAge();
            }
        }).reversed()).forEach(x -> System.out.println(x));

        /*
         * lambda表达式实现Stream sort方法
         * */
        System.out.println("========== lambda表达式实现Stream sort方法 =========");
        list.stream().sorted(Comparator.comparing((Student s) -> s.getAge()).reversed()).forEach(x -> System.out.println(x));

    }
}
