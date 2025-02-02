import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int idx=2;
        int n=arr.length;

        for(int i=idx;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
        //to make last element zero
        System.out.println(Arrays.toString(arr));
    }
}
