package Exercicios34;

import java.util.Scanner;

public class DiasQueViveu {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe sua idade:");
	int id = sc.nextInt();
	System.out.println("Quantos meses:");
	int mes =sc.nextInt();
	System.out.println("quantos dias:");
	int dias =sc.nextInt();
	
	
	int tdia = (id*365)+(mes*30);
	int tdia1 = tdia + dias;
	
	System.out.println("Total de dias:"+tdia1);
		

	

	
	}

}
