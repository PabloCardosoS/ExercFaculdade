public class Ex01 {
    public void exercicio1() {
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------\n");
    }
    
    public void exercicio2() {
        int[] array = new int[11];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------\n");
    }
    
    public void exercicio3() {
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            if (i < 5) {
                array[i] = i + 1;
            } else {
                array[i] = 10 * (i - 4);
            }
        }
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------\n");
    }
    
    public void exercicio4() {
        int[] array = new int[10];
        int soma = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = soma;
            soma += (2 * i + 1);
        }
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------\n");
    }
    
}
