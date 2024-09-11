package listafor04;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = scanner.nextLine();
		
		int qtdVogais = 0;
		String vogais = "aeéiouAEÉIOU"; // 
		
		// o For irá percorrer letra por letra do meu texto e verificar se alguma é igual ao que tem na String vogais.
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (vogais.indexOf(letra) != -1) {
			qtdVogais++;
			}
		}
		scanner.close();
		System.out.println("A quantidade de vogais no texto é " + qtdVogais);
	}

}
