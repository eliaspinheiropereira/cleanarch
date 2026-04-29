package projeto.academico.sobre.clean.architecture.core.dataprovider;

import projeto.academico.sobre.clean.architecture.core.domain.Endereco;

public interface BuscarEndereco {
    Endereco buscarEnderecoPorCep(String cep);
}
