package senha_fixa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int senha, nova_senha;
		
		System.out.println("Digite uma senha");
		nova_senha = sc.nextInt();
		
		senha = 0000;
		
		while (senha != nova_senha) {
			
			System.out.println("Senha Incorreta, tente novamente: ");
			senha = sc.nextInt();
			
			
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
		
	}
}
