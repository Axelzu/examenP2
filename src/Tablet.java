//el contructior inicializa el nombre, marca y precio
//implemeta metodos para obtener el nombre, precio, marca y se impriman
public class Tablet implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    public Tablet(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
// usos de metodos get
    public String getModelo() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
// se imprimen los detalles del producto
    public void imprimeDetallesProducto() {
        System.out.println("Tablet: " + nombre + ", Marca: " + marca + ", Precio: $" + precio);
    }
}