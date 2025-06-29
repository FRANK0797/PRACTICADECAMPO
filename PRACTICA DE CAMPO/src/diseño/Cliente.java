package diseño;

/**
 * Clase Cliente que representa un cliente con contacto y dirección.
 */
public class Cliente extends Persona {
    private String telefono;
    private Direccion direccion;

    public Cliente(String nombre, String dni, String telefono, Direccion direccion) {
        super(nombre, dni);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNombre() + " | DNI: " + getDni() +
               " | Teléfono: " + telefono +
               " | Dirección: " + direccion;
    }
}
