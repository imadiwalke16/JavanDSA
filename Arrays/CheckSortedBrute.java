import java.util.Scanner;

public class CheckSortedBrute {

    public static boolean IsSorted(int arr[], int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){

                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(IsSorted(arr, n));
        sc.close();

        
        }



    }

