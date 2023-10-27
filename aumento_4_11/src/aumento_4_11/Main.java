package aumento_4_11;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double salario, aumento, novo_salario;
		
		System.out.println("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		
			if (salario <= 1000.00) {
				
				aumento = (salario * (20.00/100.00));
				novo_salario = salario + aumento;
				
				System.out.println("Novo salario = R$" + String.format("%.2f", novo_salario));
				System.out.println("Aumento = R$" + String.format("%.2f", aumento));
				System.out.println("Porcentagem = 20%");
				
			}
			
			else if (salario > 1000.00 && salario <= 3000) {
				
				aumento = 15.00/100.00 * salario;
				novo_salario = salario + aumento;
				
				System.out.println("Novo salario = R$" + String.format("%.2f", novo_salario));
				System.out.println("Aumento = R$" + String.format("%.2f", aumento));
				System.out.println("Porcentagem = 15%");
				
			}
				
			else if (salario > 3000.00 && salario <= 8000.00) {
				
				aumento = (salario * (10.00/100.00));
				novo_salario = salario + aumento;
				
				System.out.println("Novo salario = R$" + String.format("%.2f", novo_salario));
				System.out.println("Aumento = R$" + String.format("%.2f", aumento));
				System.out.println("Porcentagem = 20%");
				
			}
				
			else if (salario > 8000.00) {
				
				aumento = (salario * (5.00/100.00));
				novo_salario = salario + aumento;
				
				System.out.println("Novo salario = R$" + String.format("%.2f", novo_salario));
				System.out.println("Aumento = R$" + String.format("%.2f", aumento));
				System.out.println("Porcentagem = 20%");
				
			}
			
		sc.close();
	}
}
