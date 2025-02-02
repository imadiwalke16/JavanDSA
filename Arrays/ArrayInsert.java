import java.util.Arrays;

public class ArrayInsert {
    public static void main(String args[]){
        // initilize array
        // check if array ha free space
        // if yes shift elements furthur from requested index 
        // index 
        // element to be inserted 
        // number of element n

        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        // total elements
        int n=3 ;

        int idx=1;
        int k=12;

        for(int i=n;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=k;
                System.out.println(Arrays.toString(arr));


    }
}
