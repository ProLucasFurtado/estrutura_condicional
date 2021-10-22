import java.util.Scanner;

/*PROBLEMA EXEMPLO 02
Sintaxe Opcional - Switch-case

02) Fazer um programa para ler um valor inteiro
de 1 a 7 representando um dia da semana (sendo
1=domingo, 2=segunda, e assim por diante). Escrever
na tela o dia da semana correspondente, conforme
exemplos.*/

public class exercicio_opcional_switch_case_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia = null;
		
	    switch (x) {
	    case 1: 
	    	dia = "Domingo";
	    	break;
	   
	    case 2: 
	    	dia = "Segunda";
	    	break;
	    
	    case 3: 
	    	dia = "Terça";
	    	break;
	    
	    case 4:
	    	dia = "Quarta";
	    	break;
	   
	    case 5: 
	    	dia = "Quinta";
	    	break;
	    
	    case 6: 
	    	dia = "Sexta";
	    	break;
	   
	    case 7: 
	    	dia = "Sábado";
	    	break;
	    
	    default: 
	    	dia = "Valor Inválido!!!";
	    	break;
	    }
	    
	    System.out.println("Dia da semana: " + dia);
	    	
		sc.close();

	}

}
