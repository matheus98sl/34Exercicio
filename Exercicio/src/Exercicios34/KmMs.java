package Exercicios34;

import java.util.Scanner;

public class KmMs {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new KmMs().processar();

	}

	private void processar() {

		System.out.println("Infome a velocide do veliculo:");
		double km = sc.nextDouble();
		double ms = km / 3.6;
		System.out.printf("A velocidade em M/S e de:%.2f",ms);

		this.sc.close();
	}
}
