package com.bjpowernode.javase.foundation;

public class Compute{
    static char x;
    public static void main(String[] args){
        char c = 'A';
        System.out.println(c);
        System.out.println('\\');
        System.out.println('\'');
        System.out.println("“Hello World!”");//hello world!引号为全角双引号
        System.out.println("\"Hello World!\"");//hello world!引号为半角双引号
        //System.out.println(""Hello World!"");都为半角时编译错误，要想输出两侧半角双引号得用转义字符\

        System.out.println(x);
        System.out.println(x+1);

//        int x = 10;
//        int y = 8;
//        System.out.println(x < y & ++x < y);
//        System.out.println(x);
        // 算数运算符 ++ —— 和逻辑运算符 &&
        int x = 10;
        int y = 8;
        x += 5;
        System.out.println(x < y && ++x < y);
        System.out.println(x);
        // + 号
        System.out.println("15 + 8 =" + x + y); // 158
        System.out.println("15 + 8 =" +(x + y)); // 23
        System.out.println(x + "+" + y + "=" + (x+y)); //23
        x = 100;
        y = 2000;
        System.out.println(x + "+" + y + "=" + (x+y));//2100
        String username = "WangWeinan";
        System.out.println("登录成功，欢迎" + username + "回来");

        //条件运算符
        boolean sex = false;
        System.out.println(sex ? "man" :"woman");
        System.out.println(sex ? '男' :"woman");


        }
}
