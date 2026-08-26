public class ejercicio8 {

    public static void main(String[] args) {

        int[] tabla = gTablaMultiplicar(5);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }

    public static int[] gTablaMultiplicar(int numero) {

        int[] resultados = new int[10];

        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = numero * (i + 1);
        }

        return resultados;
    }

}
