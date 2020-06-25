package day7;

public class Implement_strStr {

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}

	public static int strStr(String haystack, String needle) {
		int index = -1;
		
		int l1 = haystack.length(); // hello
		int l2 = needle.length();  // ll
		
		for(int i=0 ; i<= l1-l2 ; i++) {
			if(haystack.substring(i, i+l2).equals(needle)) {
				index = i;
				break;
			}
		}

		return index;
	}

}
