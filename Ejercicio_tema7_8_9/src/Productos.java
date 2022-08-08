import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Productos {
    int id;
    String descripcion;
    int Precio;
    int CantidadDisponible;

    ArrayList <Map> ProductosComprados = new ArrayList<>();
    private boolean cantidadDisponible;

    public Productos(int id, String descripcion, int precio, int cantidadDisponible) {
        this.id = id;
        this.descripcion = descripcion;
        this.Precio = precio;
        this.CantidadDisponible = cantidadDisponible;
    }

    public boolean ComprarProducto(int id, int cantidadRequerida){
        int disp = getCantidadDisponible();
        int valor=0;
        ArrayList<Integer>dateBuy = new ArrayList<>();
        if(disp >= cantidadRequerida){
            Map<Integer, ArrayList<Integer>> producto = new HashMap<>();
            valor = this.Precio * cantidadRequerida;
            dateBuy.add(cantidadRequerida);
            dateBuy.add(valor);
            setCantidadDisponible(disp-cantidadRequerida);

            producto.put(id,dateBuy);
            ProductosComprados.add(producto);
            return true;
        }else{

            return false;
        }
    }

    public ArrayList<Map> getProductosComprados() {
        return ProductosComprados;
    }

    public void setProductosComprados(ArrayList<Map> productosComprados) {
        ProductosComprados = productosComprados;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        CantidadDisponible = cantidadDisponible;
    }

    public int getCantidadDisponible() {
        return CantidadDisponible;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", Precio=" + Precio +
                ", CantidadDisponible=" + CantidadDisponible +
                '}';
    }
}
