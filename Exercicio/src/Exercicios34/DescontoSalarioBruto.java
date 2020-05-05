package Exercicios34;

import java.util.Scanner;

public class DescontoSalarioBruto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu salario:");
		int sal = sc.nextInt();

		double desc = (10 * sal) / 100;
		double desc2 = (5 * desc) / 100;

		double liquido = desc + desc2 - sal;
		System.out.printf("\nValor do primeiro Desconto  :" + desc);
		System.out.printf("\nValor do segundo Desconto :" + desc2);
		System.out.printf("\nSalario final:" + liquido);

	}

}
