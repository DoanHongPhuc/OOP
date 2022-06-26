package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.*;
public class DateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate("second", "June", "nineteen hundred");
		MyDate date2 = new MyDate("second", "July", "nineteen fourty-six");
		MyDate date3 = new MyDate("second", "May", "nineteen fourty-five");
		DateUtils.dateSort(date1, date2, date3);
	}
}
