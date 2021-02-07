package com.testdemo.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:题目描述（未看懂）
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 *
 * 所有的IP地址划分为 A,B,C,D,E五类
 * A类地址1.0.0.0~126.255.255.255;
 * B类地址128.0.0.0~191.255.255.255;
 * C类地址192.0.0.0~223.255.255.255;
 * D类地址224.0.0.0~239.255.255.255；
 * E类地址240.0.0.0~255.255.255.255
 * 私网IP范围是：
 * 10.0.0.0～10.255.255.255
 * 172.16.0.0～172.31.255.255
 * 192.168.0.0～192.168.255.255
 * 子网掩码为二进制下前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 * 注意二进制下全是1或者全是0均为非法
 * 注意：
 * 1. 类似于【0.*.*.*】和【127.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时可以忽略
 * 2. 私有IP地址和A,B,C,D,E类地址是不冲突的
 * 输入描述:
 * 多行字符串。每行一个IP地址和掩码，用~隔开。
 * 输出描述:
 * 统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。
 * @author: linwengang
 * @createDate: 2021/2/3
 * @version: 1.0
 */
public class Practice18 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,c=0,d=0,e=0,err=0,pri=0;
        String str;
        while((str=bf.readLine())!=null){
            int index=str.indexOf('~');
            long ip=ipToNum(str.substring(index+1));
            if(ip<=0||ip>=0XFFFFFFFFL||(((ip ^ 0XFFFFFFFFL) + 1) | ip) != ip){
                err+=1;
                continue;
            }
            ip=ipToNum(str.substring(0,index));
            long partOfIP=ip>>24;
            if(ip<=0L||ip>=0XFFFFFFFFL){
                err+=1;
            }else if(partOfIP>=1&&partOfIP<=126){
                a+=1;
                if(partOfIP==10){
                    pri+=1;
                }
            }else if(partOfIP>=128&&partOfIP<=191){
                b+=1;
                if(ip>>20==0xAC1){
                    pri+=1;
                }
            }else if(partOfIP>=192&&partOfIP<=223){
                c+=1;
                if(ip>>16==0xC0A8){
                    pri+=1;
                }
            }else if(partOfIP>=224&&partOfIP<=239){
                d+=1;
            }else if(partOfIP>=240&&partOfIP<=255){
                e+=1;
            }
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+err+" "+pri);
    }
    public static long ipToNum(String ip){
        long num=0;
        int flag=1,temp=0;
        char[] chars=ip.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='.'){
                num=num<<8|temp;
                temp=0;
                flag++;
                continue;
            }
            if(flag>=2){
                return -1;
            }
            if(chars[i]>='0'&&chars[i]<='9'){
                temp=temp*10+chars[i]-'0';
                flag=0;
            }else{
                flag=3;
                break;
            }
        }
        if(flag>=2){
            return -1;
        }
        num=num<<8|temp;
        return num;
    }
}
