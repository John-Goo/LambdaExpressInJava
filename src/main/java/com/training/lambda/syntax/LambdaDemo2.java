package com.training.lambda.syntax;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: LambdaDemo
 * @Desc: lambda基础语法
 * @history v1.0
 */
public class LambdaDemo2 {

    public static void main(String[] args) {


        /*
         * 接口函数有1个参数，无返回值
         */
        MyInterface1 intf1 = () -> {
            System.out.println("==>Wellcome to study lambda expressions in Java.");
        };
        //intf1.f1();

        /**
         * 接口函数有1个参数，无返回值
         */
        MyInterface2 intf2 = (int a) -> {
            System.out.println("==> lambda 接收参数：" + a);
        };
        //intf2.f1(88);

        /*
         * 接口函数有2个参数，有返回值
         */
        MyInterface3 intf3 = (int a, int b) -> {
            System.out.println("==> lambda 接收参数：" + a + "," + b);
            int sum = a + b;
            return sum;
        };
        //int sum =intf3.f1(2,3);
        //System.out.println("[intf3] sum="+sum);
        /*
         * 接口函数无参数，有返回值
         */
        MyInterface4 intf4 = () -> {
            System.out.println("==>Wellcome to study lambda expressions in Java.");
            return 888;
        };
        //int result =intf4.f1();
        //System.out.println("[intf4] result="+result);

        /*
         * 接口函数有2个参数，有返回值
         */
        MyInterface5 intf5 = (int a) -> {
            System.out.println("==> lambda 接收参数：" + a);
            return a;
        };
        int result1 = intf5.f1(3);
        System.out.println("[intf5] result1=" + result1);
    }

}

interface MyInterface5 {
    public int f1(int a);
}


interface MyInterface4 {
    public int f1();
}

interface MyInterface3 {
    public int f1(int a, int b);
}

interface MyInterface2 {
    public void f1(int a);
}


interface MyInterface1 {
    public void f1();
}
