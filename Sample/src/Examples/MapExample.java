package Examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args){

        HashMap<Integer, String> names = new HashMap<>();

        names.put(1, "Dublin");
        names.put(2, "San Ramon");
        names.put(3, "Pleasanton");

        for(Map.Entry<Integer, String> set: names.entrySet()){
            System.out.println(set.getKey() + " , " + set.getValue());
        }
    }
}
