package operadora_4_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	 
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total, minutos, aparte, amais;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextDouble();
		
		if (minutos < 100) {
			
			System.out.println("Valor a pagar: R$50.00 ");
			
			
		}
		else if (minutos > 100) {
			
		aparte = minutos - 100;
		amais = aparte * 2;
		
		total = amais + 50;
		
		System.out.println("Valor a pagar: R$" + String.format("%.2f", total));
		
		} 
		
		sc.close();
	}
	
}
