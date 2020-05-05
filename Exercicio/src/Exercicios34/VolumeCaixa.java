package Exercicios34;

import java.util.Scanner;

public class VolumeCaixa {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new VolumeCaixa().processar();
	}

	private void processar() {

		System.out.println("Informe o comprimento:");
		double comprimento = sc.nextDouble();
		System.out.println("Informe a largura:");
		double largura = sc.nextDouble();
		System.out.println("Informe a altura:");
		double altura = sc.nextDouble();
		double volume = comprimento * largura * altura;
		System.out.printf("O volume da caixa e de:%.2f", volume);

		this.sc.close();
	}
}
