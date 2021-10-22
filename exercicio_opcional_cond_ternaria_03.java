import java.util.Scanner;

/*Expressão condicional Ternária
Estrutura opcional ao if-else quando se deseja decidir
um VALOR com base em uma condição.*/

/*Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso*/

public class exercicio_opcional_cond_ternaria_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5, desconto;
		
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		sc.close();
		
	}

}
