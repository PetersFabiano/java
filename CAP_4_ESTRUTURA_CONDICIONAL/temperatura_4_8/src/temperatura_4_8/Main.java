package temperatura_4_8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char escala;
		double temperatura, c, f;
		
		
		System.out.println("Você vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);
		
		if (escala == 'F') {
			
			System.out.println("Digite a temperatura em Farenheit: ");
			temperatura = sc.nextDouble();
			
			c = ((temperatura - 32)*5)/9;
			
			System.out.println("Temperatura equivalente em Celsius: " + c);
		}
		else if (escala == 'C') {
			
			System.out.println("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			
			f = ((9 * temperatura)/5) + 32;
			
			System.out.println("Temperatura equivalente em Farenheit: " + f);
		}
		
		
		sc.close();
	}
	
}
