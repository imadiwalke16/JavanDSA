import java.util.*;
public class ArrayLists {
    public static void Large(int n){
        if(n>10){
            System.out.println("Number is greater than 10"+n);
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> it=new ArrayList<>();
        ArrayList<Integer> it1=new ArrayList<>(List.of(10,20,30,40));

        // Array List Methods
        // adding elements
        it.add(10);
        // adding elements at specific index
        it.add(0,20);  
        it.addAll(it1); // adding all elements of it1 to it

        // contains method
        System.out.println(it.contains(20));
        System.out.println(it.containsAll(it1)); // false, 50 is not in the list

        for(ListIterator<Integer> it2=it.listIterator();it2.hasNext();){
            System.out.println(it2.next());
        } 
        Iterator<Integer> it3=it1.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        
        it.forEach(n -> {
            Large(n);
        });




    }
}
