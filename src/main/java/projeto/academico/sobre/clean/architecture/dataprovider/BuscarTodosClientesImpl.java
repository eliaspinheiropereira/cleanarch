package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarTodosClientes;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.domain.PageResult;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.ClienteRepository;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.mapper.ClienteEntityMapper;

@Component
public class BuscarTodosClientesImpl implements BuscarTodosClientes {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public PageResult<Cliente> findAll(int page, int size) {
        var pageable = PageRequest.of(page, size);
        var pageResult = this.clienteRepository.findAll(pageable);
        var clientes = pageResult.getContent().stream().map(clienteEntityMapper::toCliente).toList();

        return new PageResult<>(
                clientes,
                page,
                size,
                pageResult.getTotalElements()
        );
    }
}
