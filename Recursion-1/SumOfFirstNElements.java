// Parametrized Way


// public class SumOfFirstNElements {
//     public static void print(int n,int sum){
//         if(n<1){
//             System.out.print(sum);
//             return;
//         }
       
//         print(n-1,sum+n);
       


//     }
//     public static void main(String args[]){
//         print(4, 0);

//     }
    
// }


// optimall method functional way
public class SumOfFirstNElements {
    public static int print(int n){
        if(n==0){
           return 0;
            
        }
        return n + print(n-1);

    }
    public static void main(String args[]){

        int n = 5; // Example: calculate the sum of the first 5 natural numbers
        int result = print(n); // Call the recursive method
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);

    }
}
