import java.util.Scanner;

/* 02) Fazer um programa para ler um n�mero
inteiro e dizer se este n�mero � par ou �mpar.*/
public class exercicio_proposto_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
