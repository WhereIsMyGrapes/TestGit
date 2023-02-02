public class floatDouble {
    public static void main(String[] args) {
        double n1 = 2.7;
        double n2 = 8.1/3;
        System.out.println(n1==n2);
        System.out.println(Math.abs(n1-n2));
        if (Math.abs(n1-n2)<0.000001){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
