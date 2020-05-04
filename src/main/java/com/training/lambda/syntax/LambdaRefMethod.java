/******************************************************************************
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.syntax;

/**
 * @ClassName: LambdaRefMethod
 * @version 1.0
 * @Desc: Lambda函数编程—表达式引用方法
 * @author John Goo
 * @history v1.0
 *
 */
public class LambdaRefMethod {

	public static void main(String[] args) {
		/**
		 * 静态方法——Lambda表达式引用（1）
		 */
		MyInterface7 intf7 = (int a,int b)->sum(a,b);
		int sum = intf7.f1(2, 3);
		System.out.println("[intf7] sum="+sum);
		MyInterface7 intf8 = LambdaRefMethod::sum;
		int sum1 = intf8.f1(2, 3);
		System.out.println("[intf8] sum1="+sum1);
		/**
		 * new 对象方法——Lambda表达式引用（1）
		 */
		LambdaRefMethod refM = new LambdaRefMethod();
		MyInterface9 intf9 = refM::sub;
		int result = intf9.f1(3, 2);
		System.out.println("[intf9] result="+result);

	}

	public static int sum(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}

}

interface MyInterface7{
	public int f1(int a,int b);
}

interface MyInterface9{
	public int f1(int a,int b);
}

