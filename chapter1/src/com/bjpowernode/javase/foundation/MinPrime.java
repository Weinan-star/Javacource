package com.bjpowernode.javase.foundation;

public class MinPrime {
    //输出大于某个正整数n的最小质数
    public static void main(String[] args){
        printMinPrime(10);
    }
    //该方法用来打印最小质数
    public static void printMinPrime(int n){
        //假设系统给一个正整数n,
        //下面方法简洁变化为
//        while(true){
//            n++;
            //判断此时n是否为质数
//            boolean flag = isPrime(n);
//            if(flag){                   //这两句合并为下面一句
//            if(isPrime(n)){
//                System.out.println(n);
//                break;
//            }
//        }
        while(!isPrime(++n)){
        }
        System.out.println(n);

    }
    //定义一个方法来判断一个数是否为质数
    public static boolean isPrime(int num){
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        //程序返回ture说明num为质数
        return true;
    }
}
