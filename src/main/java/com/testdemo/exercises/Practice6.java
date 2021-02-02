package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:题目描述（重点）
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            int num = scanner.nextInt();
//            for (int i=2;i<num;i++){
//                boolean count = false;
//                int mu = num%i;
//                if (mu==0){
//                    for (int m1 = 2;m1<i;m1++){
//                        int mu1 = i%m1;
//                        if (mu1 == 0){
//                            count=true;
//                        }
//                    }
//                    if (!count){
//                        System.out.print(i+" ");
//                    }
//                }
//            }
//        }
//    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long num = Long.parseLong(scan.next());
        getPrimer(num);
    }

    public static void getPrimer(long num){
        for (int i= 2;i <= num; i++){
//            System.out.println("i++=="+i);
//            System.out.println("num=="+num);
            if (num % i==0){
                System.out.print(i + " ");
                getPrimer(num/i);
                break;
            }
            if (i==num){
                System.out.print( i + "");
            }
        }
    }
}
