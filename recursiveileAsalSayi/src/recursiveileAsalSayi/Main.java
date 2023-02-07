package recursiveileAsalSayi;

import java.util.Scanner;

public class Main {
	static boolean asal(int n, int i) {
		if(i == 1) return true;
		if(n <= 1) return false;
		if(n % i == 0) return false;
		return asal(n, i-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int number = scan.nextInt();
		int i = number-1;
		System.out.println(number + " sayısı " +  (asal(number, i)?"asal sayıdır.":"asal sayı değildir."));

	}

}
