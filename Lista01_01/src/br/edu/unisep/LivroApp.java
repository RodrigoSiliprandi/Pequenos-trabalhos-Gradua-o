package br.edu.unisep;

import java.util.Scanner;

public class LivroApp {
	
	public static void main(String[] args) {
		Livro l1 = new Livro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o Titulo do livro: ");
		l1.titulo = sc.nextLine();
		
		System.out.println("Informe o Autor do livro: ");
		l1.autor = sc.nextLine();
		
		System.out.println("Informe a data de publicação do livro: ");
		l1.datapub = sc.nextInt();
				
		System.out.println("O titulo do livo é " + l1.titulo);
		System.out.println("O autor do livro é " + l1.autor);
		System.out.println("A data de publicação é " + l1.datapub);
		
		sc.close();
		
		
		
		
	}

}
