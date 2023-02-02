public class StringConvert {
    public static void main(String[] args) {
        // int double float char
        int i = 10;
        double d = 10.0;
        float f = 10.0f;
        String s1 = i+"";
        System.out.println(s1);
        String s2 = "123";
        int ii = Integer.parseInt(s2);
        double id = Double.parseDouble(s2);
        System.out.println(ii);

        System.out.println(s1.charAt(1));
    }
}
