public class BubbleSort {
    private int[] numeros = new int[10];

    public BubbleSort() {
        int i = 0, n = 0;

        number();
        for(i = 0; i < (numeros.length - 1); i++) {
            if(numeros[i] < numeros[i+1]) {
                n = numeros[i+1];
                numeros[i+1] = numeros[i];
                numeros[i] = n;
            }
        }
        for(i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void number() {
        int i = 0;

        for(i = 0; i < numeros.length; i++) {
            numeros[i] = 9-i;
        }
    }
}
