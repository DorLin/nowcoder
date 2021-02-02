package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice5 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            System.out.println(Integer.decode(str));
        }
    }
}
