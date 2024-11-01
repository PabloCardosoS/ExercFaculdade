import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Criaçao do Circulo 1:
        double xCirculo1 = random.nextDouble() * 10;
        double yCirculo1 = random.nextDouble() * 10;
        double raio1 = random.nextDouble() * 5;
        Circulo circulo1 = new Circulo(xCirculo1, yCirculo1, raio1);
        System.out.println("Circulo 1: " + circulo1.toString() + 
            ", Area: " + circulo1.calculaArea());
        
        // Criacao do Retangulo 1:
        double xRetangulo1 = random.nextDouble() * 10;
        double yRetangulo1 = random.nextDouble() * 10;
        double base1 = random.nextDouble() * 8;
        double altura1 = random.nextDouble() * 5;
        Retangulo retangulo1 = new Retangulo(xRetangulo1, yRetangulo1, base1, altura1);
        System.out.println("Retangulo 1: " + retangulo1.toString() +
            ", Area: " + retangulo1.calculaArea());
            
        // Criacao do Circulo 2:
        double raio2 = random.nextDouble() * 5;
        Circulo circulo2 = new Circulo(raio2);
        System.out.println("Circulo 2: " + circulo2.toString() +
            ", Area: " + circulo2.calculaArea());
            
        // Criacao do Retangulo 2:
        double base2 = random.nextDouble() * 12;
        double altura2 = random.nextDouble() * 7;
        Retangulo retangulo2 = new Retangulo(base2, altura2);
        System.out.println("Retangulo 2: " + retangulo2.toString() +
            ", Area: " + retangulo2.calculaArea());
 
    }
}