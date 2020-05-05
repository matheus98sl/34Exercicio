package Exercicios34;

import java.util.Scanner;

public class AreaCircunferencia {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new AreaCircunferencia().processar();
	}

	private void processar() throws Exception {
		char rs = 's';
		while (rs == 's') {
			double pi = 3.14159;
			System.out.println("Informe o raio:");
			double raio = sc.nextDouble();
			double area = pi * (raio * raio);
			System.out.printf("A area e de: %.2f m", area);
			System.out.println("\nRepetir Calculo(s/n)");
			rs = (char) System.in.read();
		}
		this.sc.close();
	}
}
