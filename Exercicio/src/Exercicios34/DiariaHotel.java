package Exercicios34;

import java.util.Scanner;

public class DiariaHotel {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do cliente:");
		String nome = sc.next();
		System.out.println("Sobrenome do cliente:");
		String sobre = sc.next();

		System.out.println("Informe quantidade de diarias:");
		int diaria = sc.nextInt();

		if (diaria > 15) {

			double pagar = 5.50 * diaria;
			System.out.printf("Cliente:" + nome + " " + sobre);
			System.out.printf("\nValor total a pagar:" + (pagar + 60.00));

		} else if (diaria == 15) {
			double pagar = 6.00 * diaria;
			System.out.printf("Cliente:" + nome + " " + sobre);
			System.out.printf("\nValor total a pagar:" + (pagar + 60.00));

		} else if (diaria < 15) {
			double pagar = 8.00 * diaria;
			System.out.printf("Cliente:" + nome + " " + sobre);
			System.out.printf("\nValor total a pagar:" + (pagar + 60.00));
		}

		sc.close();
	}

}
