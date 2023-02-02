
import static java.lang.Math.*;

public class Water {
    public static void main(String[] args) {

        int n = 153;
        int HunNum = n/100;
        int TenNum = n%100/10;
        int OneNum = n%10;

        int Total =(int)pow(HunNum,3) +(int)pow(TenNum,3)+(int)pow(OneNum,3);

        if(Total == n) {
            System.out.println(Total);
        }
    }
}
