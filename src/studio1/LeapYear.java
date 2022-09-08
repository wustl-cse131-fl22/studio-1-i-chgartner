package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year ");
		int year = in.nextInt();
		
		System.out.print(year + " is a leap year: ");
		System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		// TODO Auto-generated method stub

	}

}
