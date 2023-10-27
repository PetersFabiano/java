package lanchonete_4_9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		double preco_produto, qtd, total;
		
		System.out.println("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.println("Quantidade Comprada: ");
		qtd = sc.nextDouble();
		
		
		switch (codigo) {
		
		case 1:
			
			preco_produto = 5.00;
			total = qtd * preco_produto;
			System.out.println("Valor a pagar R$" + String.format("%.2f", total));
			
			break;
		case 2:
			
			preco_produto = 3.50;
			total = qtd * preco_produto;
			System.out.println("Valor a pagar R$" + String.format("%.2f", total));
			
			break;
		case 3:	
			
			preco_produto = 4.80;
			total = qtd * preco_produto;
			System.out.println("Valor a pagar R$" + String.format("%.2f", total));
			
			break;
		case 4:	
			
			preco_produto = 8.90;
			total = qtd * preco_produto;
			System.out.println("Valor a pagar R$" + String.format("%.2f", total));
			
			break;
		case 5:	
			
			preco_produto = 7.32;
			total = qtd * preco_produto;
			System.out.println("Valor a pagar R$" + String.format("%.2f", total));
			
			break;
		default:	
		
			}
		sc.close();
	}
}
