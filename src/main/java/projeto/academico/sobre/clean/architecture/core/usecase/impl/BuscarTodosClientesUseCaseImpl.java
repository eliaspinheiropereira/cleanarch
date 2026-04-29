package projeto.academico.sobre.clean.architecture.core.usecase.impl;

import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarTodosClientes;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.domain.PageResult;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarTodosClientesUseCase;

public class BuscarTodosClientesUseCaseImpl implements BuscarTodosClientesUseCase {

    private final BuscarTodosClientes buscarTodosClientes;

    public BuscarTodosClientesUseCaseImpl(BuscarTodosClientes buscarTodosClientes) {
        this.buscarTodosClientes = buscarTodosClientes;
    }

    @Override
    public PageResult<Cliente> findAll(int page, int size) {
        if(page < 0 || size <= 0){
            throw new IllegalArgumentException("page ou size invalidos");
        }
        return this.buscarTodosClientes.findAll(page, size);
    }
}
