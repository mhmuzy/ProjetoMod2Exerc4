package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			System.out.println("");
			System.out.println("         Hitss Treinamento");
			System.out.println("");
			int idade1, idade2;
			double media;
			
			Scanner teclado = new Scanner(System.in);
			
			do {
				
				System.out.println("Digite a 1ª idade:");
				System.out.println("");
				idade1 = teclado.nextInt();
				
				System.out.println("");
				
				System.out.println("Digite a 2º idade:");
				System.out.println("");
				idade2 = teclado.nextInt();
				
				System.out.println("");
				
				media = (idade1 + idade2) / 2;
				
				System.out.println("A média das idades é de: " + media);
				
				System.out.println("");
				
			} while (idade1 != 0 || idade2 != 0);
			
			if (idade1 == 0 || idade2 == 0) {
				
				System.out.println("Fim do Programa.");
			}
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
