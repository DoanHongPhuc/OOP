package hust.soict.hedspi.aims.utils;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public final int[] a  = {1, 3, 5, 7, 8,10,12};
	public final int[] b  = {4, 6, 9, 11};
	
	public final String[]  strmonth = {"Janury", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
	public final String[] strday = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th",
									"11st", "12nd", "13rd", "14th", "15th", "16th", "17th", "18th", "19th", "20th", 
									"21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
	
	private static final String st1[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private static final String st2[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", };
	private static final String st3[] = { " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	private static final String st4[] = {"", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eigth", "ninth", "tenth", "eleventh", "twelfth", "thirdteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty first", "twenty second", "twenty third", "twenty fourth", "twenty fifth", "twenty sixth", "twenty senventh", "twenty eigth", "twenty ninth", "thirtieth", "thirty first"};
	
	public int checkYear(String s) {
		int year = 0;
		int check = 0;
		String[] part = s.split(" ");
		if(part[0].equals("two")) {
			if(part.length == 2) {
				System.out.println("hello");
				year = 2000;
				return year;
			}else {
				for(int i = 0; i < 10; i++) {
					if(part[3].equals(st1[i])) {
						year = 2000 + i;
						return year;
					}
				}
				
			}
		}

		for(int i = 0; i < 10; i++) {
			if(st2[i].equals(part[0])) {
				check = 1;
				year = (i+10) * 100;
				break;
			}
		}
		if(check != 1) {
			for(int i = 0; i < 9; i++) {
				if(st3[i].equals(part[0])) {
					check = 1;
					year = (i+1) * 1000;
					
				}
			}
		}
		
		if(part[1].equals("hundered")) return year;
		
		String[] token = part[1].split("-");

		
			for(int i = 0; i < 10; i++) {
				if(st2[i].equals(token[0])) {
					check = 1;
					year = year + 10 + i;
					
				}
			}
			for(int i = 0; i < 9; i++) {
				if(st3[i].equals(token[0])) {
					check = 1;
					year = year + (i+1) * 10;
					
				}
			}
		if(token.length == 1) {	
			return year;
		}
		else {
			for(int i = 0; i < 10; i++) {
				if(st1[i].equals(token[1])) {
					check = 1;
					year = year + i;
					return year;
				}
			}
		}
		
		if (check != 1) System.out.println(" from 1001 to 2099"); 
		return year;
	}
	
	public int checkDay(String s) {
		for(int i = 1; i <= 31; i++) {
			if(st4[i].equals(s)) {
				return i;
			}
		}
		return 0;
	}
	
	public int checkMonth(String s) {
		for(int i = 0; i < 12; i++) {
			if(strmonth[i].equals(s)) {
				return i + 1;
				
			}
		}
		return 0;
	}
	
	public int checkInArray(int [] a,int check){
		for(int i=0;i<a.length;i++) {
			if(check==a[i])  return 1;
		}
		
		return 0;
	}
	public int checkValidDay(int day, int month, int year) {
		int isLeap = 0;
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			isLeap = 1;
		}
		if(checkInArray(a,month)==1) {
			if(day>=0&&day<=31) 
				return 1;
			else return 0;

		}
		if(checkInArray(b,month)==1) {
			if(day>=0&&day<=30)return 1;
			else return 0;
		}
		if(month==2&&isLeap==0) {
			if(day>=0&&day<=28) return 1;
			else return 0;
		}
		if(month==2&&isLeap==1) {
			if(day>=0&&day<=29) 
				return 1;
			else return 0;
		}
		return 0;
		
		
	}
	
	

	
	public MyDate() {
		this.day = java.time.LocalDate.now().getDayOfMonth();
		this.month = java.time.LocalDate.now().getMonthValue();
		this.year = java.time.LocalDate.now().getYear();
	}
	
	public MyDate(int day, int month, int year) {
		int check = checkValidDay(day, month, year);
		assert check != 0 : "Invalid day";
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public MyDate(String date) {
		int day = 0, month = 0, year = 0;
		String part[] = date.split(" ");
		year = Integer.parseInt(part[2]);
		for(int i = 0; i < 12; i++) {
			if(strmonth[i].equals(part[0])) {
				month = i + 1;
				break;
			}
		}
		for(int i = 0; i < 31; i++) {
			if(strday[i].equals(part[1])) {
				day = i + 1;
				break;
			}
		}
		int check = checkValidDay(day, month, year);

		assert check  == 1 : "Invalid day";
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int check = checkValidDay(day, this.getMonth(), this.getYear());
		assert check == 1 : "Invalid day";
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		int check = checkValidDay(this.getDay(), this.month, this.getYear());
		assert check == 1 : "Invalid day";
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		int check = checkValidDay(this.getDay(), this.getMonth(), this.year);
		assert check == 1 : "Invalid day";
		this.year = year;
	}

	
//	accept method 
	public void accept() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a date: ");
		String date = scan.nextLine();

		int day = 0, month = 0, year = 0;
		String part[] = date.split(" ");
//		System.out.println(part[0] + part[1]+ part[2]);
		year = Integer.parseInt(part[2]);
		for(int i = 0; i < 12; i++) {
			if(strmonth[i].equals(part[0])) {
				month = i + 1;
				break;
			}
		}
		for(int i = 0; i < 31; i++) {
			if(strday[i].equals(part[1])) {
				day = i + 1;
				break;
			}
		}
		
		int check = checkValidDay(day, month, year);
//		System.out.printf("%d %d %d", day, month, check);
		assert check == 1 : "Invalid day";
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
//	print method
	
	public void print() {
		System.out.println( strmonth[(this.getMonth() - 1)]+" "+strday[(this.getDay() - 1)]+" "+this.getYear());
	}
	
	
	
//	Mydate string
	public MyDate(String sday, String smonth, String syear) {
		int day = checkDay(sday);
		int month = checkMonth(smonth);
		int year = checkYear(syear);
		int check = checkValidDay(day, month, year);
		assert check != 0 : "Invalid day";
		this.day = day;
		this.month = month;
		this.year = year;
	}

}