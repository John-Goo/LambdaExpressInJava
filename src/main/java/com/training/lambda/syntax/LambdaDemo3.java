/******************************************************************************
 * Copyright (C) 2020  ShenZhen X Co.,Ltd
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.syntax;

/**
 * @ClassName: LambdaDemo
 * @version 1.0
 * @Desc: lambda基础语法
 * @author John Goo
 * @date 2020年4月24日上午10:57:51
 * @history v1.0
 *
 */
public class LambdaDemo3 {

	public static void main(String[] args) {


		/**
		 * 接口函数有1个参数，无返回值
		 */
		// 方法实现只有一条语句的情况下
		MyInterface1 intf1 = ()->System.out.println("==>Wellcome to study lambda expressions in Java.");
		//intf1.f1();

		/**
		 * 接口函数有1个参数，无返回值
		 */
		MyInterface2 intf2 = a->System.out.println("==> lambda 接收参数："+a);
		//intf2.f1(88);

		/**
		 * 接口函数有2个参数，有返回值
		 */
		MyInterface3 intf3 = (a,b)->{
			System.out.println("==> lambda 接收参数："+a+","+b);
			int sum = a+b;
			return sum;
		};
		int sum =intf3.f1(2,3);
		System.out.println("[intf3] sum="+sum);
		/**
		 * 接口函数无参数，有返回值
		 */
		MyInterface4 intf4 = ()->888;

		//int result =intf4.f1();
		//System.out.println("[intf4] result="+result);

		/**
		 * 接口函数有2个参数，有返回值
		 */
		MyInterface5 intf5 = a->a;
		int result1 =intf5.f1(3);
		System.out.println("[intf5] result1="+result1);
	}

}

