package projeto.academico.sobre.clean.architecture.entrypoint.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record ClienteDTO(
        @NotBlank
        String nome,

        @NotBlank
        String cpf,

        @NotBlank
        String cep
){}
