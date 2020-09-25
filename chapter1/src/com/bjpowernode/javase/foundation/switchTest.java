package com.bjpowernode.javase.foundation;

public class switchTest {
    public static void main(String[] args){
//        java.util.Scanner s = new java.util.Scanner(System.in);
//        System.out.print("请输入星期几：");
//        String dayofWeek = s.next();
//        switch(dayofWeek){
//            case "星期一":
//                 System.out.println(1);
//                 break;
//            case "星期二":
//                System.out.println(2);
//                break;
//            case "星期三":
//                System.out.println(3);
//                break;
//            case "星期四":
//                System.out.println(4);
//                break;
//            case "星期五":
//                System.out.println(5);
//                break;
//            case "星期六":
//                System.out.println(6);
//                break;
//            case "星期日":
//                System.out.println(7);
//                break;
//            default:
//                System.out.println("输入信息有误");
//        }

/*实现计算器中的 + - * / %
    数据从键盘输入
    使用switch语句
 */
//        System.out.println("欢迎使用简单计算器系统");
//        java.util.Scanner s = new java.util.Scanner(System.in);
//        System.out.print("请输入第一个数字：");
//        int num1 = s.nextInt();
//        System.out.print("请输入运算符：");
//        String sign = s.next();
//        System.out.print("请输入第二个数字：");
//        int num2 = s.nextInt();
//        int result = 0;
//        switch(sign){
//            case "+" :
//                result = num1 + num2;
//                break;
//            case "-" :
//                result = num1 - num2;
//                break;
//            case "*" :
//                result = num1 * num2;
//                break;
//            case "/" :
//                result = num1 / num2;
//                break;
//            case "%" :
//                result = num1 % num2;
//                break;
//        }
//        System.out.println("运算结果为:" + num1 + sign + num2 + " = " + result);

// 判断考生成绩等级
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入考生成绩:");
    double score = s.nextDouble();
    int grade = (int)(score / 10);  //将考生成绩换为int类型
    switch(grade){
        case 9: case 10:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("E");
            break;
    }
    }
}
