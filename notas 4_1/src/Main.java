import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, total;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		sc.nextLine();
		
		total = nota1 + nota2;
		
		if (total < 60.00) {
		
			System.out.println("NOTA FINAL: " + total);
			System.out.println("REPROVADO");
		}	
		else{
			
				System.out.println("NOTA FINAL: " + total);
		}
		
		sc.close();
	}
}
