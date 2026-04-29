package projeto.academico.sobre.clean.architecture.entrypoint.controller.dto;

import projeto.academico.sobre.clean.architecture.core.domain.Endereco;

public record BuscarClientePorIdDTO(
    String id,
    String nome,
    String cpf,
    Boolean isValidCpf,
    EnderecoDTO endereco
) {
}
