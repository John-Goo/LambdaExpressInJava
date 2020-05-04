package com.training.lambda.syntax;

public class LambdaDemo {

	public static void main(String[] args) {
		/**
		 * Java匿名类的实现方式（1）
		 */
		MyInterface intf1 = new MyInterface() {
			@Override
			public void f1() {
				System.out.println("==>Java匿名类的实现方式（1）.");
			}
		};
		intf1.f1();

		/**
		 * lambad函数表达式的实现方式（2）
		 */
		MyInterface intf2 = ()->{
			System.out.println("==>lambad函数表达式的实现方式（2）.");
		};
		intf2.f1();
	}

}

interface MyInterface{
	/**
	 * f1()方法接口
	 */
	public void f1();
}
