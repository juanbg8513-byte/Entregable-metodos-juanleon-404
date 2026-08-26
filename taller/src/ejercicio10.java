

    import java.util.ArrayList;

    public class ejercicio10 {

        public static void main(String[] args) {

            ArrayList<Producto> productos = new ArrayList<>();

            productos.add(new Producto("Aceite", 3000, 10));
            productos.add(new Producto("Leche", 4000, 5));
            productos.add(new Producto("Pan", 3000, 8));

            mInventario(productos);

            double total = cValorTotalInventario(productos);

            System.out.println("Valor total del inventario: $" + total);
        }

        public static void aProducto(ArrayList<Producto> productos, Producto producto) {
            productos.add(producto);
        }

        public static double cValorTotalInventario(ArrayList<Producto> productos) {

            double total = 0;

            for (int i = 0; i < productos.size(); i++) {
                total = total + (productos.get(i).precio * productos.get(i).cantidad);
            }

            return total;
        }

        public static void mInventario(ArrayList<Producto> productos) {

            for (int i = 0; i < productos.size(); i++) {

                Producto producto = productos.get(i);

                System.out.println("Producto: " + producto.nombre);
                System.out.println("Precio: $" + producto.precio);
                System.out.println("Cantidad: " + producto.cantidad);
                System.out.println("----------------------");
            }
        }
    }

    class Producto {

        String nombre;
        double precio;
        int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
    }


