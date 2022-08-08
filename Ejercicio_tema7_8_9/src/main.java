import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        //1.
        System.out.println(reverse.StringReverse("Hola Mundo"));
        //2.
        String[] cuidades = new String[]{"Bogota", "Medellin", "Cali", "Bucaramanga"};
        for (String cuidad : cuidades) {
            System.out.println(cuidad);
        }
        //3

        Vector<String> names = new Vector<>();
        names.add("Camila");
        names.add("Jose");
        names.add("Pepito");
        names.add("Gonzalo");
        names.add("Emilia");
        names.remove(1);
        names.remove(2);
        System.out.println("nombres: " + names);
        System.out.println("------------------");
        ///// 4
        // para el manejo de una gran candidad de datos se debe configurar el aumento de su capasidad de la manera mas acomodada
        // a la realidad posible ya que la creacion de mayoy capasidad para agregar mas datos genera un consumo importante de memoria

        //// 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> paises = new ArrayList<>();
        paises.add("Colombia");
        paises.add("Chile");
        paises.add("Australia");
        paises.add("Spain");
        LinkedList<String> paisess = new LinkedList<>(paises);
        for (String pais : paisess) {
            System.out.println(pais);
        }

        /// 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) % 2) == 0) {
                numbers.remove(i);
            } else {
                continue;
            }
        }
        System.out.println("------------------");
        System.out.println(numbers);


        // 7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".
        try {
            DividePorCero(3, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro
        // "fileIn" al fichero dado en "fileOut".
        try {
            InputStream in = new FileInputStream("C:\\Users\\Usuario\\Documents\\JAVA\\Ejercicios\\Ejercicio_tema7_8_9\\Ejemplo.txt");
            PrintStream out = new PrintStream("C:\\Users\\Usuario\\Documents\\JAVA\\Ejercicios\\Ejercicio_tema7_8_9\\copia.txt");
            TransferirArchivo(in, out);
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }

        //9.Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
        // un HashMap y un ArrayList, LinkedList o array.
        Productos Arroz = new Productos(1,"Arroz Diana de 500gr",2500,25);
        Productos Aceite = new Productos(2,"Aceite Oleocali de 500ml",6000,25);
        Arroz.ComprarProducto(1,3);
        System.out.println(Arroz);
        System.out.println("Productos comprados:"+Arroz.ProductosComprados);

    }


    public static double DividePorCero(int a, int b) throws ArithmeticException {
        double result = 0;
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Error Esto no puede hacerse");
        } else {
            result = a / b;
        }
        return result;
    }

    public static PrintStream TransferirArchivo(InputStream a, PrintStream b) {
        try {
            // se lee lo que contiene el archivo a y se guarda en un array de bytes
            byte[] datos = a.readAllBytes();
            a.close();
            /* / se escribe en el archivo a todo lo que contiene el archivo b */
            b.write(datos);
            b.close();
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());

        }
        return b;

    }
}