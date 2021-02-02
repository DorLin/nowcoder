package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            float f = scanner.nextFloat();
            System.out.println(Math.round(f));
        }

    }

/*
    //方法二
    public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            //输入参数
            double a = in.nextDouble();
            //取整数部分
            int b = (int)a;
            //判断
            if((a - b) >= 0.5){
                b=(int)(a + 0.5);
            }
            System.out.println(b);
        }
    }
 */
}
