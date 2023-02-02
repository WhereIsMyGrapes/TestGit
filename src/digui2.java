public class digui2 {
    public static void main(String[] args) {
        Num num=new Num();
        System.out.println(num.method(5));
    }
}


class Num{
    public int method(int n){
        if(n==1){
            return 1;
        }
        else{
            return method(n-1)*n;
        }

    }
}