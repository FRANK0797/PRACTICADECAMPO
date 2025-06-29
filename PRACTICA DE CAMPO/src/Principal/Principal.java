package Principal;

import funcion.Registro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();

        try {
            System.out.println("=== Registro de Cliente ===");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("DNI: ");
            String dni = sc.nextLine();

            if (dni.length() != 8) {
                throw new IllegalArgumentException("El DNI debe tener 8 dígitos.");
            }

            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            System.out.print("Calle: ");
            String calle = sc.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = sc.nextLine();

            registro.registrarCliente(nombre, dni, telefono, calle, ciudad);

            System.out.println("\nClientes registrados:");
            registro.mostrarClientes();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}