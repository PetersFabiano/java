package circulo_3_6;

import java.util.Locale;
import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double r, area;
			
			System.out.println("Digite o valor do raio do circulo: ");
			r = sc.nextDouble();
			
			area = Math.PI * Math.pow(r,2);
			
			System.out.println("AREA = " + String.format("%.3f", area));
			
			sc.close();
		}
}
