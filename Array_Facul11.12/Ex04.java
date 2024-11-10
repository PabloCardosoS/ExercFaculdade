public class Ex04 {
    public static int ex004(int[] a) {
        if (a == null) {
            return -1;
        }
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                contador++;
            }
        }
        return contador;
    }
}