import java.util.Arrays;

public class IncreaseSizeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        //array size of 3;
        //now how to icrease size??
        // first make a temp array initilize with required size then copy all elements in temp array then refrence temp array to arr then temp will be treated by garbage collector

        int temp[]=new int[2*arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        temp=null;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
