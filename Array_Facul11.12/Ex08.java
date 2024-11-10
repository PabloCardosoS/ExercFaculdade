public class Ex08 {
    public double[] ex008() {
        double[] array = new double[Teclado.leInt("Digite a quant de elementos do array: ")];
        for (int i = 0; i < array.length; i++) {
            array[i] = Teclado.leDouble("Digite o valor da posicao " + i + " do array: ");
        }
        return array;
    }
}