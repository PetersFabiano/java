package valida_nota_5_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, total, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		sc.nextLine();
		
		total = nota1 + nota2;
		media = total / 2;
		
		while(nota1 >=0 && nota2<=10) {
			

			if (media < 6.00) {
		
				System.out.println("NOTA FINAL: " + total);
				System.out.println("MEDIA: " + media);
				System.out.println("REPROVADO");
				}	
			else{
			
				System.out.println("NOTA FINAL: " + total);
				System.out.println("MEDIA: " + media);
			}
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			sc.nextLine();
			
			total = nota1 + nota2;
			media = total / 2;
		}
		sc.close();
	}
}
