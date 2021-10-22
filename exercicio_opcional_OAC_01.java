import java.util.Locale;
import java.util.Scanner;

/*PROBLEMA EXEMPLO 01
Sintaxe Opcional - Operadores de Atribui��o Cumulativa

01) Uma operadora de telefonia cobra R$ 50.00 por um
plano b�sico que d� direito a 100 minutos de telefone.
Cada minuto que exceder a franquia de 100 minutos custa
R$ 2.00. Fazer um programa para ler a quantidade de minutos
que uma pessoa consumiu, da� mostrar o valor a ser pago.*/

public class exercicio_opcional_OAC_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdminutos = sc.nextInt();
		double plano = 50;
		
		if(qtdminutos > 100.0) {
			plano += (qtdminutos - 100.0) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", plano);
		sc.close();
	}

}
