package com.bjpowernode.javase.foundation;/*编写程序模拟主人喂养宠物的场景
提示1：
    主人类：Master
    宠物类：Pet
    宠物类子类:Dog、 Cat、YingWu
提示2：
    主人有喂养的方法feed()
    宠物有吃的方法eat()
    只要主人喂养宠物，宠物就吃
要求：
    主人类中只提供一个喂养方法，要求达到可以喂养各种类型宠物
编写测试程序：
     创建主人对象
     创建宠物对象
     调用主人喂养方法feed(),喂养不同吃宠物，观察结果
 */

public class DuoTai {
    public static void main(String[] args){
        //创建主人对象
        Master zhangsan = new Master();
        //创建宠物对象
        Dog zaogAo = new Dog();
        //主人喂养
        zhangsan.feed(zaogAo);
        //创建宠物对象
        //Cat mimi = new Cat();
        Pet mimi = new Cat();  //向上转型
        //主人喂养
        zhangsan.feed(mimi);
        //或者合并
        zhangsan.feed(new YingWu());
    }
}

class Master{
    public void feed(Pet p){       //不写宠物具体类型，扩展性好,形参好比int i
        p.eat();
    }
}

class Pet{
    public void eat(){
        System.out.println("宠物正在吃食物");
    }
}

class Dog extends Pet{
    public void eat(){            //重写eat方法
        System.out.println("狗狗正在啃骨头");
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫猫正在吃🐟");
    }
}

class YingWu extends Pet{
    public void eat(){
        System.out.println("鹦鹉正在学说话 ");
    }
}
