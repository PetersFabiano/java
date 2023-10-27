package quadrante_5_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Valor de x: ");
		x = sc.nextDouble();
		
		System.out.println("Valor de y: ");
		y = sc.nextDouble();
		
		while (x != 0 || y !=0) {	
		
			if (x > 0 && y > 0) {
			
				System.out.println("Q 1");
			}
			else if (x < 0 && y > 0) {
			
				System.out.println("Q 2");
			
			}
			else if (x < 0 && y < 0) {
			
				System.out.println("Q 3");
			
			}
			else if (x > 0 && y < 0) {
			
				System.out.println("Q 4");
			
			}
			System.out.println("Valor de x: ");
			x = sc.nextDouble();
			
			System.out.println("Valor de y: ");
			y = sc.nextDouble();
		}
		sc.close();
	}
}
