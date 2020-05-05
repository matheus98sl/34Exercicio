package Exercicios34;

import java.util.Scanner;

public class QuadradoCubo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new QuadradoCubo().processar();
	}

	private void processar() {

		System.out.println("Informe um valor:");
		int valor = sc.nextInt();

		int quadrado = (int) Math.pow(valor, 2);
		int cubo = (int) Math.pow(valor, 3);

		System.out.printf("Quadrado:%d \nCubo:%d", quadrado, cubo);

		this.sc.close();
	}
}
