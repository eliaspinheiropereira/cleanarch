package projeto.academico.sobre.clean.architecture.dataprovider.client.mapper;

import org.mapstruct.Mapper;
import projeto.academico.sobre.clean.architecture.core.domain.Endereco;
import projeto.academico.sobre.clean.architecture.dataprovider.client.response.EnderecoResponse;

@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {
    Endereco toEndereco(EnderecoResponse enderecoResponse);
}
