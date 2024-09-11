package lista2while07;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user = "USER10";
		String password = "PASSWORD1234";

		while (true) {
			System.out.print("Digite seu usuário: ");
			String tentativaUser = scanner.nextLine();
			System.out.print("Digite sua senha: ");
			String tentativaSenha = scanner.nextLine();
			
			if ((tentativaUser.equals(user)) && (tentativaSenha.equals(password))) {
				System.out.println("\nLOGIN EFETUADO COM SUCESSO.\n\n");
				break;
			} else {
				System.out.println("\nSeu usuário e/ou senha está incorreto. Favor, tente novamente.\n\n");	
			}
				
		}

	}

}
