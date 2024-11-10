public class Ex05 {
    public int ex005(int[] a, int x) {
        if (a == null) {
            return -1;
        }
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                contador++;
            }
        }
        return contador;
    }
}