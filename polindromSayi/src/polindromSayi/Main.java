package polindromSayi;

import java.util.Scanner;

public class Main {

	static boolean isPolindrom(int number) {
		int temp=number,reverseNumber=0,lastNumber=0;
		
		while(temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		
		if(number == reverseNumber) 
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sorgulamak istediğiniz sayıyı giriniz : ");
		int number = scan.nextInt();
		
		if(isPolindrom(number)) {
			System.out.println(number + " sayısı polindrom sayıdır.");
		}else {
			System.out.println(number + " sayısı polindrom sayı değildir.");
		}

	}

}
