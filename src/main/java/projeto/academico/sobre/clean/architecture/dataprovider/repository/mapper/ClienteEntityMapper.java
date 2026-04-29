package projeto.academico.sobre.clean.architecture.dataprovider.repository.mapper;

import org.mapstruct.Mapper;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.entities.ClienteEntity;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {
    ClienteEntity toClienteEntity(Cliente cliente);
    Cliente toCliente(ClienteEntity clienteEntity);
}
