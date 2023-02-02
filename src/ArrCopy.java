public class ArrCopy {
    public static void main(String[] args) {
        int [] arr_1={0,1,2};
        int [] arr_2=new int[arr_1.length];

        for(int i =0;i<arr_2.length;i++){
            arr_2[i] = arr_1[i];
        }

        arr_2[2]=3;

//        for(int i =0;i<arr_2.length;i++){
//            System.out.println(arr_2[i]);
//        }


    }
}
