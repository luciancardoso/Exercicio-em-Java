/*	
 * 	Média 2
 * 	URI Online Judge | 1006
 * 
 * 	Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
 * 	A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
 * 	Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 * 
 * 	Entrada
 * 	O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 * 
 * 	Saída
 * 	Imprima a variável MEDIA conforme exemplo abaixo, 
 * 	com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
 * 	Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 *  caso contrário, você receberá "Presentation Error".
 * 
 * 	Exemplos de Entrada				Exemplos de Saída
 * 	
 * 	5.0	| 5.0   | 10.0				MEDIA = 6.3
 * 	6.0 | 10.0	| 10.0				MEDIA = 9.0
 * 	7.0 | 10.0	| 5.0				MEDIA = 7.5
 * 
 */

import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) 
	{
		
		Scanner i = new Scanner(System.in);
		
		double A, B, C, MEDIA;
		
		System.out.println("Digite a primeira nota: ");
		A = i.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		B = i.nextDouble();
		
		System.out.println("Digite a terceiro nota: ");
		C = i.nextDouble();
		
		MEDIA = ((A*2)+(B*3)+(C*5))/10;
		
		System.out.println("Sua Média: " + MEDIA);
		
		
		
	}

}
