import java.util.*;

class  Test{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = s.nextInt();
        }
        getEvenOdd(a);
    }
    
    public static void getEvenOdd(int a[]){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
            
        }
        for(int i = 0; i < odd.size(); i++){
            System.out.print(odd.get(i) + " ");
        }
        for(int i = 0; i < even.size(); i++){
            System.out.print(even.get(i) + " ");
        }
    }
}