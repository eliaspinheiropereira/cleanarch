package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarEndereco;
import projeto.academico.sobre.clean.architecture.core.domain.Endereco;
import projeto.academico.sobre.clean.architecture.dataprovider.client.BuscarEnderecoPorCep;
import projeto.academico.sobre.clean.architecture.dataprovider.client.mapper.EnderecoResponseMapper;

@Component
public class BuscarEnderecoImpl implements BuscarEndereco {

    @Autowired
    private BuscarEnderecoPorCep buscarEnderecoPorCep;

    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;

    @Override
    public Endereco buscarEnderecoPorCep(String cep) {
        var enderecoResponse = this.buscarEnderecoPorCep.encontrar(cep);
        return this.enderecoResponseMapper.toEndereco(enderecoResponse);
    }
}
