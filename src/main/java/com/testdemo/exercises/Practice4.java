package com.testdemo.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            split(str);
        }

    }
    public static void split(String str){
        String str1 = str;
        String[] strarr;
        int count = 1;
        int count1 = 0;
        while(str.length()>=8){
            count++;
            String splitStr = str.substring(0,8);
            str = str.substring(8,str.length());
            System.out.println(splitStr);
        }
        strarr = new String[count];
        while(str1.length()>=8){
            count1++;
            String splitStr1 = str1.substring(0,8);
            str1 = str1.substring(8,str1.length());
            strarr[count1-1]=splitStr1;
        }
        if(str.length()<8&&str.length()>0){
            String splitStr = str+"00000000";
            splitStr = splitStr.substring(0,8);
            System.out.println(splitStr);
            strarr[count1] = splitStr;

        }
        System.out.println(Arrays.toString(strarr));
    }

}
