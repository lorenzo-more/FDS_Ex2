import java.util.*;

public class FactoryCollections{

    private static FactoryCollections instance = null;

    private FactoryCollections(){}

    public static FactoryCollections getInstance(){
        if (instance == null)
            instance = new FactoryCollections();
        return instance;
    }

    public <T> Collection<T> criaCollection(int tamanho, boolean podeRepetir, boolean ordenado){
        if (podeRepetir)
            return new LinkedList<T>();
        if (ordenado)
            return new TreeSet<T>();
        if (tamanho > 0)
            return new ArrayList<T>(tamanho);
        return new HashSet<T>();
    }
}
