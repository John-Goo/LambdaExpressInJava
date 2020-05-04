/******************************************************************************
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.syntax;

/**
 * @ClassName: LambdaThreadDemo
 * @version 1.0
 * @Desc: Lambda创建线程
 * @author John Goo
 * @history v1.0
 *
 */
public class LambdaThreadDemo {

	public static void main(String[] args) {
		/**
		 * Java匿名内部类实现一个线程
		 */
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(">>Java匿名内部类实现一个线程");
				System.out.println("===(2)===");

			}
		});
		t1.start();

		/**
		 * lambda表达式实现一个多线程
		 */
		Thread t2 = new Thread(()->{
			System.out.println(">>lambda表达式实现一个线程");
			System.out.println("===(2)===");
		});

		t2.start();
	}
}
