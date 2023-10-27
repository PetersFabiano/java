package media_idades;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, n;
		double media, soma;
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		if (idade <0) {
			
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			
			soma = 0;
			n = 0;
			
			while(idade >= 0 ) {
				
				soma = soma + idade;
				n++;
				idade = sc.nextInt();
				
			}
			
			media = soma / n;
			
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		
		sc.close();
	}
}
