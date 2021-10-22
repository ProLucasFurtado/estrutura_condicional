import java.util.Scanner;

/* 02) Fazer um programa para ler um número
inteiro e dizer se este número é par ou ímpar.*/
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
