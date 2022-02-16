import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
		 * n. A última linha não deve conter nenhum espaço.
		 */

		//ABRINDO A ENTRADA PARA RECEBER O NUMERO DE DEGRAUS NO CONSOLE
		Scanner s = new Scanner(System.in);

		System.out.println("Digite a quantidade de degraus da escada: ");
		int degrau = s.nextInt();
		
		/*Variável 'linha' representa a quantidade de linhas da escada  e vai sendo incrementada
		 * a cada laço do for até atingir o numero de degraus fornecidos na entrada*/
		
		/*Variável 'j' representa a quantidade de espaços que precisam ser colocados em cada linha,
		 *  que é a diferença entre a quantidade de degraus e o numero da presente linha*/
		
		/*Variável 'asterisco' representa a quantidade de asteriscos que precisam ser colocados em cada linha,
		 *  que é correspondente ao número da presente linha. Para que haja quebra de linha, o critério de parada é
		 *  o valor asterisco ser menor que o valor da linha, então o problema é corrigido com a impressão do último
		 *  asterisco da linha fora deste laço*/
		
		for (int linha = 1; linha <= degrau; linha++) { 
			for (int j = degrau - linha; j > 0; j--) {
				System.out.print(" ");
			}			
			for (int asterisco = 1; asterisco<linha; asterisco++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
