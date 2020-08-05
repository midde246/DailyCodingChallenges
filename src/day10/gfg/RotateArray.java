package day10.gfg;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		rotateArray(arr, 3);
		for(int i =0 ; i< arr.length ; i++) {
			 System.out.println(arr[i]);
		}
	}
	
	public static void rotateArray(int[] arr, int d) { // d <- the array rotated by d in clockwise.
		
		int[] extArr = new int[arr.length];
		int n = extArr.length - 1;
		int m = n - d;
		for(int i =0 ; i< arr.length ; i++) {
			if( i < d) {
				extArr[n-d+1] = arr[i];
				n++;
			} else {
				n = n-1;
				extArr[m] = arr[i];
				m--;
			}
		}
		for (int i=0; i<arr.length; i++) 
			arr[i] = extArr[i];
		 
	}
}
