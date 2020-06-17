package day1;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] returnResult = twoSum(nums, target);
		for(int i =0; i<returnResult.length ;i++) {
			System.out.println(returnResult[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] returnResult = new int[2];
		int temp = 0, fi, si;
		for (int i = 0; i < nums.length; i++) {
			fi = i;
			temp = target - nums[i];
			int ind = getSecondIndex(nums, i, temp);
			if(ind >= 0) {
				returnResult[0] = i;
				returnResult[1] = ind;
				return returnResult;
			} 
		}
		return returnResult;
	}

	private static int getSecondIndex(int[] nums, int i, int temp) {
		for (int j = 0; j < nums.length; j++) {
			if(i == j) continue;
			if(nums[j] == temp) return j;
		}
		return -1;
	}
}
