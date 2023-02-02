
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double wage = scanner.nextDouble();

        System.out.println(age + wage);
    }
}
