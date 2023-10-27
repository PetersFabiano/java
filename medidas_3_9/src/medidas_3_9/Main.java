package medidas_3_9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, quadrado, triangulo, trapezio;
		
		System.out.println("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.println("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.println("Digite a medida C: ");
		sc.nextLine();
		c = sc.nextDouble();
		
		
		quadrado = Math.pow(a, 2);
		triangulo = (a * b) / 2;
		trapezio = ((a + b) * c) / 2;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", quadrado));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", triangulo));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", trapezio));
		
		sc.close();
	}
}
