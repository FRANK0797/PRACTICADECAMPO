package funcion;

import diseño.Cliente;
import diseño.Direccion;
import java.util.ArrayList;

/**
 * Clase Registro que gestiona el almacenamiento y visualización de clientes.
 */
public class Registro {
    private ArrayList<Cliente> clientes;

    public Registro() {
        clientes = new ArrayList<>();
    }

    /**
     * Registra un cliente con datos completos.
     */
    public void registrarCliente(String nombre, String dni, String telefono, String calle, String ciudad) {
        Direccion direccion = new Direccion(calle, ciudad);
        Cliente cliente = new Cliente(nombre, dni, telefono, direccion);
        clientes.add(cliente);
    }

    /**
     * Muestra todos los clientes registrados.
     */
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    /**
     * Método de utilidad para acceder a los clientes desde otra clase.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
