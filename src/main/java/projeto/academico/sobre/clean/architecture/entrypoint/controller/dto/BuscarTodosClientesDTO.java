package projeto.academico.sobre.clean.architecture.entrypoint.controller.dto;

public record BuscarTodosClientesDTO(
    String id,
    String nome,
    String cpf,
    Boolean isValidCpf,
    EnderecoDTO endereco
) {
}
