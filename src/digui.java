public class digui {
    public static void main(String[] args) {
        Num2 num=new Num2();
        num.method(4);
    }
}

class Num2{
    void method(int n){
        if(n>2){
            method(n-1);
        }
        System.out.println("n="+n);
    }
}
