package projeto.academico.sobre.clean.architecture.core.usecase.impl;

import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarClientePorId;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;

public class BuscarClientePorIdUseCaseImpl implements BuscarClientePorIdUseCase {

    private final BuscarClientePorId buscarClientePorId;

    public BuscarClientePorIdUseCaseImpl(BuscarClientePorId buscarClientePorId) {
        this.buscarClientePorId = buscarClientePorId;
    }

    @Override
    public Cliente find(String id) {
        return this.buscarClientePorId.find(id)
                .orElseThrow(() -> new RuntimeException("cliente não encontrado"));
    }
}
