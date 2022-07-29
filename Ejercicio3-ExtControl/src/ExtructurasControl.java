public class ExtructurasControl {
    public static void main(String[] args) {
        String[] nombres = {"Manuela","Patricia","Carlos"};
        System.out.println(concatenar(nombres));

    }
    static String concatenar(String[] textos){
        String contatenar ="";
        for (String nombre:textos) {
            contatenar+=nombre;
        }
        return contatenar;
    }
}
