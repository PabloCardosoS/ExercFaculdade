package sem3ex006;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		System.out.print("Digite o preço do produto: ");
		float preco = scanner.nextFloat();
		if (preco <= 0) {
			System.out.println("Preço Inválido");
		} else if (preco < 100) {
			preco = (float) (preco * 1.1); 
			System.out.println("O novo valor é de R$ " + preco);
		} else if (preco < 300 ) {
			preco = (float) (preco * 1.2);
			System.out.println("O novo valor é de R$ " + preco);
		} else if (preco < 1000) {
			preco = (float) (preco * 1.5);
			System.out.println("O novo valor é de R$ " + preco);
		} else {
			System.out.println("Não existe produtos com esse preço");
		}
		
	}

}
