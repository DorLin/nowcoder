package com.testdemo.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice9 {
    public static void main(String[] args) {


        //方法一
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()){
            String stre ="";
            int num = sca.nextInt();
            if (num%10 == 0){
                System.out.println("请重新输入int数值，位数不能为0");
                continue;
            }
            String str = String.valueOf(num);
            int[] inar = new int[(num+"").length()];
            for (int i = 0; i < inar.length; i++) {
               inar[i]=num%10;
               num =num/10;
            }
            for (int i = 0;i<inar.length;i++){
                if (!stre.contains(inar[i]+"")){
                    stre = stre+inar[i];
                }

            }
            System.out.println(Integer.parseInt(stre));
        }
    }

    /*
    //方法二
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] chars= (num+"").toCharArray();
        String str ="";
        for(int i= chars.length-1; i>= 0;i--){
            if(!str.contains(chars[i]+"")){
                str +=chars[i];
            }
        }
        System.out.println(Integer.valueOf(str));
    }
     */
}
