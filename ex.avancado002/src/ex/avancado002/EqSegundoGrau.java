package ex.avancado002;

import java.util.Scanner;

import java.lang.Math;	

public class EqSegundoGrau {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o A da equação: ");
		int a = scanner.nextInt();
		System.out.print("Digite o B da equação: ");
		int b = scanner.nextInt();
		System.out.print("Digite o C da equação: ");
		int c = scanner.nextInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1, x2;
		
		System.out.println("-----------------------------------------");
		
		if (delta <= 0) {
			System.out.println("Não existem raízes reais.");
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("x1 e x2 são iguais, e eles são: " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raízes são:\nx1 = " + x1 + "\nx2 = " + x2);
		}
		System.out.println("-----------------------------------------");
			
	}

}
