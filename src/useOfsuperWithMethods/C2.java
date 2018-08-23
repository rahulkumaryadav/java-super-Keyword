package useOfsuperWithMethods;

public class C2 extends C1{
    void  m1(){
        System.out.println("Method m1 from C2 class");
    }

    void display(){
       // m1();
        super.m1();

    }
}
