package Exercicios34;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor da compra:");
		int valcompra = sc.nextInt();
		System.out.println("Valor pago:");
		int pago = sc.nextInt();
		
		int troco = pago - valcompra;
	System.out.println("Valor do troco:"+troco);
		
		
		
		if (troco >= 100) {
			int n100 = troco / 100;
			System.out.println("Notas de 100:" + n100);

			troco = troco - (n100 * 100);
			int n10 = troco / 10;
			System.out.println("notas de 10:" + n10);

			troco = troco - (n10 * 10);
			System.out.println("notas de 1:" + troco);

		} else if (troco < 100) {
			int n100 = troco / 100;
			System.out.println("Notas de 100:" + n100);

			troco = troco - (n100 * 100);
			int n10 = troco / 10;
			System.out.println("notas de 10:" + n10);

			troco = troco - (n10 * 10);
			System.out.println("notas de 1:" + troco);

		} else if (troco < 50) {

			int n100 = troco / 100;
			System.out.println("Notas de 100:" + n100);

			troco = troco - (n100 * 100);
			int n10 = troco / 10;
			System.out.println("notas de 10:" + n10);

			troco = troco - (n10 * 10);
			System.out.println("notas de 1:" + troco);

		}

	}

}
