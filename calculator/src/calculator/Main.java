package calculator;

import java.util.Scanner;

public class Main {
	
	static int getValue(String value) {
		Scanner scan = new Scanner(System.in);
		System.out.print(value);
		int n1 = scan.nextInt();
		return n1;
	}
	
	static int plus() {
		int n1 = getValue("Birinci sayıyı giriniz : ");
		int n2 = getValue("İkinci sayıyı giriniz : ");
		return n1+n2;
	}
	static int mines() {
		int n1 = getValue("Birinci sayıyı giriniz : ");
		int n2 = getValue("İkinci sayıyı giriniz : ");
		return n1-n2;
	}
	static int times() {
		int n1 = getValue("Birinci sayıyı giriniz : ");
		int n2 = getValue("İkinci sayıyı giriniz : ");
		return n1*n2;
	}
	static int divided() {
		int n1 = getValue("Birinci sayıyı giriniz : ");
		int n2 = getValue("İkinci sayıyı giriniz : ");
		if(n2 == 0) {
			System.out.println("Bölen 0 olamaz!");
			return 0;
		}
		return n1/n2;
	}
	static double power() {
		int n1 = getValue("Taban değerini giriniz : ");
		int n2 = getValue("Üs değerini giriniz : ");
		double result = Math.pow(n1, n2);
		return result;
	}
	static int factorial() {
		int n1 = getValue("Sayı giriniz :");
		int result = 1;
		for(int i = 1; i<=n1; i++) {
			result *= i;
		}
		return result;
	}
	static int mod() {
		int n1 = getValue("Birinci sayıyı giriniz : ");
		int n2 = getValue("İkinci sayıyı giriniz : ");
		return n1%n2;
	}
	static String rect() {
		int n1 = getValue("Birinci kenarı giriniz : ");
		int n2 = getValue("İkinci kenarı giriniz : ");
		int cevre = 2*(n1+n2);
		int alan = n1*n2;
		return "Çevre : " + cevre + "\nAlan : " + alan;		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1-Toplama İşlemi\n"
				+ "2-Çıkarma İşlemi\n"
				+ "3-Çarpma İşlemi\n"
				+ "4-Bölme İşlemi\n"
				+ "5-Üslü Sayı Hesaplama\n"
				+ "6-Faktöriyel Hesaplama\n"
				+ "7-Mod Alma\n"
				+ "8-Dikdörtgen Alan ve Çevre Hesabı\n"
				+ "0-Çıkış Yap\n");
		int select;
		do {
			System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
			select = scan.nextInt();
			
			
			switch (select) {
			case 1: {
				System.out.println("Sonuç : " + plus());
				break;
			}case 2: {
				System.out.println("Sonuç : " + mines());
				break;
			}case 3: {
				System.out.println("Sonuç : " + times());
				break;
			}case 4: {
				System.out.println("Sonuç : " + divided());
				break;
			}case 5: {
				System.out.println("Sonuç : " + power());
				break;
			}case 6: {
				System.out.println("Sonuç : " + factorial());
				break;
			}case 7: {
				System.out.println("Sonuç : " + mod());
				break;
			}case 8: {
				System.out.println(rect());
				break;
			}case 0: {
				System.out.println("Güle Güle!");
				break;
			}
			default:
				System.out.println("Yanlış bir değer girdiniz tekrar deneyiniz!");
			}
			
		}while(select != 0);
		
	}

}
