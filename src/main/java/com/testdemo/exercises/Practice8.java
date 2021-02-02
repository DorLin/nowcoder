package com.testdemo.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @description:题目描述
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * @author: linwengang
 * @createDate: 2021/2/2
 * @version: 1.0
 */
public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int next = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for (int i = 0; i < next; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }
            }
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                System.out.println(integerIntegerEntry.getKey()+" "+integerIntegerEntry.getValue());
            }
        }
    }
}
