public class ejercicio4 {

    public static void main(String[] args) {

        boolean resultado = esPar(10);

        System.out.println(resultado);

    }

    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
