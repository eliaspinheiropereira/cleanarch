package projeto.academico.sobre.clean.architecture.dataprovider.repository.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clientes")
public class ClienteEntity {

    private String id;
    private String nome;
    private String cpf;
    private Boolean isValidCpf;
    private EnderecoEntity endereco;
}
