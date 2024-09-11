package lista2while08;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuario = "USER10";
		String senha = "PASSWORD1234";
		
		while (true) {
			System.out.print("Digite seu usuário: ");
			String tentativaUser = scanner.nextLine();
			System.out.print("Digite sua senha: ");
			String tentativaPass = scanner.nextLine();
						
			if ((tentativaUser.equals(usuario)) && (tentativaPass.equals(senha))) {
				System.out.println("LOGIN EFETUADO COM SUCESSO.");
				break;
			} else {
				int i = 2;
				while (i <= 3) {
					System.out.println("\nUsuário e/ou senha incorreto.\nTente novamente.\n");
					System.out.println("TENTATIVA " + i);
					System.out.print("Digite seu usuário: ");
					String tentativaUser2e3 = scanner.nextLine();
					System.out.print("Digite sua senha: ");
					String tentativaPass2e3 = scanner.nextLine();
					
					if ((tentativaUser2e3.equals(usuario)) && (tentativaPass2e3.equals(senha))) {
						System.out.println("LOGIN EFETUADO COM SUCESSO.");
						break;
					} else {
						System.out.println("Tentativa " + i + " errada.\n");
					}
					i++;
				}
				
			}
			System.out.println("NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO.");
			break;
		}
		scanner.close();
	}

}
