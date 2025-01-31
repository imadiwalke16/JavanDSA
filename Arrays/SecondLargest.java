import java.util.Scanner;

public class SecondLargest {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1,max2;
         max1=max2=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];

            }
        }

        System.out.println("max second element is: "+max2);

        sc.close();


    }
}
