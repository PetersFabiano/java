package duracao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int horas, minutos, segundos, resto;
		
		System.out.println("Digite a duração em segundos: ");
		segundos = sc.nextInt();
		
		horas = segundos / 3600 ;
		resto = segundos % 3600;
		minutos = resto / 60 ;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
		
	}
}
