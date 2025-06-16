import java.util.ArrayList;
import java.util.List;
public class CountDistinct {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>(List.of(1,2,2,3,4,4,5,5,6));

        ArrayList<Integer> distinctList = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!distinctList.contains(list.get(i))){

                distinctList.add(list.get(i));

            }
        }

        System.out.println("Distinct elements in the list: " + distinctList);
        System.out.println("Count of distinct elements: " + distinctList.size());





    }
}
