import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		 * caractere * e espa�os. A base e altura da escada devem ser iguais ao valor de
		 * n. A �ltima linha n�o deve conter nenhum espa�o.
		 */

		//ABRINDO A ENTRADA PARA RECEBER O NUMERO DE DEGRAUS NO CONSOLE
		Scanner s = new Scanner(System.in);

		System.out.println("Digite a quantidade de degraus da escada: ");
		int degrau = s.nextInt();
		
		/*Vari�vel 'linha' representa a quantidade de linhas da escada  e vai sendo incrementada
		 * a cada la�o do for at� atingir o numero de degraus fornecidos na entrada*/
		
		/*Vari�vel 'j' representa a quantidade de espa�os que precisam ser colocados em cada linha,
		 *  que � a diferen�a entre a quantidade de degraus e o numero da presente linha*/
		
		/*Vari�vel 'asterisco' representa a quantidade de asteriscos que precisam ser colocados em cada linha,
		 *  que � correspondente ao n�mero da presente linha. Para que haja quebra de linha, o crit�rio de parada �
		 *  o valor asterisco ser menor que o valor da linha, ent�o o problema � corrigido com a impress�o do �ltimo
		 *  asterisco da linha fora deste la�o*/
		
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
