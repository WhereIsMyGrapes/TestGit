public class ArrMax {
    public static void main(String[] args) {
        int[] arr = {11, 25, 64, 87, 53, 24, 65};
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        System.out.println(Max);

        System.out.println("--------------------");

        String[] you = {"you", "dad", "mom"};
        String[] cp = you;
        System.out.println(cp[0]+cp[1]+cp[2]);
    }
}
