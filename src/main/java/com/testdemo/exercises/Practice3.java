package com.testdemo.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @description:
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 *
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 * 当没有新的输入时，说明输入结束。
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice3 {
    public static int[] Test(int[] a){
        int [] b =new int [1001];
        for (int i =0;i<1001;i++){
            b[i] = 0;
        }
        int len = a.length;
        for (int i =0;i<len;i++)
        {
            b[a[i]] = 1;
        }
        return b;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println("n="+n);
            int[] a =new int [n];
            for (int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(a));
            int[] c = Test(a);
            int len = c.length;
            for (int i =0;i<len;i++){
                if(c[i] == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
