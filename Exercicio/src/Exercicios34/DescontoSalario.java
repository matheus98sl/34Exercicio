package Exercicios34;

import java.util.Scanner;

public class DescontoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Descontos 10% Previdencia Social 5% Imposto");
		System.out.println("Infore Seu Salario:");
		double sal = sc.nextDouble();

		double totaldesconto = (15 * sal) / 100;
		double salliquido = sal - totaldesconto;

		System.out.printf("Total de descontos %.2f", totaldesconto);
		System.out.printf("\nSalario final %.2f", salliquido);

		System.out.println("");

		sc.close();
	}

}
