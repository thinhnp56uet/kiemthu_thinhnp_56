package code;

public class SimpleNextDay {
	public String nextDate(int day, int month, int year) {
		String result = "";
		// ////////////////////////////
		// ///////Kiem Tra Hop Le//////
		// ////////////////////////////
		if (year > 2012 || year < 1812) {
			result = "Not A Valid Date";
			return result;
		}
		boolean namNhuan;
		if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
			namNhuan = true;
		} else {
			namNhuan = false;
		}
		if (month < 1 || month > 12) {
			result = "Not A Valid Date";
			return result;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				result = "Not A Valid Date";
				return result;
			}
		}
		if (month == 4 || month == 6 || month == 5 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				result = "Not A Valid Date";
				return result;
			}
		}
		if (month == 2 && namNhuan) {
			if (day < 1 || day > 29) {
				result = "Not A Valid Date";
				return result;
			}
		}
		if (month == 2 && !namNhuan) {
			if (day < 1 || day > 28) {
				result = "Not A Valid Date";
				return result;
			}
		}
		// ////////////////////////////
		// ///////Tinh NextDate////////
		// ////////////////////////////
		day = day + 1;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10) {
			if (day == 32) {
				day = 1;
				month = month + 1;
			}
		}
		if (month == 4 || month == 6 || month == 5 || month == 9 || month == 11) {
			if (day == 31) {
				day = 1;
				month = month + 1;
			}
		}
		if (month == 2 && namNhuan) {
			if (day == 30) {
				day = 1;
				month = month + 1;
			}
		}
		if (month == 2 && !namNhuan) {
			if (day == 29) {
				day = 1;
				month = month + 1;
			}
		}
		if (month == 12) {
			if (day == 32) {
				day = 1;
				month = 1;
				year = year + 1;
			}
		}
		result = day + "/" + month + "/" + year;
		return result;
	}
}
