public class Object_1 {
    public static void main(String[] args) {
        Person zs=new Person();
        zs.name="zhangsna";
        zs.age=14;
        System.out.println(zs.name+" "+zs.age);

        Person lisi=new Person();
        lisi.name="lisi";

        lisi.method(lisi);
        System.out.println(lisi.name);


    }
}

class Person{
    String name;
    int age;
    void method(Person p){
//        p.name="Tom";
//        p.age=18;
        p=null;
    }
}
