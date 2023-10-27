package terreno_3_1;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		int largura, comprimento;
		double area, preco_metro, valor_terreno;
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextInt();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextInt();
		
		System.out.println("Digite o preco do metro do terreno: ");
		sc.nextLine();
		preco_metro = sc.nextDouble();
		
		
		area = comprimento * largura;
		valor_terreno = preco_metro * (double)area;
		
		System.out.println("Area do terreno: " + String.format("%.2f", area));
		System.out.println("Preco do terreno: " + String.format("%.2f", valor_terreno));
		
		sc.close();
		
		
		
	}

}
