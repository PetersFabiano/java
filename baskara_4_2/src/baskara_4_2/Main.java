package baskara_4_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			double a, b, c, x1, x2, delta, sqrt_delta;
			
			System.out.println("Coeficiente a: ");
			a = sc.nextDouble();
			System.out.println("Coeficiente b: ");
			sc.nextLine(); // Limpeza de buffer
			b = sc.nextDouble();
			System.out.println("Coeficiente b: ");
			sc.nextLine(); // Limpeza de buffer
			c = sc.nextDouble();
			
			delta = Math.pow(b, 2) - (double)((4*a)*c);
			
			if (delta > 0) {
				
				sqrt_delta = Math.sqrt(delta);
				x1 = (-b + sqrt_delta)/(2*a);
				x2 = (-b - sqrt_delta)/(2*a);
				
				System.out.println("X1 = " + String.format("%.4f", x1));
				System.out.println("X2 = " + String.format("%.4f", x2));
				
			}
			else {
				
				System.out.println("Essa equação não possui raizes reais");
				
			}
			
			sc.close();
			
		}
}
