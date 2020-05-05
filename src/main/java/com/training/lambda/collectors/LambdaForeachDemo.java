/******************************************************************************
 * Copyright (C) 2020  ShenZhen X Co.,Ltd
 * All Rights Reserved.
 * 本软件为X开源公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.training.lambda.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: LambdaForeachDemo
 * @Desc: lambda表达式遍历集合forEach
 * @date 2020年4月30日
 * @history v1.0
 */
public class LambdaForeachDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("张三", "李四", "王二", "麻子");
        /**
         * 普通的方法遍历
         */
        System.out.println("======普通的方法遍历集合（1）==== ");
        for (String str : list) {
            System.out.println(str);
        }
        /**
         * lambda表达式遍历集合
         */
        System.out.println("======匿名内部类的遍历集合（2）==== ");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        System.out.println("======lambda表达式的遍历集合（3）==== ");
        list.forEach((String t) -> {
            System.out.println(t);
        });
        System.out.println("======lambda表达式(简化)的遍历集合（4）==== ");
        list.forEach(t -> System.out.println(t));
    }

}
