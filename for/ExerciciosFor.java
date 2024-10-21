public class ExerciciosFor {

    public void exercicio1(int x) {
        for (int i = 1; i <= x; i++) {
            String nome = Teclado.leString("Digite o nome da " + i + "º pessoa: ");
        }
        System.out.println();
    }

    public void exercicio2(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public void exercicio3(int x) {
        if (x < 0) {
            System.out.println("Erro. Valor negativo.");
        } else {
            for (int i = 0; i <= x; i += 2) {
                    System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public void exercicio4(int x) {
        if (x < 0) {
            System.out.println("Erro. valor negativo.");
        } else {
            for (int i = x; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public void exercicio5(int x) {
        int contadorGremio = 0;
        for (int i = 1; i <= x; i++) {
            String time = Teclado.leString("Qual time o " + i + "º torcedor torce? ");
            if (time.equalsIgnoreCase("Gremio")) {
                contadorGremio++;
            }
        }
        System.out.print("Numero de torcedores do Gremio: " + contadorGremio);
        System.out.println("\n");
    }

    public void exercicio6(int x) {
        double soma = 0;

        for (int i = 1; i <= x; i++) {
            double numero = Teclado.leDouble("Digite o " + i + "º numero: ");
            soma += numero;
        }
        System.out.print("A soma dos numeros digitados e: " + soma);
        System.out.println("\n");
    }

    public void exercicio7() {
        int soma = 0;
        System.out.println("Digite 10 valores inteiros: ");
        for (int i = 0; i < 10; i++) {
            soma += Teclado.leInt("Digite o " + (i + 1) + "º numero inteiro: ");
        }
        System.out.print("A soma dos 10 numeros digitados e " + soma);
        System.out.println("\n");
    }

    public void exercicio8() {
        int quant = Teclado.leInt("Digite quantos numeros ira digitar: ");
        for (int i = 0; i < quant; i++) {
            int numero = Teclado.leInt("Digite o " + (i + 1) + "º numero inteiro: ");
            if (numero < 0) {
                System.out.println("O numero e negativo.\n");
            } else if (numero > 0) {
                System.out.println("O numero e positivo.\n");
            } else {
                System.out.println("O numero e zero.\n");
            }
        }
        System.out.println("\n");
    }

    public void exercicio9(int val1, int val2) {
        if (val1 < 0 || val2 < 0) {
            System.out.println("Erro: valores negativos.");
            return;
        }
        
        int menor = Math.min(val1, val2);
        int maior = Math.max(val1, val2);
        System.out.println("Numeros pares entre " + menor + " e " + maior + ":");
        
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }       

    

    public void exercicio10() {
        int soma = 0;
        for (int i = 0; i <= 198; i++) {
            soma += i;
        }
        System.out.print("A soma dos valores de 0 ate 198 e: " + soma);
        System.out.println("\n");
    }

    public int exercicio11(int val1, int val2) {
        if (val1 < 0 || val2 < 0) {
            System.out.println("Erro: valores negativos.");
            return -1;
        }

        int soma = 0;
        for (int i = val1; i <= val2; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }
    
    public void exercicio12() {
        double soma = 0;
        int quantidade = 0;
        for ( ; ; ) {
            double numero = Teclado.leDouble("Digite um numero positivo: ");
            if (numero < 0) {
                break;
            }
            soma += numero;
            quantidade++;
        }        
        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.print("A media de todos os numero e " + media);  
        } else {
            System.out.println("Nenhum numero positivo foi digitado.");  
        }
        System.out.println("\n");
    }

    public void exercicio13(int n) {
        int fatorial = 1;
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.print("O fatorial de " + n + " e " + fatorial);  
        System.out.println("\n");
    }

    public boolean exercicio14(int x) {
        if (x <= 1) {
            return false;
        }      
        for (int i = 2; (i * i) < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void exercicio15(int x) {
        System.out.println("\n");
        int somaPrimos = 0;
        System.out.println("Os numero primos entre 0 e " + x + ":");
        for (int i = 2; i <= x; i++) {
            if (i <= 1) {
                continue;
            }
            boolean primo = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i + " ");
                somaPrimos =+ i;
            }          
        }
        System.out.print("\nA soma dos numeros primos e " + somaPrimos);
        System.out.println("\n");
    }     
    
}
