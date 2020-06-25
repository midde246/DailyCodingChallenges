package day7;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 0, 4};
		System.out.println(removeElement(nums, 2));
	}
	
	public static int removeElement(int[] nums, int val) {
		int j = 0;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}

		return j++;
	}
}
