public class Ex07 {
    public int ex007(double[] array) {
        if (array == null) {
            return -1;
        }
        int posicaoMaiorValor = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[posicaoMaiorValor]) {
                posicaoMaiorValor = i;
            }
        }
        return posicaoMaiorValor;
    }
}