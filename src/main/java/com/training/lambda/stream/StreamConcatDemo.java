package com.training.lambda.stream;

import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 演示Stream concat方法使用
 */
public class StreamConcatDemo {

    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student(1L,"张三",45,"深圳"),
                new Student(2L,"李四",21,"上海"),
                new Student(3L,"王二",22,"北京"),
                new Student(4L,"麻子",12,"武汉")
        );
        List<Student> list2 = Arrays.asList(
                new Student(5L,"张三1",45,"深圳1"),
                new Student(6L,"李四1",21,"上海1"),
                new Student(7L,"王二1",22,"北京1"),
                new Student(8L,"麻子1",12,"武汉1")
        );
        List<Student> list3 = Arrays.asList(
                new Student(9L,"张三2",45,"深圳2"),
                new Student(10L,"李四2",21,"上海2"),
                new Student(11L,"王二2",22,"北京2"),
                new Student(12L,"麻子2",12,"武汉2")
        );
        List[] arrays = {list1,list2,list3};
        Stream<Student> studentStream3 = Stream.<Student>builder().build();
        for (List list:arrays){
            studentStream3 = Stream.concat(studentStream3,list.stream());
        }

      //  Stream<Student> studentStream =Stream.concat(list1.stream(),list2.stream());
        // 复用已经拼接好的数据流
      //  Stream<Student> studentStream2 =Stream.concat(studentStream,list3.stream());
        studentStream3.forEach(x-> System.out.println(x));
    }
}
