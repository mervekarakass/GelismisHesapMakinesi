package gelismisHesapMakinesi;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	
	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Toplam: " + result);
		return result;
		
		}
	
	static int minus(int a, int b) {
		int result = a - b;
		System.out.println("Cikarma: " + result);
		return result;
	}
	
	static int times(int a, int b) {
		int result = a * b;
		System.out.println("Carpim: " + result);
		return result;
	}
	
	static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Ikinci sayi 0'dan farkli olmalidir");
			return 0;
		}
		int result = a / b;
		System.out.println("Bolum: " + result);
		return result;
	}
	
	static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
			
		}
		
		return result;
	}
	
	static int modalma(int a, int b) {
		return a % b;
		
	}
	
	static void calcrectangular(int a, int b) {
		System.out.println("Cevresi: " + (2*(a+b)));
		System.out.println("Alani: " + (a*b));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int select;
		
		
		String menu = "1- Toplama islemi\n"
				+ "2- Cikarma islemi\n"
				+ "3- Carpma Islemi\n"
				+ "4- Bolme islemi\n"
				+ "5- Us alma\n"
				+ "6- Mod alma\n "
				+ "7- Dikdortgen alan ve cevre hesabi\n"
				+ "8- Cikis yap";
		
		
		while (true) {
			System.out.println(menu);
			System.out.print("Bir islem seciniz: ");
			select = scanner.nextInt();
			if (select == 0) {
				break;
				
			}
			System.out.print("Ilk sayi: ");
			int a = scanner.nextInt();
			System.out.print("Ikinci sayi: ");
			int b = scanner.nextInt();
			
			switch (select) {
			case 1:
				sum(a, b);
				break;
			case 2:
				minus(a, b);
				break;
			case 3:
				times(a, b);
				break;
			case 4:
				divide(a, b);
				break;
			case 5:
				System.out.println(power(a, b));
				break;
			case 6:
				System.out.println("Mod islemi: " + modalma(a, b));
				break;
			case 7:
				calcrectangular(a, b);
				break;
			
			default:
				System.out.println("Gecersiz bir islem girdiniz.");
				break;
			}
		}
		
		
		
		
		

	}

}
