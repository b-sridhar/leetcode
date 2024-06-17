package Examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }
}
