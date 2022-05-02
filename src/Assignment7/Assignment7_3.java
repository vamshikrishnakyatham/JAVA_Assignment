package assignment7;

interface One {
    void method1();
    void method2();
}

interface Two {
    void method3();
    void method4();
}

interface Three {
    void method5();
    void method6();
}

interface Four extends One,Two,Three {
    void method7();
}

class Example{
    public void method(){
    }
}

class Example1 extends Example implements Four {

    @Override
    public void method7() {
        System.out.println("From method7");
    }

    @Override
    public void method1() {
        System.out.println("From method1");
    }

    @Override
    public void method2() {
        System.out.println("From method2");
    }

    @Override
    public void method5() {
        System.out.println("From method5");
    }

    @Override
    public void method6() {
        System.out.println("From method6");
    }

    @Override
    public void method3() {
        System.out.println("From method3");
    }

    @Override
    public void method4() {
        System.out.println("From method4");
    }
}


public class Assignment7_3 {
    public static void m1(One one){
        one.method2();
    }
    public static void m2(Two two){
        two.method3();
    }
    public static void m3(Three three){
        three.method5();
    }
    public static void m4(Four four){
        four.method7();
    }
    public static void main(String[] args){
        Example1 obj = new Example1();
        m1(obj);
        m2(obj);
        m3(obj);
        m4(obj);
    }
}
