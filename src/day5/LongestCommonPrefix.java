package day5;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strArray = {"flower", "flow", "floght"};
		String[] strArray1 = {"aca","cba"};
//		System.out.println(longestCommonPrefix(strArray));
		System.out.println(longestCommonPrefix(strArray1));
	}

	public static String longestCommonPrefix(String[] strs) {
        String result = strs.length == 0 ? "" : strs[0];
        if(result.equals("")) return result;
         
        for(int i = 1; i < strs.length ; i++) {
        	 if(result.length() <= strs[i].length()) {
        		 String tempComm = ""; 
        		 for(int j =0; j < result.length() ;j++) {
        			 if(result.charAt(j) == strs[i].charAt(j)) {
        				 tempComm = tempComm+strs[i].charAt(j);        						 
        			 } else {
        				 break;
        			 }
        		 }
        		 result = tempComm;
        	 } else {
        		 String tempComm = ""; 
        		 for(int j =0; j < strs[i].length() ;j++) {
        			 if(result.charAt(j) == strs[i].charAt(j)) {
        				 tempComm = tempComm+strs[i].charAt(j);        						 
        			 } else {
        				 break;
        			 }
        		 }
        		 result = tempComm;
        	 }
        }
        
        return result;
	}
}
