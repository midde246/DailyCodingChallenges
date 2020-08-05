package day10.leetcode;

/**
 * Rotate right up to the cout.....
 * @author Midde
 *
 */
public class RotateArray {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7};
		int[] arr = {1,2,3};
		rotateArray(arr, 2);
		for(int i =0 ; i< arr.length ; i++) {
			 System.out.println(arr[i]);
		}
	}
	
	public static void rotateArray(int[] arr, int d) { // d <- the array rotated by d in clockwise.
		if(d > arr.length) {
			d = d % arr.length;
		}
		
		int len = arr.length;
		int[] temp;
		if(len - d > d)
			temp = new int[len -d];
		else 
			temp = new int[d];
		
		int bp = len-d;
		for(int i =0 ; i<len - d ; i++) {
			temp[i] = arr[i];
			if(bp < len) {
			  arr[i] = arr[bp];
			  bp++;
			}
		}

		for(int i = d, j = 0 ; i<len ; i++, j++) {
			arr[i] = temp[j];
		}
	}
}
