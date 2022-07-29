public class SmartWath extends SmartDevice{
    boolean Podometro = true;
    boolean monitorizadorSueño = true;
    boolean monitorizadorEmnarazo= true;


    public SmartWath(String nombre, String marca, String color, String tamaño, boolean podometro, boolean monitorizadorSueño, boolean monitorizadorEmnarazo) {
        super(nombre, marca, color, tamaño);
        Podometro = podometro;
        this.monitorizadorSueño = monitorizadorSueño;
        this.monitorizadorEmnarazo = monitorizadorEmnarazo;
    }

    @Override
    public String toString() {
        return "SmartWath{" +
                "\n Podometro=" + Podometro +
                ",\n monitorizadorSueño=" + monitorizadorSueño +
                ",\n monitorizadorEmnarazo=" + monitorizadorEmnarazo +
                ",\n nombre='" + nombre + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n color='" + color + '\'' +
                ",\n tamaño=" + tamaño +"\n"+
                '}';
    }
}
