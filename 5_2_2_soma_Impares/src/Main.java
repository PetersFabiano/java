import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma, troca, i;
		
		System.out.println("Digite dois numeors: ");
		x = sc.nextInt();
		y = sc.nextInt();
		sc.nextLine();
		if(x > y) {
			
			troca = x;
			
			x = y;
			
			y = troca;
			
			}
		
		soma =0;
		for(i = x + 1; i < y ; i ++) {
			
			if(i % 2 != 0) {
				
				soma = soma + i;
				
			}
			
		}
		
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		sc.close();
			
	}
	
}

