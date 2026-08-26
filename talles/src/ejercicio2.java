import javax.swing.*;

public class ejercicio2 {

    public static void main(String[] args) {

        saludarEstudiante("Juan", 18);

    }

    public static void saludarEstudiante(String nombre, int edad) {

        JOptionPane.showMessageDialog(null,
                "Hola " + nombre + ", tienes " + edad + " años.");

    }



}
