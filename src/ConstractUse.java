public class ConstractUse {
    public static void main(String[] args) {
        Constr constr1=new Constr("zs",18);
        Constr constr2=new Constr("lisi");

        System.out.println(constr1.age+constr1.name);
        System.out.println(constr2.name+constr2.age);


    }
}

class Constr{
    String name;
    int age;

    public Constr(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Constr(String name){
        this.name=name;
    }

}
