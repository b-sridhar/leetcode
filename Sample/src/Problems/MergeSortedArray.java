package Problems;

import com.sun.source.tree.Tree;

import java.util.*;

public class MergeSortedArray {

    public static void solutionTreeMap(){
        int[] nums1 = new int[]{1,2,3};
        int m = 3;
        int[] nums2 = new int[]{1, 5, 6};
        int n = 3;

        Map<Integer, Boolean> map = new TreeMap<>();

        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i], true);
        }

        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i], true);
        }

        for(Map.Entry<Integer, Boolean> e : map.entrySet()){
            System.out.println(e.getKey());
        }


    }
    public static void solution(){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{1, 5, 6};
        int n = 3;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }

        for(int p=0; p<nums1.length; p++){
            System.out.println(nums1[p]);
        }
    }

    public static void main(String[] args){
        solution();
    }
}
