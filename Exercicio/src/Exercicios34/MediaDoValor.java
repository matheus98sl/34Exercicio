package Exercicios34;

import java.util.Scanner;

public class MediaDoValor {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new MediaDoValor().processar();

	}

	private void processar() {

		System.out.println("Primeiro valor:");
		int valor1 = sc.nextInt();
		System.out.println("Segundo valor:");
		int valor2 = sc.nextInt();
		int media = (valor1 + valor2) / 2;
		System.out.println("A media e de:" + media);

		this.sc.close();
	}

}
