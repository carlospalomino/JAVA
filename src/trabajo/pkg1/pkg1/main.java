package trabajo.pkg1.pkg1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            
            inventario.agregarRopa(new Ropa("Camisa", "M", 10, 20.0));
            inventario.agregarRopa(new Ropa("Pantalón", "L", 5, 35.5));
            inventario.agregarRopa(new Ropa("Zapato", "42", 8, 50.0));
            
            do {
                System.out.println("------MENU------");
                System.out.println("1. Mostrar inventario");
                System.out.println("2. Vender ropa");
                System.out.println("3. Reporte de ganancias");
                System.out.println("4. Salir del sistema");
                System.out.println("------------------");
                System.out.print("Ingrese la opción: ");
                
                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    sc.next();
                }
                
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1 -> inventario.mostrarInventario();
                    case 2 -> {
                        sc.nextLine();
                        System.out.print("Ingrese el tipo exacto de ropa que desea comprar: ");
                        String tipoRopa = sc.nextLine();
                        System.out.print("Ingrese la talla de la ropa: ");
                        String tallaRopa = sc.nextLine();
                        System.out.print("Ingrese la cantidad que desea comprar: ");
                        
                        while (!sc.hasNextInt()) {
                            System.out.println("Por favor, ingrese un número válido para la cantidad.");
                            sc.next();
                        }
                        
                        int cantidadCompra = sc.nextInt();
                        inventario.venderRopa(tipoRopa, tallaRopa, cantidadCompra);
                    }
                    case 3 -> {
                        double ganancias = inventario.getGanancias();
                        System.out.println("Ganancias obtenidas hasta el momento: " + ganancias);
                    }
                    case 4 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida, intente nuevamente.");
                }
                System.out.println();
            } while (opcion != 4);
        }
    }
}
