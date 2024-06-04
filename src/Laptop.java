// clase que se muestra en el main.
//el constructor inicializa todos los campos
//se implementa los metodos para poder obtener el modelo, marca, precio y garantia y este a su vez imprimira los detalles del producto
public class Laptop implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int garantia;

    public Laptop(String nombre, String marca, double precio, int garantia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.garantia = garantia;
    }
// usos de metodos de get
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
        System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Precio: $" + precio + ", Garantía: " + garantia + " años");
    }
}