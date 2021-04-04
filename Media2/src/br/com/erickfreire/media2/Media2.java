package br.com.erickfreire.media2;

import java.util.Scanner;

/**
 * Crie um programa que calcula a média de notas de um aluno
 * @author Erick Freire
 * @version 1 - Criado em 04-04-2021 as 18:16
 */

public class Media2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contadorNotas = 0;
		
		System.out.print("Informe uma nota ou -1 para sair");
		int nota = entrada.nextInt();
		
		while(nota != -1) {
			total = total + nota;
			contadorNotas = contadorNotas + 1;
			
			System.out.print("Informe uma nota ou -1 para sair");
			nota = entrada.nextInt();
		}
		
		if(contadorNotas != 0) {
			double media = (double) total / contadorNotas;
			
			System.out.printf("%nO Total de %d Notas inseridas é: %d%n", contadorNotas, total);
			System.out.printf("A média é de: %.2f%n", media);
		} else
			System.out.println("Nenhuma nota inserida.");

	}

}
