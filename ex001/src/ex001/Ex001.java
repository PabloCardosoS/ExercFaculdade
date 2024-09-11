package ex001;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu cep: ");
		String cep = scanner.nextLine();
		
		System.out.print("Digite seu bairro: ");
		String bairro = scanner.nextLine();
		
		System.out.print("Digite sua cidade: ");
		String cidade = scanner.nextLine();
		
		System.out.print("Digite seu Estado: ");
		String estado = scanner.nextLine();
		
		System.out.println("--------------------------------------");
		System.out.println("------Pessoa abaixo cadastrada--------");
		System.out.println("NOME: " + nome + "\nCEP: " + cep + "\nBairro: " + bairro + "\nCidade/UF: " + cidade + "-" + estado);								
		System.out.println("--------------------------------------");
		
	}

}
