package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
//		System.out.println(isValid("([)]"));
//		System.out.println(isValid("{[]}"));
		System.out.println(isValid("([]"));
	}

	public static boolean isValid(String s) {
		Map<Character, Character> bracsMap = new HashMap<>();
		bracsMap.put(')', '(');
		bracsMap.put('}', '{');
		bracsMap.put(']', '[');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (!bracsMap.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				char bkdPar = stack.isEmpty() ? '#' : stack.pop();
				if (bkdPar != bracsMap.get(s.charAt(i))) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
