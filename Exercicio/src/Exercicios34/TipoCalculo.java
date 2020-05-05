package Exercicios34;

import java.util.Scanner;

public class TipoCalculo {

	public static void main(String[] args) {

		TipoCalculo cl = new TipoCalculo();
		cl.processar();
	}

	Scanner sc = new Scanner(System.in);

	double numero;

	private void dados() {
		System.out.println("Informe um numero:");
		this.numero = sc.nextDouble();
	}

	private void processar() {

		int op = 0;
		double result;
		do {
		System.out.println("\n101 Raiz quadrada");
		System.out.println("102 A metade");
		System.out.println("103 10% do numero ");
		System.out.println("104 o dobro");
		System.out.println("000 SAIR");
		System.out.println("Escolha a opcao");
		op = sc.nextInt();

		switch (op) {
		case 101:
			dados();
			result = Math.sqrt(this.numero);
			System.out.println("Resultado Da Raiz Quadrada:"+ result);
			break;
		case 102:
			dados();
			result = this.numero/2;
			System.out.println("Resultado Da Metade:"+ result);

			break;
		case 103:
			dados();
			result = (10*this.numero)/100;
			System.out.println("Resultado De 10% Do Numero:"+ result);
			break;
		case 104:
			dados();
			result = 2* this.numero;
			System.out.println("Resultado Do Dobro Do Numero:"+ result);

			
		break;
		case 000:
			System.out.println("OBRIGADO");

			break;

		default:
			break;
		}
		}while(op != 000);

	}

}
