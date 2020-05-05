package Exercicios34;

import java.util.Scanner;

public class CardapioRestaurante {

	public static void main(String[] args) {
		CardapioRestaurante card = new CardapioRestaurante();
		card.processar();
	}

	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");

	private int quant;

	private void lerDadosComum() {
		System.out.println("Quantidade");
		this.quant = sc.nextInt();
	}

	private void processar() {
		int op = 0;
		do {
			System.out.println("\n100 Cachorro quente R$:1,10");
			System.out.println("101 Bauru simples   R$:1,30");
			System.out.println("102 Bauru c/ovo     R$:1,50");
			System.out.println("103 Hamburger       R$:1,10");
			System.out.println("104 Cheeseburger    R$:1,30");
			System.out.println("105 Refrigerante    R$:1,00");
			System.out.println("999 SAIR");
			System.out.println("Selecione a sua opcao");
			op = this.sc.nextInt();
			switch (op) {
			case 100:
				lerDadosComum();
				double pagar = 1.10 * this.quant;
				System.out.println("\nValor a pagar pelo Cachorro quente:" + pagar);

				break;
			case 101:
				lerDadosComum();
				double pagar2 = 1.30 * this.quant;
				System.out.println("Valor a pagar pelo Bauru simples:" + pagar2);
				break;
			case 102:
				lerDadosComum();
				double pagar3 = 1.50 * this.quant;
				System.out.println("Valor a pagar pelo Bauru c/ovo:" + pagar3);
				break;
			case 103:
				lerDadosComum();
				double pagar4 = 1.10 * this.quant;
				System.out.println("Valor a pagar pelo Hamburger:" + pagar4);

				break;
			case 104:
				lerDadosComum();
				double pagar5 = 1.30 * this.quant;
				System.out.println("Valor a pagar pelo Cheeseburger :" + pagar5);

				break;
			case 105:
				lerDadosComum();
				double pagar6 = 1.30 * this.quant;
				System.out.println("Valor a pagar pelo Refrigerante :" + pagar6);
				break;
			case 999:
				System.out.println("OBRIGADO");
				break;

			default:
				break;
			}
		} while (op != 999);

	}

}
