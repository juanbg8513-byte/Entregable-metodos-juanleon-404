public class ejercicio5 {

    public static void main(String[] args) {

        double promedio1 = calcularPromedio(4.0, 3.5);

        double[] notas = {4.0, 3.8, 5.0, 2.4};
        double promedio2 = calcularPromedio(notas);

        System.out.println("Promedio de 2 notas: " + promedio1);
        System.out.println("Promedio del arreglo: " + promedio2);
    }

    public static double calcularPromedio(double nota1, double nota2) {

        return (nota1 + nota2) / 2;
    }

    public static double calcularPromedio(double[] notas) {

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        return suma / notas.length;
    }



}
