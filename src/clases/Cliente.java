package clases;

public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    
    //constructor

    public Cliente(String id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    //metodos get
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    
    
    
}
