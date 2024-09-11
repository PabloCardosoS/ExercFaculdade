package listafor03;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		
		System.out.println("-------TABUADA--------");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n1 + " x " + i + " = " + n1*i);
		
		}
		System.out.println("----------------------");
	}

}
