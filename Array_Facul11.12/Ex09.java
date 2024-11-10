public class Ex09 {
    public void ex009(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] % 2 == 0 ? 1 : -1;
            }
        }
    }
}