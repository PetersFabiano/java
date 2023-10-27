package tempo_de_jogo_4_12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora_inicial, hora_final;
		
		System.out.println("Hora Inicial: ");
		hora_inicial = sc.nextInt();
		System.out.println("Hora final: ");
		hora_final = sc.nextInt();
		
		if (hora_inicial < hora_final) {
			
			System.out.printf("O JOGO DUROU %d HORAS", hora_final - hora_inicial);
			
		}
		else {
			
			System.out.printf("O JOGO DUROU %d HORA(S)", hora_inicial - hora_final);
		}
		
		sc.close();
	}
}
