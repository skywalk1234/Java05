public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person("Tom",18,0);
        Person p2 = new Person(p1);
        p2.GetInfo();
    }
}
