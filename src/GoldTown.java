public class GoldTown {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // 控制每行空格数
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            // 空格每行星数
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
