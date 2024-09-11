package sem3ex005;

import java.util.Locale;
import java.util.Scanner;


public class Ex005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		System.out.print("Digite o preço do produto: ");
		float preco = scanner.nextFloat();
		if (preco <= 0) {
			System.out.println("Preço Inválido");
		} else if (preco <= 30) {
			System.out.println("Preço baixo");
		} else if (preco <= 50) {
			System.out.println("Preco médio");
		} else {
			System.out.println("Preço alto");
		}

	}

}
