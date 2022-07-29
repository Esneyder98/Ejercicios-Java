public class FuncionIva {
    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
        double v = precioIvaIncluido(10000);
        System.out.println(v);
    }
    public  static double precioIvaIncluido(double precio){
        double iva =0.19; //iva 19%
        return precio+(precio*iva);
    }
}
