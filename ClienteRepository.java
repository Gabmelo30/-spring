

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findPessoasByNomeLikeIngorecase(Spring nome);
}