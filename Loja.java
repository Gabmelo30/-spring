public class Loja extends BaseModel {

    @column(length = 60, nullable = false)
    private Spring nome;
    @column(length = 60, nullable = false)
    private Spring enderco;
    @OneToMany(cascade = cascadeType.ALL, orphanRemoval = true)
    private List<Cliente> Cliente;
    
}
