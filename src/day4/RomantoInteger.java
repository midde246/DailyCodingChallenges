package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomantoInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int res = 0;
		Map<Character, Integer> symbalNumMap = new HashMap<>();
		symbalNumMap.put('I', 1); //MCMXCIV
		symbalNumMap.put('V', 5);
		symbalNumMap.put('X', 10);
		symbalNumMap.put('L', 50);
		symbalNumMap.put('C', 100);
		symbalNumMap.put('D', 500);
		symbalNumMap.put('M', 1000);
		List<Character> symbalList = new ArrayList<>();
		for(int i=0 ;i<s.length() ;i++) {
			int tempNum = symbalNumMap.get(s.charAt(i));
			res += tempNum;
			symbalList.add(s.charAt(i));
			try {
				int previousNum = symbalNumMap.get(symbalList.get(i-1));
				if(tempNum > previousNum) {
					res -= previousNum * 2;
				}
			} catch(Exception ex) {}
		}
		return res;
	}
}
