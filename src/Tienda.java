import java.util.ArrayList;
import java.util.List;
// el constructor inicializa la lista de productos.
//se implementan tambien  los metodos definidos en ITienda para agregar productos, obtener el promedio de los precios,
//obtener el produtos  mas costoso y buscar el producto por nombre.
public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    public double obtenerPromedioPrecioProductos() {
        double sumaPrecios = 0;
        for (IProducto producto : productos) {
            sumaPrecios += producto.getPrecio();
        }
        return sumaPrecios / productos.size();
    }

    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) {
            return null;
        }
        IProducto masCostoso = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            if (productos.get(i).getPrecio() > masCostoso.getPrecio()) {
                masCostoso = productos.get(i);
            }
        }
        return masCostoso;
    }

    public Boolean buscarProductoPorNombre(String nombre) {
        for (IProducto producto : productos) {
            if (producto.getModelo().toLowerCase().contains(nombre.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
