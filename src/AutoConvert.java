public class AutoConvert {
    public static void main(String[] args) {
        // char int long float double 低可以转高
        // byte short int long float double
        double d = 199;
        int i = 'a';
        float f = 10.1f;
        System.out.println(d);
        System.out.println(f);
        System.out.println(d+i+f); // 取最大类型
    }
}
