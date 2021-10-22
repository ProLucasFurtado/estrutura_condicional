import java.util.Scanner;

/* 03) Leia 2 valores inteiros (A e B). Após, o
programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos", indicando se os valores
lidos são múltiplos entre si. Atenção: os números
devem poder ser digitados em ordem crescente ou
decrescente.*/

public class exercicio_proposto_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		
		else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
		
		
	}

}
