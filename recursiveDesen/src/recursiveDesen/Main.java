package recursiveDesen;

import java.util.Scanner;

public class Main {
	static int i = 0;
	static int recN(int n, int temp, int n1) {
		
		System.out.print(n + " ");
		
		if(n == n1) {
			i++;
			if(i == 2) {
				return 0;
			}
		}
		if(n <= 0 || temp < n ) {
			temp = n;
			return recN(n+5,temp,n1);
			}
		else {
			temp = n;
			return recN(n-5,temp,n1);}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("N sayısı : ");
		int n = scan.nextInt();
		int temp = n;
		if(recN(n,temp,n) != 0)
			System.out.print(recN(n,temp,n) + " ");
	}

}
