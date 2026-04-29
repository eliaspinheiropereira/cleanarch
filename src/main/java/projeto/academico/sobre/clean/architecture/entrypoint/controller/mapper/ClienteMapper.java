package projeto.academico.sobre.clean.architecture.entrypoint.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.dto.ClienteDTO;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Cliente toCliente(ClienteDTO clienteDTO);
}
