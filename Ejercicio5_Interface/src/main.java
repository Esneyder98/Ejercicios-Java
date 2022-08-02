import java.util.List;

public class main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(1,"negro","Suzuki","2023");
        CocheCRUD cocheimp = new CocheCRUDImpl();

        Coche coche2 = new Coche(2,"rojo","BMW","2022");
        cocheimp.save(coche2);

        System.out.println("save: "+cocheimp.save(coche1));
        //agregando coches a una lista
        List<Coche> coche = cocheimp.findAll();
        System.out.println("findAll: "+coche);
        System.out.println("Delete: "+ cocheimp.delete(1));
        System.out.println("findAll: "+coche);

    }
}
