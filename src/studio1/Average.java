package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the first number you would like to enter to be averaged? ");
		int n1 = in.nextInt();
		
		System.out.println("What is the second number you would like to enter to be averaged? ");
		int n2 = in.nextInt();
		
		int average = n1 + n2;
		
		System.out.println("The average of the two numbers is " + (double) + average/2);
		// TODO Auto-generated method stub

	}

}
