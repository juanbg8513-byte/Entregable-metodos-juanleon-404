public class ejercicio9 {

    public static void main(String[] args) {

        String resultado = cNota(4.7);

        System.out.println(resultado);
    }

    public static String cNota(double nota) {

        if (nota < 3.0) {
            return "reprobado";

        } else if (nota < 4.5) {

            return "aprobado";

        } else {
            return "excelente";
        }
    }




}
