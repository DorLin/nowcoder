package com.testdemo.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:题目描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，
 * 并将最终输入结果输出到输出文件里面。
 *
 * 输入：
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * 坐标之间以;分隔。
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 * 下面是一个简单的例子 如：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 *
 * 处理过程：
 * 起点（0,0）
 * +   A10   =  （-10,0）
 * +   S20   =  (-10,-20)
 * +   W10  =  (-10,-10)
 * +   D30  =  (20,-10)
 * +   x    =  无效
 * +   A1A   =  无效
 * +   B10A11   =  无效
 * +  一个空 不影响
 * +   A10  =  (10,-10)
 * 结果 （10， -10）
 *
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice17 {
    static int[] ints = {0,0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            try {
                if (str.length()<=3 && "ADWS".contains(str.substring(0,1)) && (Integer.parseInt(str.substring(1,str.length()))<100 && Integer.parseInt(str.substring(1,str.length()))>=0)){
                    if (str.contains("A")){left(str);}
                    if (str.contains("D")){right(str);}
                    if (str.contains("W")){up(str);}
                    if (str.contains("S")){down(str);}
                }else {
                    System.out.println("格式有误，请重新输入，首字母必须大写ADWS开头，后加两位数字");
                }
            }catch (Exception e){
                System.out.println("格式有误，请重新输入，首字母必须大写ADWS开头，后加两位数字：例A30、D20、W10、S5");
            }
        }
    }

    public static void up(String str){
        String[] ca = str.split("W");
        ints[1]=ints[1]+Integer.parseInt(ca[1]);
        System.out.println(Arrays.toString(ints));
    }
    public static void down(String str){
        String[] ca = str.split("S");
        ints[1]=ints[1]-Integer.parseInt(ca[1]);
        System.out.println(Arrays.toString(ints));
    }
    public static void left(String str){
        String[] ca = str.split("A");
        ints[0]=ints[0]-Integer.parseInt(ca[1]);
        System.out.println(Arrays.toString(ints));
    }
    public static void right(String str){
        String[] ca = str.split("D");
        ints[0]=ints[0]+Integer.parseInt(ca[1]);
        System.out.println(Arrays.toString(ints));
    }

}
