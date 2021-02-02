package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:计算字符串最后一个单词的长度，单词以空格隔开。
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] sar = str.split(" ");
        System.out.println(sar[sar.length-1]);
        System.out.println(sar[sar.length-1].length());
    }


}
