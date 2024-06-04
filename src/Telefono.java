
//el constructor inicializa los campos de nombre, marca, precio.
//y se implmentan metodos para obtener modelo,marca,precio y luego se impriman
public class Telefono implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    public Telefono(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
//usos de get
    public String getModelo() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
//se imprimen los detalles del producto
    public void imprimeDetallesProducto() {
        System.out.println("Teléfono: " + nombre + ", Marca: " + marca + ", Precio: $" + precio);
    }
}