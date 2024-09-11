package whilelista15;

public class Ex015 {

	public static void main(String[] args) {
		int i = 2;
		int n = 200;
		int soma = 0;
		
		// loop while irá verificar se "i" é primo chamando o método ehPrimo, se vdd soma, senão i++;
		while (i <= n) {
			if (ehPrimo(i)) {
				soma += i;
			}
			i++;
		}
		System.out.println("A soma dos primos de 0 até " + n + " é: " + soma);
	}
	
	// método para verificar se "i" é primo
	public static boolean ehPrimo(int num) {
		if (num < 2) {
			return false;
		}
		int div = 2;
		while (div <= Math.sqrt(num)) {
			if (num % div == 0) {
				return false;
			}
			div++;
		}
		
		return true;
		
	}
	
	

}
