package com.page3;

class Tank {
    float levle;
}

public class test {
    public static void main(String[] args) {
        /*Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.levle = (float) 28.6;
        t2.levle = (float) 29.6;
        System.out.println("t1.level=" + t1.levle + ",t2.level=" + t2.levle);
        //把t2的引用赋值给t1;
        t1=t2;
        System.out.println("t1.level=" + t1.levle + ",t2.level=" + t2.levle);*/
        //练习算术操作符 + - * / %
       /* int a=5;
        int b;
        b=a++;
        System.out.println(b);*/
       //3.7关系运算符 ==和！=也应用在对象，但是对象比较的是对象的引用，如果要比较内容，就要用对象的equals，基本类型用== 和！=即可
        Integer n1=new Integer(47);
        Integer n2=new Integer(47);
        System.out.println(n1==n2);
        System.out.println(n1!=n2);
        System.out.println(n1.equals(n2));

}
}

