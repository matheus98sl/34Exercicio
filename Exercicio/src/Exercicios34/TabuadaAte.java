package Exercicios34;

import java.util.Scanner;

public class TabuadaAte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero ;
		System.out.println("Numero:");
		numero = sc.nextInt();
        int tabuada;
        for (int i = 1; i < 14; i++) {
            tabuada = numero *i ;
           System.out.println(+ numero + " * " + i + " = " + tabuada);
		}
	}
}
