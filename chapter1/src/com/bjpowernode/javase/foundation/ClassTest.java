package com.bjpowernode.javase.foundation;

public class ClassTest {
    public static void main(String[] args) {
        Husband h1 = new Husband("320324", "张三", "1997-11-18", null);
        Wife w1 = new Wife("320321", "李四", "1998-10-19", null);
        //俩人产生关系(结婚)
        h1.wife = w1;              //这两句不写h.wife.name 会出现空指针异常
        w1.husband = h1;
        //输出丈夫的妻子名字
        //System.out.println(h.name + "的妻子是" + w.name);   这样写不对
        System.out.println(h1.name + "的妻子是" + h1.wife.name);
        System.out.println(w1.name + "的丈夫是" + w1.husband.name);
    }
}

class Husband {
    String id;
    String name;
    String birth;
    Wife wife;

    public Husband() {         //无参构造方法
    }

//    public Husband(String s1, String s2, String s3, Wife w) {    //有参构造方法，为了增强可读性，this不要省略
//        id = s1;
//        name = s2;
//        birth = s3;
//        wife = w;
//    }
      public Husband(String id, String name, String birth, Wife wife) {    //有参构造方法，为了增强可读性，this不要省略
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.wife = wife;
    }
}

class Wife {
    String id;
    String name;
    String birth;
    Husband husband;

    public Wife() {
    }

    public Wife(String id, String name, String birth, Husband husband) {    //有参构造方法，为了增强可读性，this不要省略
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.husband = husband;
    }
}




