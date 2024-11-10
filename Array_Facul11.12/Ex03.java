public class Ex03 {
    public void ex003() {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Teclado.leDouble("Digite um numero double: ");
        }
    }
}