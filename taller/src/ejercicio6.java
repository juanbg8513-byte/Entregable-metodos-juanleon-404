public class ejercicio6 {


    double nota;

    // Este es el metodo instancia
    public void mBoletin() {

        if (this.nota >= 3.0) {
            System.out.println("El estudiante aprobo con: " + this.nota);
        } else {
            System.out.println("El estudiante perdio con: " + this.nota);
        }
    }

    // Este es el metodo static
    public static double comNotas(double n1, double n2) {

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }


}
