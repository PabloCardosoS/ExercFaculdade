//  Descrição: Nesta tarefa, você será responsável por desenvolver um programa em Java para calcular a média das
//  notas de uma turma de alunos, armazenadas em um array
//
//  O programa solicitará ao usuário o número de alunos e, em seguida, pedirá informações sobre cada aluno, como nome,
//  primeira nota e segunda nota.
//
//  Com base nessas informações, o programa calculará a média de cada aluno, a média geral da turma e exibirá
//  os resultados no console.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = scanner.nextInt();

        String[] nomes = new String[numeroAlunos];
        double[] medias = new double[numeroAlunos];

        double somaDasMedias = 0;

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "° aluno: ");
            scanner.nextLine();
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            medias[i] = (nota1 + nota2) / 2;

            somaDasMedias += medias[i];
        }

        System.out.println("\nMédia dos alunos: ");
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println(nomes[i] + ": " + medias[i]);
        }

        double mediaGeral = somaDasMedias / numeroAlunos;
        System.out.println("\nMédia geral da turma: " + mediaGeral);

        scanner.close();
    }
}