package Exercicios34;

import java.util.Scanner;

public class UniaoDeVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int[]veta=new int[] {5,6,4};
	int[]vetb=new int[] {2,4,6};
	int[]vetc=new int[] {5,1,3};
	
	for (int i = 0; i < veta.length; i++) {
		System.out.println("Vetor A");
		System.out.printf("Valor pra posicao:",i,":");
		veta[i]=sc.nextInt();
		
	}
for (int i = 0; i < vetb.length; i++) {
	System.out.println("Vetor B");
	System.out.printf("Valor pra posicao:",i,":");
vetb[i]=sc.nextInt();
}


		

	
}
		
	
	
	
	
	}


