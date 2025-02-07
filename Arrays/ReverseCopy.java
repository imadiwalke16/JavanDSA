import java.util.Arrays;

public class ReverseCopy {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8};
        int cparr[]=new int[arr.length];


        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            cparr[j]=arr[i];

           


        }

        System.out.println(Arrays.toString(cparr));
    }
    
}
