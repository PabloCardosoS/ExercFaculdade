package listafor06;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ForEx06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> listaNome = new ArrayList<>(20);
		List<String> listaEstadoCivil = new ArrayList<>(20);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + " nome: ");
			String nome = scanner.nextLine();
			listaNome.add(nome);
			System.out.println("====================================================");
			System.out.println("--- Estado atual ---");
			System.out.println("----------------------------------------------------");
			System.out.println(" 1 . Solteiro/a ");
			System.out.println(" 2 . Casado/a ");
			System.out.println(" 3 . Divorciado/a ");
			System.out.println(" 4 . Viúvo/a ");		
			System.out.println("----------------------------------------------------");
			System.out.print("Digite o estado civil do " + nome + ": ");
			int estadoCivil = scanner.nextInt()
					
			switch (estadoCivil) {
				case 1:
					listaEstadoCivil.add("Solteiro/a");
					break;
				case 2:
					listaEstadoCivil.add("Casado/a");
					break;
				case 3:
					listaEstadoCivil.add("Divorciado/a");
					break;
				case 4:
					listaEstadoCivil.add("Viúvo/a");
					break;
				default:
					System.out.println("O número digitado está errado. Tente novamente.");
					continue;
			}
			
			
		}
		System.out.println("Solteiro/a");
		System.out.println("----------");
		System.out.println("");
		scanner.close();
		
		
	}

}
