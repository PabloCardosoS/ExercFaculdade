public class Ex06 {
    public boolean[] ex006(int[] a) {
        if (a == null) {
            return null;
        }
        boolean[] resultado = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                resultado[i] = true;
            } else {
                resultado[i] = false;
            }
        }
        return resultado;
    }
}