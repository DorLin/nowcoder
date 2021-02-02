package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] strarr = str.split("\\s");
            for (int i = strarr.length-1; i >=0 ; i--) {
                System.out.print(strarr[i]+" ");
            }
        }
    }
}
