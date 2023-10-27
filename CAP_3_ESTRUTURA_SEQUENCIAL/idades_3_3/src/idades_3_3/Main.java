package idades_3_3;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double idade1,idade2,media;
		String nome1, nome2;
		
		System.out.println("Digite o primeiro nome: ");
		nome1 = sc.nextLine();
		System.out.println("Idade: ");
		idade1 = sc.nextDouble();
		
		System.out.println("Digite o segundo nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Idade: ");
		idade2 = sc.nextDouble();
		
		media = (idade1 + idade2)/2;
		
		System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + media + " anos" );
		
		sc.close();
		
	}
	
}
