import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int temp=arr[arr.length-1];


        for(int i=n-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
