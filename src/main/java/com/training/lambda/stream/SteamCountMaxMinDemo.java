package com.training.lambda.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * 演示Stream 方法函数count、max及min
 */
public class SteamCountMaxMinDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,23,34,56,1000,45,78);
        /*
        * Stream count方法使用
        * */
        Long count = list.stream().count();
        System.out.println("集合统计数量："+count);

        /*
         * Stream min方法使用
         * */
        Optional<Integer> opt1 = list.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Integer minVal = opt1.get();
        System.out.println("集合中最小值min："+minVal);
        /*
         * Stream max方法使用
         * */
        Optional<Integer> opt2 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Integer maxVal2 = opt2.get();
        System.out.println("集合中最大值max："+maxVal2);

        /*
         * Stream min方法使用,lambda表达式
         * */
        Optional<Integer> opt3 = list.stream().min((o1,o2)->o1.compareTo(o2));
        Integer minVal3 = opt3.get();
        System.out.println("lambda-->集合中最小值min："+minVal3);
        /*
         * Stream max方法使用，,lambda表达式
         * */
        Optional<Integer> opt4 = list.stream().max((o1,o2)->o1.compareTo(o2));
        Integer maxVal4 = opt4.get();
        System.out.println("lambda-->集合中最大值max："+maxVal4);
    }
}
