package Exercicios34;

import java.util.Scanner;

public class SomaNumInt {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new SomaNumInt().processar();
	}

	private void processar() {

		System.out.println("1º Valor:");
		int v1 = sc.nextInt();
		System.out.println("2º Valor:");
		int v2 = sc.nextInt();
		int soma = v1 + v2;
		System.out.printf("A soma dos valore e de:"+soma);

		this.sc.close();
	}
}
