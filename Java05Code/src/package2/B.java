package package2;

import package1.A;

public class B {
    A a =new A();
    public void get(){
        System.out.println(a.n1);//只有n1可以访问
    }
}
