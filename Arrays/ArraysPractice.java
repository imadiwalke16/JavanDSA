import java.util.*;

public class ArraysPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Prompt before reading input
        System.out.print("Enter the number of elements you want to store: ");  
        int n = sc.nextInt();  

        // Dynamically allocate array
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");  
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The stored elements are:");  
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        sc.close(); // Close Scanner to prevent resource leak
    }
}
