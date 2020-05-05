package Exercicios34;

import java.util.Scanner;

public class SomaMaiorigual {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Primeiro valor:");
		int a = sc.nextInt();		
		
		System.out.println("Segundo valor:");
		int b = sc.nextInt();
		
		System.out.println("Terceiro valor:");
		int c = sc.nextInt();
		if(a+b>c) {
			System.out.println("Soma do Primeiro valor e do segundo e maior que o terceiro.");
		}
		else if(a+b<c) {
		System.out.println("Soma do Primeiro valor e do segundo e menor que o terceiro");	
			
		}
		else if (a+b==c) {
			System.out.println("Soma do Primeiro valor e do segundo e igual ao terceiro.");
		}
	

		}
	}


