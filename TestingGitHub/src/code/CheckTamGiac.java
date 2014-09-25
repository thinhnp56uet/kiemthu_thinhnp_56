package code;

public class CheckTamGiac {
	public String checkTamGiac(int a, int b, int c) {
		String result = "";
		if (a + b < c || a + c < b || b + c < a) {
			result = "NotATriangle";
			return result;
		}
		result = "Scalene";
		int a1 = a * a;
		int b1 = b * b;
		int c1 = c * c;
		if (a1 == b1 || a1 == c1 || b1 == c1) {
			int minTemp = Math.min(a1, b1);
			minTemp = Math.min(minTemp, c1);
			int maxTemp = Math.max(a1, b1);
			maxTemp = Math.min(maxTemp, c1);
			if (minTemp + minTemp == maxTemp) {
				result = "right triangle";
			} else if (a1 == b1 && a1 == c1) {
				result = "Equilateral";
			} else {
				result = "Isosceles";
			}
		}
		return result;
	}
}
