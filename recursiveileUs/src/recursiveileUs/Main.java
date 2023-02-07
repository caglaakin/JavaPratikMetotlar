package recursiveileUs;

import java.util.Scanner;

public class Main {
	
	static int power(int a, int b) {
		if(b == 0) {
			return 1;
		}
		else if(a == 1) return 1;
		else
		return a*power(a, b-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değerini giriniz :");
		int a = scan.nextInt();
		System.out.print("Üs değerini giriniz :");
		int b = scan.nextInt();
		System.out.println("Sonuç : " + power(a, b));
	}

}
