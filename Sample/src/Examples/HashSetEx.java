package Examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(7);
        set.add(2);

        System.out.println(set.size());

        for(Integer i : set ){
            System.out.println(i);
        }

    }

}
