package day4;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-1234));
	}

	public static int reverse(int x) {
		int res = 0;
		int num = x;
		if (num < 0) {
			num = num * (-1);
		}
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;

			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 &&  rem> 7))
				return 0;
			if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && rem < -8))
				return 0;
			res = res * 10 + rem;
		}
		if (x < 0) {
			res = res * (-1);
		}
		return res;
	}
}
