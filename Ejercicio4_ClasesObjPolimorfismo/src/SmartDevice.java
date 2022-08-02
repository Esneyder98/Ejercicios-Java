public abstract class SmartDevice {
    String nombre ="";
    String marca = "";
    String color = "";
    String tamaño;
    public SmartDevice() {
    }

    public SmartDevice(String nombre, String marca, String color, String tamaño) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
    }
}
