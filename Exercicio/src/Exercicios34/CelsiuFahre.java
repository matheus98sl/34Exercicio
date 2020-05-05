package Exercicios34;

import java.util.Scanner;

public class CelsiuFahre {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new CelsiuFahre().processar();
	}

	private void processar() {

		System.out.println("Informe a temperatura em Celsius:");
		double celsiu = sc.nextDouble();
		double fahre = (9 * celsiu + 160) / 5;
		System.out.println("A temperatura convertida em Fahrenheit:" + fahre);

		this.sc.close();
	}
}
