package dardo_4_7;

import java.util.Locale;
import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double dist1, dist2, dist3, maior;
			
			System.out.println("Digite as tres distancias: ");
			dist1 = sc.nextDouble();
			dist2 = sc.nextDouble();
			sc.nextLine(); //limpeza de buffer
			dist3 = sc.nextDouble();
						
			
			if (dist1 > dist2 && dist1 > dist3 ) {
				
				 maior = dist1;
				
			}
			else {
				
				if(dist2 > dist3) {
					
					maior = dist2;
					
				}
				else {
					
					maior = dist3;
				}
			}
			
			System.out.println("MAIOR DISTANCIA = " + maior);
			sc.close();
			
			
		}
	
}
