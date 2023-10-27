package glicos_4_6;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double glicose;
		
		System.out.println("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			
			System.out.println("Classificação: normal");
			
		}
		else if ((glicose >= 100) && (glicose <= 140)) {
			
			System.out.println("Classificação: elevado");
			
		}
		else if (glicose > 140) {
			
			System.out.println("Classificção: diabetes");
		}	
		
		sc.close();
			
			
		}
		
	}
	

