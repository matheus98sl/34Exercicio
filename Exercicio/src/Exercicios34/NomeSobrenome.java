package Exercicios34;

import java.util.Scanner;

public class NomeSobrenome {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new NomeSobrenome().processar();
	}

	private void processar() {

		System.out.println("Nome:");
		String nome = sc.next();
		System.out.println("Sobre nome:");
		String sobre = sc.next();
		System.out.printf("\nNome completo: %s %s",nome,sobre);

		this.sc.close();
	}
}
