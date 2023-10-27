package menor_de_tres_4_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, menor;
		
		System.out.println("Primeiro Valor: ");
		num1 = sc.nextInt();
		System.out.println("Segundo Valor: ");
		num2 = sc.nextInt();
		System.out.println("Terceiro Valor: ");
		sc.nextLine(); //limpeza de buffer
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3 ) {
			
			 menor = num1;
			
		}
		else {
			
			if(num2 < num3) {
				
				menor = num2;
				
			}
			else {
				
				menor = num3;
			}
		}
		
		System.out.println("MENOR = " + menor);
		sc.close();
		
		
	}
	
}
