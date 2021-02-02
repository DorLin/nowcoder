package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            count ++;
            n = n & (n - 1);
        }
        System.out.println(count);
        scanner.close();
    }
}
