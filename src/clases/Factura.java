package clases;
import java.util.Date;
        
public final class Factura {
    //atributos
    private String id;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Producto  productos[];

    //constructor
    public Factura(String id, String fecha, Cliente cliente, Producto[] productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        calcularTotal(productos);
        mostrarFactura();
    }
    //metodos get y set
    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //logica del negocio
    //calcular total de la factura
    public void calcularTotal(Producto [] productos){
        double totalFactura =0 ;
        for (Producto producto : productos) {
            totalFactura = totalFactura + (producto.getCantidad() * producto.getPrecio());
        }
        setTotal(totalFactura);
    }
    //imprimir porpantalla los datos de la factura
    public void mostrarFactura(){
        //se imprime los datos de factura y cliente
        System.out.println("id Factura: " + getId() +
                           "\nFecha: " + getFecha() +
                           "\n---------------------------------------" +
                           "\nNombre y Apellido: " + cliente.getNombre() + " " +cliente.getApellido() +
                           "\nCelular: " + cliente.getTelefono()+
                           "\n---------------------------------------");
        //se imprime los datos de cada producto perteneciente al array de productos 
        for (Producto producto : productos) {
            System.out.println("\nID Producto: " + producto.getId()+
                               "\nNombre Producto: " + producto.getNombre() +
                               "\nPrecio: " +producto.getPrecio() +
                               "\nCantidad: " + producto.getCantidad());
        }
        //con triple comillas damos formato al texto
        System.out.println("""
                           
                           -------------------------------------------
                           Total: """ + getTotal());
    }
    
    
}
