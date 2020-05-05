package Exercicios34;

import java.util.Scanner;

public class NumeroInverso {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("informe um numero:");
		int numero = sc.nextInt();
		
		inverte(numero);
	}
	private static void inverte(int numero) {
		
		int i = 0;
		while (numero > 0) {
			 i *= 10;
			 i += (numero % 10);
			 numero /= 10;
			 } 
			 
			 System.out.printf("O número invertido é: %d.\n", i);
			
		}
		
		
		
	}

