package tabuada_5_2_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, produto;
		
		System.out.println("Deseja a tabuada para qual numero? ");
		n = sc.nextInt();		
		
		for(i = 1; i <= 10; i++) {
			
			produto = n * i;
			
			System.out.println(n + " x " + i + " = " + produto );
		}
		
	sc.close();	
	}
}
