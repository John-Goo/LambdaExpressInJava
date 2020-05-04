/******************************************************************************
 * Copyright (C) 2020  ShenZhen X Co.,Ltd
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.collectors;

import com.training.lambda.syntax.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName: LambdaStreamFilterDemo
 * @version 1.0
 * @Desc: 演示lambda表达式与Stream filter使用
 *
 * @author John Goo
 * @date 2020年4月30日
 * @history v1.0
 *
 */
public class LambdaStreamFilterDemo {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(1L, "张三", 21),
				new Student(2L, "李四", 18),
				new Student(2L, "王二", 40),
				new Student(2L, "麻子", 20)
		);
		System.out.println("=== 通过匿名类实现filter过滤的方法===");
		students.stream().filter(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getAge()>20;
			}
		}).forEach((s)->System.out.println(s));
		System.out.println("=== 通过lambda表达式实现filter过滤的方法===");
		students.stream().filter((t)->{
			return t.getAge()>20;
		}).forEach((s)->System.out.println(s));

		System.out.println("=== 通过lambda表达式(简化）实现filter过滤的方法===");
		students.stream().filter((t)->t.getAge()>20).forEach((s)->System.out.println(s));

	}

}
