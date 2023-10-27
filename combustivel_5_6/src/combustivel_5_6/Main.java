package combustivel_5_6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);;
		
		int codigo, alcool, gasolina, disel;
		
		alcool = 0;
		gasolina = 0;
		disel = 0;
		
		System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		codigo = sc.nextInt();
		
		while(codigo != 4) {
			
			switch (codigo) {
			
				case 1:
					alcool = alcool + 1;
				break;
				
				case 2:
					gasolina = gasolina + 1;
				break;
				
				case 3:
					disel = disel + 1;
				break;
				
			}
			
			System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO ");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Disel: " + disel);
	 sc.close();	
	}
}
