import java.util.Locale;
import java.util.Scanner;

public class exercicio_youtube_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = Math.pow(B, 2) - 4 * A * C;
		
		if (A == 0.0 || delta < 0.0) {
			System.out.println("Impossível calcular");
		}
		
		else {
			double x1 = (-B + Math.sqrt(delta))/(2.0 * A);
			double x2 = (-B - Math.sqrt(delta))/(2.0 * A);
			
			System.out.printf("X1 = %.5f%n", x1);
			System.out.printf("X2 = %.5f%n", x2);
		}
		
		sc.close();
	}

}
