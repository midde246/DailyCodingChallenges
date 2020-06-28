package day8;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(2));
		System.out.println(countAndSay(3));
		System.out.println(countAndSay(4));
		System.out.println(countAndSay(5));
		System.out.println(countAndSay(6));
	}

	public static String countAndSay(int n) {
		String resuString = "1";
		return test(resuString, n);
	}

	public static String test(String resSeq, int n){
		if(n == 0 || n == 1 ) {
			return resSeq;
		} else {
			String resultStr = "";
			
			int prev = 0, count = 1;
			for(int i=1 ; i<resSeq.length() ; i++) {
				if(resSeq.charAt(i) == resSeq.charAt(prev)) {
					count++;
				} else {
					resultStr = resultStr + count + resSeq.charAt(prev);
					count = 1;
				}
				prev++;
			}
			resultStr = resultStr + count + resSeq.charAt(prev);
			
			return test(resultStr, --n);
		}
	}
	
}