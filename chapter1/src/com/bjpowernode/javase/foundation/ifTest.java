package com.bjpowernode.javase.foundation;

public class ifTest {
    public static void main(String[] args){
        //判断学生成绩
//        java.util.Scanner s = new java.util.Scanner(System.in); //接收用户键盘输入，
//        System.out.print("请输入考生成绩："); //输出语句后不换行，光标在：后闪
//        double score =s.nextDouble();
//        System.out.println("score = " + score);
//        String grade = "该考生的成绩等级为：E";
//       if(score > 100 || score < 0 ){
//            grade = "您输入的成绩有误,成绩应在[0-100]之间";
//        }else if(score >= 90){
//            grade = "该考生的成绩等级为：A";
//        }else if(score >= 80){
//            grade = "该考生的成绩等级为：B";
//        }else if(score >= 70){
//            grade = "该考生的成绩等级为：C";
//        }else if(score >= 60){
//            grade = "该考生的成绩等级为：D";
//        }
//        System.out.println(grade);

/*判断当前天气
    外面下雨时：
        带雨伞
            判断性别：
                当性别为男：带一把大黑伞
                当性别为女：带一把小花伞
    外面晴天：
        判断天气温度：
            当温度在30°以上时：
                当性别为男：戴墨镜
                当性别为女：带防晒霜

 */
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统，通过本系统您可以进行一些简单的判断");
        System.out.println("说明1：1表示下雨，0表示晴天");
        System.out.println("说明2：1表示男，0表示女");
        System.out.println("说明3：温度为数字");
        System.out.print("请输入当前天气状况:");
        int weather = s.nextInt();
        System.out.print("请输入性别：");
        int sex = s.nextInt();
        if(weather == 1){
            System.out.println("下雨天");
            if(sex == 1){
                System.out.println("带一把大黑伞");
            }else{
                System.out.println("带一把小花伞");
            }
        }else if(weather == 0){
            System.out.println("晴天");
            System.out.print("请输入当前温度：");
            int temperature = s.nextInt();
            if(temperature > 30){
                if(sex == 1){
                    System.out.println("戴墨镜");
                }else{
                    System.out.println("擦防晒霜");
                }
            }
        }
        else{
            System.out.println("您输入天气状况有误");
        }
    }
}

