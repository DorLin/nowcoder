package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str= scanner.nextLine();
            //将字符串变成char数组再倒序输出
            char[] chars= str.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
