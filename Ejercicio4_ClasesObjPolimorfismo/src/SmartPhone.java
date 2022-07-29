public class SmartPhone extends SmartDevice {
    boolean reproductorMusica = true;
    boolean linterna = true;
    String camara;

    public SmartPhone(String nombre, String marca, String color, String tamaño, boolean reproductorMusica, boolean linterna, String camara) {
        super(nombre, marca, color, tamaño);
        this.reproductorMusica = reproductorMusica;
        this.linterna = linterna;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "\nreproductorMusica=" + reproductorMusica +
                ",\n linterna=" + linterna +
                ",\n camara='" + camara + '\'' +
                ",\n nombre='" + nombre + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n color='" + color + '\'' +
                ",\n tamaño=" + tamaño +"\n"+
                '}';
    }
}
