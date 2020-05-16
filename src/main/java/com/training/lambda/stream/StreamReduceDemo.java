package com.training.lambda.stream;

import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * 演示Stream reduce方法使用
 */
public class StreamReduceDemo {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1L,"张三",45,"深圳"),
                new Student(2L,"李四",21,"上海"),
                new Student(3L,"王二",22,"北京"),
                new Student(4L,"麻子",12,"武汉")
        );

       Integer ageSum =  list.stream().map(Student::getAge).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer s1, Integer s2) {
                System.out.println("s1:"+s1+",s2:"+s2);
                return s1+s2;
            }
        }).get();
        System.out.println(ageSum);

        /*
        * lambda表达式实现stream reduce方法
        * */
        Integer ageSum2 =  list.stream().map(Student::getAge).reduce((s1,s2)->s1+s2).get();
        System.out.println("lambda表达式实现stream reduce方法:"+ageSum2);
    }
}
