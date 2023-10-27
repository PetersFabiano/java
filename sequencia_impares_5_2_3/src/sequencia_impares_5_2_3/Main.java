package sequencia_impares_5_2_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//int i;
		double x, i;
		double resto;
		
		
		
		System.out.println("Digite o valor de X");
		x = sc.nextInt();
		 
		for(i=1; i < x; i++ ) {
		
			resto = i % 2;
			
			if (resto != 0 ) {
				
				System.out.println(i);
				
			}
			
		}
		
		sc.close();
	}
}
