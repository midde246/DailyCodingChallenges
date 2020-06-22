package day4;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(13341));
	}

	public static boolean isPalindrome(int x) {
		boolean res = false;
		if(x < 0) return false;
		int rev = 0;
		int tempVal = x;
		while(tempVal > 0) {
			rev = rev * 10 + tempVal % 10;
			tempVal /= 10; 
		}
		if(rev == x) res = true;
		return res;
	}
}
