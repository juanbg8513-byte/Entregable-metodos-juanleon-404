public class ejercicio7 {

    public static void main(String[] args) {

        double[] calificaciones = {4.4, 3.2, 5.0, 2.9};

        double promedio = calcularPromedioClase(calificaciones);

        System.out.println("El promedio de la clase es: " + promedio);
    }

    public static double calcularPromedioClase(double[] calificaciones) {

        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }

        return suma / calificaciones.length;
    }




}
