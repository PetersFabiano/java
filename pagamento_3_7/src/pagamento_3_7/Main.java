package pagamento_3_7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valor_p_hora, horas_trabalhadas, pagamento;
		
		System.out.println("Nome: ");
		nome = sc.nextLine();
		System.out.println("Valor por hora: ");
		valor_p_hora = sc.nextDouble();
		System.out.println("Horas trabalhadas: ");
		sc.nextLine(); // limpeza do buffer
		horas_trabalhadas = sc.nextDouble();
		
		pagamento = valor_p_hora * horas_trabalhadas;
		
		System.out.println("O Pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();
	}
}
