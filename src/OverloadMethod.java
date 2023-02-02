public class OverloadMethod {
    public static void main(String[] args) {
        Num3 num3=new Num3();
        num3.add(1,2,3,4,5,6,9);
    }
}

class Num3{
    void add(int ...nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        System.out.println(res);
    }
}
