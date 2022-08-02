import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    List<Coche> carros = new ArrayList<>();
    @Override
    public Coche save(Coche coche) {
        carros.add(coche);
        int newCar = carros.size()-1;
        return carros.get(newCar);
    }

    @Override
    public List<Coche> findAll() {
        return carros;
    }

    @Override
    public boolean delete(int id) {
        for (Coche carro: carros) {
            {
                if(carro.id ==id){
                    int val=carro.id;
                    carros.remove(carro);
                    return true;
                }
            }
        }
        return false;
    }
}
