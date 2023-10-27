package consumo_3_8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dist_km, combustivel, consumo;
		
		System.out.println("Distancia percorrida: ");
		dist_km = sc.nextDouble();
		System.out.println("Combustivel gasto: ");
		combustivel = sc.nextDouble();
		
		consumo = dist_km / combustivel;
		
		System.out.println("Consumo medio: " + consumo);
		
		sc.close();
		
	}
}
