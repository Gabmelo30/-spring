public class IService<E,N> {

    public E create(E entity);

    public E readById(N id) throws Exception;

    public E read(E entity) throws Exception;

    public E updatePatch(E entity, N id) throws Exception;

    public E updatePut(E entity, N Id);

    public E deleteById(N id);

    public E delete(E entity);
    
}
