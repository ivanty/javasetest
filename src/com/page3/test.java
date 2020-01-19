package com.page3;

class Tank {
    float levle;
}

public class test {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.levle = (float) 28.6;
        t2.levle = (float) 29.6;
        System.out.println("t1.level=" + t1.levle + ",t2.level=" + t2.levle);
        //把t2的引用赋值给t1;
        t1=t2;
        System.out.println("t1.level=" + t1.levle + ",t2.level=" + t2.levle);
    }
}

