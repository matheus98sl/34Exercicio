package Exercicios34;

import java.util.Scanner;

public class AreaTriangulo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new AreaTriangulo().processar();
	}

	private void processar() {
		int rs = 1;
		while (rs == 1) {
			System.out.println("Informe a base:");
			double base = sc.nextDouble();
			System.out.println("Informe a altura:");
			double altura = sc.nextDouble();
			double area = (base * altura) / 2;
			System.out.printf("A Area e de: %.2f m", area);
			System.out.println("\nRepetir Calculo(1/0)");
			rs = sc.nextInt();
		}

		this.sc.close();
	}

}
