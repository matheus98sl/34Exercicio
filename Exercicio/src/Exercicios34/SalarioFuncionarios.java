package Exercicios34;

import java.util.Scanner;

public class SalarioFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
		System.out.println("1 - Categoria A = C = F = H");
		System.out.println("2 - Categoria B = D = E = I = J = T ");
		System.out.println("3 - Categoria K = R");
		System.out.println("4 - Categoria L = M = N = O = P = Q = S ");
		System.out.println("5 - Categoria U = V = X = Y = W = Z");
		System.out.println("9 - Sair");
		System.out.println("Informe a sua opcao");
		op = sc.nextInt();
		switch (op) {

		case 1:
			System.out.println("Informe o salario:");
			int sal =sc.nextInt();
			int salreajuste = (sal*10)/100;
			
			System.out.println("Novo Salario Com aumento de 10%:"+(salreajuste+sal));

			break;
		case 2:
			System.out.println("Informe o salario:");
			int sal1 =sc.nextInt();
			int salreajuste1 = (sal1*15)/100;
			
			System.out.println("\nNovo Salario Com aumento de 15%:"+(salreajuste1+sal1));

			break;
		case 3:
			System.out.println("Informe o salario:");
			int sal3 =sc.nextInt();
			int salreajuste3 = (sal3*25)/100;
			
			System.out.println("Novo Salario Com aumento de 25%:"+(salreajuste3+sal3));

			break;
		case 4:
			System.out.println("Informe o salario:");
			int sal4 =sc.nextInt();
			int salreajuste4 = (sal4*35)/100;
			
			System.out.println("Novo Salario Com aumento de 10%:"+(salreajuste4+sal4));
			break;
		case 5:
			System.out.println("Informe o salario:");
			int sal5 =sc.nextInt();
			int salreajuste5 = (sal5*50)/100;
			
			System.out.println("Novo Salario Com aumento de 10%:"+(salreajuste5+sal5));
			
			break;
		case 9:

			break;
		default:
			break;
		}
		}while(op != 9);

	}
		
}

