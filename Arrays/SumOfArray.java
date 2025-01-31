import java.util.*;
public class SumOfArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("enter elements of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("elements of array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        
        }

        int sum=0;
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
        
        }
        System.out.println("sum of array elements"+sum);

        sc.close();

    }
    
    
}
