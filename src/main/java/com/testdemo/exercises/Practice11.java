package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String strstat = "";
            int num = sc.nextInt();
            String str = String.valueOf(num);
            char[] chars = str.toCharArray();
            for (int i = chars.length-1; i >=0 ; i--) {
                strstat = strstat+chars[i];
            }
            System.out.println(strstat);
        }
    }
}
