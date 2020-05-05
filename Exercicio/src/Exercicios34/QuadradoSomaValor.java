package Exercicios34;

import java.util.Scanner;

public class QuadradoSomaValor {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new QuadradoSomaValor().processar();

	}

	private void processar() {
		
		System.out.println("Informe um valor:");
		double valor1 = sc.nextDouble();
		System.out.println("Informe um segundo valor:");
		double valor2 = sc.nextDouble();
		double soma = Math.pow(valor1,2)+Math.pow(valor2,2);
		System.out.println("A soma dos valore e de:"+soma);

		this.sc.close();
	}

}
