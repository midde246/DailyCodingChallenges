package aug20.day1;

public class LengthofLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int len = 0;
		for(int i = s.length() - 1 ; i >= 0 ; i--) {
			if(s.charAt(i) == ' ') {
				break;
			}
			len++;
		}
		return len;
	}
}