package Exercicios34;

import java.util.Scanner;

public class SomaDeVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]vetor1= new int [5];
		int[]vetor2= new int [5];
		int[]vetor3= new int [5];
		int soma = 0;
		System.out.println("Informe 5 numeros:");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Vetor1["+i+"] = ");
			vetor1[i]=sc.nextInt();
		}
		System.out.println("Informe mais 5 numeros:");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Vetor2["+i+"] = ");
			vetor2[i]=sc.nextInt();
		}
	
			for (int i = 0; i < vetor3.length; i++) {
				vetor3[i] = vetor1[i] + vetor2[i];
			}
			System.out.println("\n\n Resultado");
			for (int i = 0; i < vetor3.length; i++) {
				System.out.println(" Vetor[" + i + "] = " + vetor3[i]);
				
			}


		
		
		
		

		
	}

}
