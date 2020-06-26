package day8;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums, 4));
	}

	public static int searchInsert(int[] nums, int target) {
		int position = -1;
		for(int i=0 ;i < nums.length ; i++) {
			if(nums[i] == target) {
				position = i;
				break;
			} else if(nums[i] >target) {
				position = i;
				break;
			}
		}
		if(position == -1) {
			position = nums.length;
		}
		
		return position;
	}
}
