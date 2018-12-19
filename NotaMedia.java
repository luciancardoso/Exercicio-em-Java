/*	
 * 	Média de Aluno
 * 	Autor: Lucian Cardoso
 * 
 */

import java.util.Scanner;

public class NotaMedia {
	
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	double nota1, nota2, nota3, nota4, soma;
	
	System.out.println("Digite a primeira nota: ");
	nota1 = in.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	nota2 = in.nextDouble();
	
	System.out.println("Digite a terceira nota: ");
	nota3 = in.nextDouble();
	
	System.out.println("Digite a quarta nota: ");
	nota4 = in.nextDouble();
	
	soma = nota1+nota2+nota3+nota4;
	soma = soma /4;
	
	if(soma > 7) {
		System.out.println("Sua média e de: " + soma + " Aluno Aprovado !!!");
	}else {
		if(soma < 7) {
			System.out.println("Aluno reprovado: " + soma);
		}else {
			if(soma > 9) {
				System.out.println("Sua média e de: " + soma + " Aprovado com Louvor !!!");
			}
		}
	}
	
	}
}
