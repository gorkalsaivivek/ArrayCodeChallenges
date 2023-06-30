package src;

import java.util.HashSet;

public class SingleNumber {
public static void main(String[] args) {
		
	singleNumber(new int[] {4,1,2,1,2});
	}

public static int singleNumber(int[] nums) {
	
	HashSet<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < nums.length; i++) {
    	
    	boolean isDeleted=set.remove(nums[i]);
    	
    	if(!isDeleted) {
    		set.add(nums[i]);
    	}
    }
    
    
	return set.iterator().next();
	
}
}
