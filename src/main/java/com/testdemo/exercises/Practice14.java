package com.testdemo.exercises;

import javafx.stage.Screen;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int num = sc.nextInt();
            String[] strarr = new String[num];
            for (int i = 0; i < num; i++) {
                String str = sc.next();
                strarr[i]=str;
            }

            Arrays.sort(strarr);
            System.out.println(Arrays.toString(strarr));
        }
    }
}
