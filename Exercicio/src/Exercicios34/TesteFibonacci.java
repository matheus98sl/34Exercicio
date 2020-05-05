package Exercicios34;

import java.util.Scanner;

public class TesteFibonacci {
	
	
	static long fibo(int n) {
		if(n<2) {
			return n;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Termo ate a sequencia:");
		int  num = sc.nextInt();
		
		for (int i = 0; i < num ; i++) {
			System.out.println("("+i+"):"+ TesteFibonacci.fibo(i) );
			
		}
		

	}

}
