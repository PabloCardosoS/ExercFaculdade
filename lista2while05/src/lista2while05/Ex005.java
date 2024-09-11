package lista2while05;

public class Ex005 {

	public static void main(String[] args) {
		int min = 1;
		int max = 1000;
		int soma = 0;
		int c = min;
		while (c <= max) {
			soma += c;
			c++;
		}
		System.out.println("A soma dos números de " + min + " até " + max + " é de: " + soma);
	}

}
