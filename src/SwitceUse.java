import java.util.Scanner;
public class SwitceUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        char c = scanner.next().charAt(0);
//        switch(c){
//            case 'a':
//                System.out.println("hello");break;
//            case 'b':
//                System.out.println("bbbbb");break;
//            default:
//                System.out.println("default");
//                break;
//        }
        double v = scanner.nextDouble();
        switch ((int)v/60){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("spring season");
                break;
        }
        System.out.println("outside switch");
    }
}
