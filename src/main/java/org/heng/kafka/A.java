package org.heng.kafka;

/**
 * Created by wangdi on 15-11-19.
 */
class C extends B {

}
class D extends B {

}
class B extends A {
    public String show(B obj) {
        return ("B and B");
    }
    public String show(A obj) {
        System.out.println("AA");
        return ("B and A");
    }

}
public class A {

    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        System.out.println('a');
        return ("A and A");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
//        System.out.println(a1.show(b));	//A and A
//        System.out.println(a1.show(c));	//A and A
//        System.out.println(a1.show(d));	//A and D
        System.out.println(a2.show(b));	//B and B
//        System.out.println(a2.show(c));	//B and B
//        System.out.println(a2.show(d));	//B and B
//        System.out.println(b.show(b));	//B and B
//        System.out.println(b.show(c));	//B and B
//        System.out.println(b.show(d));	//B and B
    }
}
