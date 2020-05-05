/******************************************************************************
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.stream;


import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/**
 * @ClassName: StreamMapDemo
 * @version 1.0
 * @Desc: 演示Stream Map方法
 * @author John Goo
 * @history v1.0
 *
 */
public class StreamMapDemo {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(1L,"张三",45,"深圳"),
				new Student(2L,"李四",21,"深圳"),
				new Student(3L,"王二",22,"深圳"),
				new Student(4L,"麻子",12,"深圳")
		);
		// 转换Stream<List<Student>> ==>Stream<String>
		/**
		 *  匿名内部类实现map方法
		 */
		System.out.println("====匿名内部类实现map方法== ");
		list.parallelStream().map(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		}).forEach(x->System.out.println(x));
		/**
		 *  lambda表达式实现map方法
		 */
		System.out.println("====lambda表达式实现map方法 ==== ");
		list.parallelStream().map(t->{
			return t.getName();
		}).forEach(x->System.out.println(x));
	}

}
