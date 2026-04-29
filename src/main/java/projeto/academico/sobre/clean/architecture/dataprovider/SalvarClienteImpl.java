package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.SalvarCliente;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.ClienteRepository;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.mapper.ClienteEntityMapper;

@Component
public class SalvarClienteImpl implements SalvarCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public void salvar(Cliente cliente) {
        var clienteEntity = this.clienteEntityMapper.toClienteEntity(cliente);
        this.clienteRepository.save(clienteEntity);
    }
}
