package com.bjpowernode.javase.foundation;

public class jieCheng {
    //计算一个数的阶乘
    public static void main(String[] args){
        int value = f(6);
        System.out.println(value);
    }
    public static int f(int n){
        int result = 1;
        for (int i = n; i >1; i--){
            result *= i;
        }
        return result;
    }
}
