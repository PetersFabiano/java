package multiplos_4_10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, maior, menor, resto;
		
		System.out.println("Digite dois numeros inteiros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		if (num1 > num2 ) {
			
			 maior = num1;
			 
		}
		else {
			
			maior = num2;
			
		}
		
		if (num1 < num2 ) {
			
			menor = num1;
			
		}
		else {
			
			menor = num2;
		}
		
		resto = maior % menor;
		
		if (resto == 0) {
			
			System.out.println("Sao multiplos");
			
		}
		else {
			
			System.out.println("Não são multiplos");
		}
			
		
		sc.close();
	}
}
