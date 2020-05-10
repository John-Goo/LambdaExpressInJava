package com.training.lambda.stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 演示stream collect数据集合转换
 */
public class StreamCollectDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "C++","php","java");
       /* 使用collect 转换成字符串，使用特殊字符分割*/
        String str= list.stream().collect(Collectors.joining(","));
        System.out.println(str);
        LinkedList linkedList = list.stream().collect(Collectors.toCollection(new Supplier<LinkedList>() {
                @Override
            public LinkedList get() {
                return new LinkedList<String>();
            }
        }));
        System.out.println(" 匿名内部实现 转换成linkedlist");
        linkedList.forEach(x-> System.out.println(x));
        LinkedList linkedList1 = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(" lambda表达式实现 转换成linkedlist");
        linkedList1.forEach(x-> System.out.println(x));

        TreeSet treeSet = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(" lambda表达式实现 转换成treeSet");
        treeSet.forEach(x-> System.out.println(x));


    }
}
