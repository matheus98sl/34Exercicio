package Exercicios34;

import java.util.Scanner;

public class ValorDoVolume {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new ValorDoVolume().processar();

	}

	private void processar() {
		double pi = 3.14159;
		System.out.println("Informe o raio:");
		double raio = sc.nextDouble();
		System.out.println("Informe a altura:");
		double altura = sc.nextDouble();
		double volume =pi*Math.pow(raio,2)*altura;

		System.out.printf("O valor do volume e de:%.2f", volume);

		this.sc.close();
	}
}
