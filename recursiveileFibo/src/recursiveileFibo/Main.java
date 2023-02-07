package recursiveileFibo;

import java.util.Scanner;

public class Main {
	
	static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Serinin kaç elemanını istediğinizi giriniz : ");
		int a = scan.nextInt();
		
		for(int i = 1; i<=a ; i++) {
			System.out.print(fib(i)+ " ");
		}

	}

}
