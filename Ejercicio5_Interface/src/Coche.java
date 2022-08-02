public class Coche {
    int id;
    String color;
    String fabricante;
    String modelo;

    Coche(int id, String color, String fabricante, String modelo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
