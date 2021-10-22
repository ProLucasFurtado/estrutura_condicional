import java.util.Locale;
import java.util.Scanner;

/* 05) Com base na tabela abaixo, escreva um
programa que leia o código de um item e a
quantidade deste item. A seguir, calcule e
mostre o valor da conta a pagar.*/
public class exercicio_proposto_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		
		double valorContaPagar=0;
		
		if (codigo == 1) {

			valorContaPagar = qtd * 4.00;
		}
		else if (codigo == 2) {
			valorContaPagar = qtd * 4.50;
		}
		else if (codigo == 3) {
			valorContaPagar = qtd * 5.00;
		}
		else if (codigo == 4) {
			valorContaPagar = qtd * 2.00;
		}
		else if (codigo == 5) {
			valorContaPagar = qtd * 1.50;
		}
		else {
			System.out.println("Valor inesperado => " + codigo);
		}
		
		System.out.printf("Total: R$ %.2f%n", valorContaPagar);
		sc.close();
		
	}

}
