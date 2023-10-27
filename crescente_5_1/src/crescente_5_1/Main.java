package crescente_5_1;

import java.util.Locale;
import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			
			if (x > y ) {
				
				System.out.println(x);
				System.out.println(y);
				System.out.println("DECRESCENTE!");
			}
			else if (x < y) {
				
				System.out.println(x);
				System.out.println(y);
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite outro dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
	}
		System.out.println("FIM DO PROGRAMA");
	sc.close();
		
	}	
}
