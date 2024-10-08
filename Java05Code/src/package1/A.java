package package1;

public class A {
    public int n1=100;
    protected int n2=200;
    int n3 = 300;
    private int n4=400;
    public void get(){
        System.out.println(n1+n2+n3+n4);//都可以访问
    }
}
