package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.AtualizarCliente;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.ClienteRepository;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.mapper.ClienteEntityMapper;

@Component
public class AtualizarClienteImpl implements AtualizarCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public void update(Cliente cliente) {
        var clienteEntity = this.clienteEntityMapper.toClienteEntity(cliente);
        this.clienteRepository.save(clienteEntity);
    }
}
