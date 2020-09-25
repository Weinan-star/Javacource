package com.bjpowernode.javase.foundation;

import java.util.Objects;

public class k{
    public static void main(String[] args) {
        Mytime t1 = new Mytime(2008,"八",8);
        System.out.println(t1);
        System.out.println(t1.toString());
        Mytime t2 = new Mytime(2008,"八",8);
        Mytime t3 = new Mytime(2008,"八",9);
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t2));
    }
}

class Mytime{
    private int year;
    private String month;  //引用数据类型，比较用equals
    private int day;

    public Mytime() {
    }

    public Mytime(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mytime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mytime mytime = (Mytime) o;
        return year == mytime.year &&
                day == mytime.day &&
                Objects.equals(month, mytime.month); //字符串类型比较
    }

}