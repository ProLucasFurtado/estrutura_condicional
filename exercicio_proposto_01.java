import java.util.Scanner;

/* 01) Fazer um programa para ler um n�mero inteiro,
e depois dizer se este n�mero � negativo ou n�o.*/
public class exercicio_proposto_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();	
	}

}
