package Problems;

public class LongestCommonPrefix {

    public static void solution(){
        String[] input = new String[] {"dog","racecar","car"};

        String result = input[0];

        for(int i=1; i<input.length; i++){

            while(input[i].indexOf(result) != 0){
                result = result.substring(0, result.length() -1);
            }

        }

        System.out.println(result);

    }

    public static void main(String[] args){
        solution();

    }
}
