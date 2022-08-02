import java.util.List;

public interface CocheCRUD {

    public Coche save(Coche coche);

    public List<Coche> findAll();

    public boolean delete(int id);
}
