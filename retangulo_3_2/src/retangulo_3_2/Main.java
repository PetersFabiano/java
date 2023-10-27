package retangulo_3_2;

import java.util.Locale;  // importando blibioteca de localidade ( troca , para . separador decimal)
import java.util.Scanner; // importando blibioteca scaner ( entrada de dados)
import java.lang.Math;  // importando blibioteca matematica


public class Main {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double base, altura, area, perimetro, diagonal, quadrado;
		
		System.out.println("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.println("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = (2 * base) + (2 * altura);
		quadrado = Math.pow(altura, 2) + Math.pow(base, 2);
		diagonal = Math.sqrt(quadrado);
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}
}
