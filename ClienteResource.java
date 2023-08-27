


@RestController
@RequesMapping(path = "/Cliente")
public class ClienteResource implements
  GeneircOperationsResource<Cliente, Integer> 

    @Autowired
    private ClienteService ClienteService;

    private static final Logger LOGGER =
               LOGGER.getLogger(ClienteResource.class,getName());


               @param entity
               @return

               @Override
               @ApiOperation(consumes = {MediaType.APPLICATION_JSON_VALUE,
                "application/xml;charset=UFT-8"},
                produce = {MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE})
                @ApiOperation(value="${resource.cliente-post}",
                nota="Criar dados de cliente.")
                @ApiResponses(value={
                    @ApiResponses(code = 200, massage = "Requisição feita com sucesso.", response = Cliente.class),
                    @ApiResponses(code = 201, massage = "Registro criado com sucesso." response = Cliente.class),
                    @ApiResponses(code = 204, massage = "O servidor processou a soclicitação com sucesso e não está retornando nehum conteúdo."),
                    @ApiResponses(code = 301, massage = "Redirecionamento permanente.", response = cliente.class),
                    @ApiResponses(code = 401, massage = "Não autorizado.", resource = cliente.class),
                    @ApiResponses(code = 404, massage = "Registro não encontrado.", response = cliente.class),
                    @ApiResponses(code = 500, massage = "Erro na reqisão, verifique configurações do servidor.", response = cliente.class)
                })
                public Cliente post(@RequestBody @Validated Cliente entity) {
                    LOGGER.log(Level.info, "clienteResource.post inicado {} ", entity);

                    Cliente clientePersitida = "ClenteResource.post concluído {} ", clientePersitida);
                    return clientePersitida;
                }
                @Override
                @GetMapping(produce ={MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE})
                public List<Cliente> get() {

                    LOGGER.log(Level.info, "Exemplo do GET:");
                    return null;
                }
                @Override
                @PutMapping(value = "/{id}"),
                consumes = {MediaType.APPLICATION_JSON_VALUE}
                public void put(@RequestBody @Validated Cliente entity,
                @pathVariable("id") Integer id) {
                    LOGGER.log(level.INFO,
                    String.format("Exemplo do PUT: %s | %d , entity, id"));

                    this.ClienteService.updatePut(entity, id);
                }

                @Override
                @PatchMapping(value = "/{id}"),
                consumes = {MediaType.APPLICATION_JSON_VALUE}
                public void patch(@RequestBody @Validated Cliente entity,
                @PathVariable("id") Integer id) throws Exception {
                    LOGGER.log(level.INFO,
                    String.format("Exemplo do PATCH: %s | %d , entity, id "));

                    this.ClienteService.updatePatch(entity, id);
                
                }
                @Override
                consumes = {MediaType.APPLICATION_JSON_VALUE,
                public void delete(@RequestBody @Validated Cliente entity) {
                    LOGGER.log(level.INFO,
                    String.format("Exemplo do DELETE: %s", entity));
                }
                @Override
                @DeleteMapping(value="/{id}")
                 public void deleteById(@PathVariable("id") Integer id) {
                    LOGGER.log(level.INFO,
                    String.format("Exemplo do DELETE: %d", id));
                 }
  }