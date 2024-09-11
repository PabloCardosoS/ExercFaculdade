package ex.avancado001;

import java.util.Scanner;
import java.util.Locale;

public class ExAvancado01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

		System.out.print("Digite um número real: ");
		double A = scanner.nextDouble();
		System.out.print("Digite um número inteiro: ");
		double B = scanner.nextDouble();
		
		double X1 = A * B;
		double X2 = A / B;
		double X = A + B;
		double Y = A - B;
		double Xt = Math.pow(A, B);
		
		System.out.println("A multiplicado por B é: " + X1);
		System.out.println("A divido por B é: " + X2);
		System.out.println("A mais B é: " + X);
		System.out.println("A menos B é: " + Y);
		System.out.println("A elevado a B é: " + Xt);
	}

}
