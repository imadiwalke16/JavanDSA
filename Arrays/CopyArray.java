import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int Cparr[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            Cparr[i]=arr[i];

        }

        System.out.println(Arrays.toString(Cparr));

    }
}
