package day7;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
// 		int len = removeDuplicates(nums);
 		int len = removeDuplicatesOPT(nums);
 		
 		for(int i=0; i< len ; i++) {
 			System.out.println(nums[i]);
 		}
	}

	public static int removeDuplicates(int[] nums) {
		int endIndex = nums.length;
		int temp = nums.length-1; 
		for(int i = (nums.length-2) ; i >= 0 ; i --) {
		    if(nums[temp] == nums[i]) {
		    	for(int j = i ; j < endIndex-1 ; j++ ) {
		    		nums[j] = nums[j + 1];
		    	}
		    	endIndex--;
		    }
		    temp--;
		}
		return endIndex;
	}
	
	public static int removeDuplicatesOPT(int[] nums) {
		
		if(nums.length == 0) return 0;
		int j = 0;
		for(int i = 1; i<nums.length ; i++) {
			if(nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j+1;
	}
}
