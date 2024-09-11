package whilelista1;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome de 13 pessoas");
		System.out.println("===========================");
		int contador = 1;
		while (contador < 14) {
			System.out.print("Digite o nome da pessoa " + contador + ": ");
			String nome = scanner.nextLine();
			contador++;
		}	

	}

}
