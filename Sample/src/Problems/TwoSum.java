package Problems;

import java.util.HashMap;

public class TwoSum {

    public static Integer[] problem(Integer[] nums, int target){
        Integer[] output = new Integer[]{0,0};

        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                int temp = nums[i] + nums[j];

                if (temp == target){
                    output[0]=i;
                    output[1]=j;

                    return output;
                }
            }
        }

        return output;
    }


    public static Integer[] problem1(Integer[] nums, int target){
        Integer[] output = new Integer[]{-1, -1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
           int diff = target - nums[i];

            if(map.containsKey(diff)){
                output[0] = map.get(diff);
                output[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return output;
    }

   public static void main(String[] args){
        Integer[] output = new Integer[]{-1,-1};
        Integer[] nums = new Integer[]{1, 2, 3, 4}; //{2, 7, 11, 15};
        output = problem1(nums, 6);
        if(output[0] != -1 && output[1] != -1){
            System.out.println("Output [" + output[0] + ", " + output[1] + "]");
        }
    }
}
