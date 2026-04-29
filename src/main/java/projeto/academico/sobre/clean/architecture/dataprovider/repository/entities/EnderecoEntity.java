package projeto.academico.sobre.clean.architecture.dataprovider.repository.entities;

import lombok.Data;

@Data
public class EnderecoEntity {

    private String id;
    private String rua;
    private String cidade;
    private String estado;
}
