public class PopSotr {
    public static void main(String[] args) {
        int arr[]={55,66,44,22,11};
        for (int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                int temp = arr[j-1];
                if(arr[j-1]>arr[j]){
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
