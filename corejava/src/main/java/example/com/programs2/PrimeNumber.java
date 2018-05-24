package example.com.programs2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Number to find if the given number is Prime Number or Not");

		int number = scan.nextInt();
		boolean isPrimeNumber=false;

		for (int i = 2; i < number/2; i++) {
			if(number%i==0) {
				isPrimeNumber=false;
				break;
			}else 
				isPrimeNumber=true;
		}
		if(isPrimeNumber) {
		System.out.println("The given Number: "+number+" is a Prime Number");
		}
		else {
			System.out.println("The given Number: "+number+" is not a Prime Number");	
		}
		
	}

}
