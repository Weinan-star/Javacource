package com.bjpowernode.javase.foundation;

public class forTest {
    public static void main(String[] args){
        //九九乘法表
        for(int i = 1; i <= 9; i++){  //i是行号，外层循环循环9次
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" +i*j +" ");//不换行
            }
            //换行
            System.out.println();
            // System.out.println("\n");
        }

        //找出1-1000之间素数,每8个换一行

        int count = 0;
        for(int i=2; i<=100; i++) {
            boolean isPrime = true;     //标记，默认将i看成一个质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;//如果能整除，不是质数
                    break;          //提高执行效率
                }
            }
            if(isPrime){
                System.out.print(i + " ");  //这里也可以用条件运算符
                count++;
                if(count % 8==0){
                    System.out.println(); //每8个换行
                }
            }
        }

        //打印三角形
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数作为行数：");
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){          //最外层循环用来控制行数
            for(int j=1; j<=n-i; j++){         //输出空格的循环
                System.out.print(" ");
            }
            for(int m=1; m<=2*i-1; m++){          //输出星号的循环
                System.out.print("*");
            }
            System.out.println();           //两个for循环结束，输出换行
        }

        //找到1-1000的完数，完数是该数等于其因子之和,每8个换一行,1不是完数
        int num =0;
        for(int i=2; i<=1000; i++){
            int sum = 0;
            for(int j = 1; j<= i/2; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            //以上for结束，表示求和结束
            if(i == sum){
                System.out.print(i + " ");
                num ++;
                if(num % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
