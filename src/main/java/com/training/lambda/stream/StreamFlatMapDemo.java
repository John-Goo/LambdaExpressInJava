/******************************************************************************
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: StreamFlatMapDemo
 * @version 1.0
 * @Desc: 演示flatMap集合使用
 * @author John Goo
 * @date 2020年5月2日
 * @history v1.0
 *
 */
public class StreamFlatMapDemo {
	public static void main(String[] args) {
		/*
		 * 创建数据集
		 */
		List<Integer> a = Arrays.asList(1,2,3);
		List<Integer> b = Arrays.asList(4,5,6);
		// a和b拼接成二维数组
		List<List<Integer>> list = Stream.of(a,b).collect(Collectors.toList());
		// Stream<List<Integer>> ==> Stream<Integer>
		/**
		 * 匿名内部类的实现方式
		 */
		Stream<Integer> stream1 = list.parallelStream().flatMap(new Function<List<Integer>, Stream<? extends Integer>>() {
			@Override
			public Stream<? extends Integer> apply(List<Integer> t) {
				// Stream<Integer>
				return t.stream();
			}
		});
		System.out.println("#########匿名内部类的实现方式 #######");
		stream1.forEach(x->System.out.println(x));
		/**
		 * lambda表达式的实现方式
		 */
		System.out.println("#########lambda表达式的实现方式 #######");
		Stream<Integer> stream2 = list.parallelStream().flatMap((List<Integer> t)->{
			// Stream<Integer>
			return t.stream();
		});
		stream2.forEach(x->System.out.println(x));
	}
}
