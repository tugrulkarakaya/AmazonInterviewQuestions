package com.tugrulkarakaya.amazon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
        Arrays.stream(main.twoSum(new int[]{20471,10231,1,7,15}, 20472)).forEach(System.out::println);
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            //get current item from arrays
            int c= target-nums[i];
            //check if there is any item in the map as solutions
            // if there is return both indexes
            Integer index =  numsMap.get(c);
            if(index!= null)
                return new int[]{i,index};
            //if there is no solution add to hash map and continue to next item
            numsMap.put(nums[i],i);
        }
        return null;
    }
}
