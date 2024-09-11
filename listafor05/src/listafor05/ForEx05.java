package listafor05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEx05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> listaProdutos = new ArrayList<>();
	
		System.out.print("Quantos produtos listar: ");
		int qtd = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite o nome do produto " + (i + 1) + ": ");
			String prod = scanner.nextLine();
			listaProdutos.add(prod);
		}
		System.out.println("\n_____Lista de Produtos_____");
		for (int i = 0; i < listaProdutos.size(); i++) {
			System.out.println("Produto " + (i + 1) + ": " + listaProdutos.get(i));
		}
		scanner.close();
	}

}
