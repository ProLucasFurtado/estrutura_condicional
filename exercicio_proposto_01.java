import java.util.Scanner;

/* 01) Fazer um programa para ler um número inteiro,
e depois dizer se este número é negativo ou não.*/
public class exercicio_proposto_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();	
	}

}
