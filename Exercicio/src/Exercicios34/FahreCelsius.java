package Exercicios34;

import java.util.Scanner;

public class FahreCelsius {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new FahreCelsius().processar();

	}

	private void processar() {

		System.out.println("Informe a temperatura em Fahrenheit:");
		double fahre = sc.nextDouble();
		double celsiu = (fahre - 32) * 5 / 9;
		System.out.printf("A temperatura em Celsius:%.2f",celsiu);

		this.sc.close();
	}
}