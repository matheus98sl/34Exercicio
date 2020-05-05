package Exercicios34;

import java.util.Scanner;

public class QuocienteResto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor Do Dividendo:");
		int di = sc.nextInt();
		System.out.println("Valor Do Divisor:");
		int div = sc.nextInt();

		int quo = di / div;
		int rest = (di % div);
		System.out.println("Quociente:" + quo);
		System.out.println("Resto:" + rest);

		sc.close();
	}

}
