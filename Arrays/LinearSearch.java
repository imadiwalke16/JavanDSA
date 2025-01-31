import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter length of array");
    int n=sc.nextInt();

    int arr[]=new int[n];
    System.out.print("enter elements of array");




    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("enter element to be found");
    int key=sc.nextInt();



    
   
        for(int i=0;i<n;i++){
           if(arr[i]==key){
            System.out.println("element found"+arr[i]+"your requested value at this index:"+i);
            System.exit(0);
           }
        
        }
        System.out.println("not found");

        sc.close();


    }
    
}
