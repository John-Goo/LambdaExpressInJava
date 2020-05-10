package com.training.lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 演示Stream skip、limit方法使用
 */
public class StreamSkipLimitDemo {
    public static void main(String[] args) {
       // List<String> list = Arrays.asList("java", "python", "C++","php","java");
        List<String> list = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k");
        /*skip方法使用*/
       // list.stream().skip(3).forEach(x-> System.out.println(x));
        /*limit方法使用*/
        //list.stream().limit(4).forEach(x-> System.out.println(x));

        /*
        * 使用skip与limit方法组合，实现内存分页的效果
        * */
        int skip =0;
        final int _LIMIT = 3;
        for (int i = 0; i <4; i++) {
            skip = i*_LIMIT;
            list.stream().skip(skip).limit(_LIMIT).forEach(x-> System.out.println(x));
            System.out.println("============================");
        }

    }
}
