package com.testdemo.exercises;

import java.util.Scanner;

/**
 * @description:写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String cha = scanner.nextLine();
        char[] charr = str.toCharArray();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if (cha.equalsIgnoreCase(String.valueOf(charr[i]))){
                count++;
            }
        }
        System.out.println(count);
    }

}
