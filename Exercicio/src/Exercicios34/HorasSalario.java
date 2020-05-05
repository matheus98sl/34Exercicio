package Exercicios34;

import java.util.Scanner;

public class HorasSalario {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new HorasSalario().processar();
	}

	public void processar() {

		System.out.println("Horas trabalhadas no mes:");
		double ht = sc.nextDouble();
		System.out.println("Valor hora trabalhada:");
		double vh = sc.nextDouble();
		System.out.println("Percentual de desconto:");
		double pd = sc.nextDouble();
		double sb = ht * vh;
		double td = (pd / 100) * sb;
		double sl = sb - td;
		System.out.printf(" Salario Bruto R$:%.2f \n Total Desconto R$:%.2f \n Salario liquido R$:%.2f",sb,td,sl);

		this.sc.close();
	}

}
