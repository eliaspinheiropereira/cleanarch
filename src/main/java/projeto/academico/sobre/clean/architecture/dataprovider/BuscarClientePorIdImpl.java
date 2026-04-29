package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarClientePorId;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.ClienteRepository;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.mapper.ClienteEntityMapper;

import java.util.Optional;

@Component
public class BuscarClientePorIdImpl implements BuscarClientePorId {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    ClienteEntityMapper clienteEntityMapper;

    @Override
    public Optional<Cliente> find(String id) {
        var clienteEntity = this.clienteRepository.findById(id);
        return clienteEntity.map(clienteEntityMapper::toCliente);
    }
}
