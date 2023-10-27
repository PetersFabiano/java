package troco_3_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double preco_produto, qtd, dinheiro_recebido, total, troco;
		
		System.out.println("Preço unitario do produto: ");
		preco_produto = sc.nextDouble();
		System.out.println("Quantidade comprada: ");
		qtd = sc.nextDouble();
		sc.nextLine();
		System.out.println("Dinheiro recebido: ");
		dinheiro_recebido = sc.nextDouble();
		
		//Troco
		
		total = preco_produto * qtd;
		troco = dinheiro_recebido - total;
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}
	
}
