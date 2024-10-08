import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private int sex;
    private static final List<Person> people = new ArrayList<Person>();
    //创建一个静态集合用来保存所有创建的对象的引用。
    public Person(String name, int age,int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        people.add(this);//每次创建时将对象的引用加入到集合中
    }
    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
        this.sex = p.sex;
    }
    public void destroy(){
        //调用该函数的时候表示销毁对象，将对象的引用从集合中移除
        people.remove(this);
    }
    public static int counting(){
        //返回集合中的引用的个数，即对象的数量。
        return people.size();
    }
    public void GetInfo(){
        System.out.println("name:"+name+"  age:"+age+"  sex:"+sex);
    }
    private void eat() {
        System.out.println(name+"正在吃东西");
    }

    private void sleep() {

    }

    private void dadoudou() {

    }
}

