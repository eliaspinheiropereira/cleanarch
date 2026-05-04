package projeto.academico.sobre.clean.architecture.core.usecase.impl;

import projeto.academico.sobre.clean.architecture.core.dataprovider.DeleteClientePorId;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.DeleteClientePorIdUseCase;

public class DeleteClientePorIdUseCaseImpl implements DeleteClientePorIdUseCase {

    private final BuscarClientePorIdUseCase buscarClientePorIdUseCase;
    private final DeleteClientePorId deleteClientePorId;

    public DeleteClientePorIdUseCaseImpl(BuscarClientePorIdUseCase buscarClientePorIdUseCase, DeleteClientePorId deleteClientePorId) {
        this.buscarClientePorIdUseCase = buscarClientePorIdUseCase;
        this.deleteClientePorId = deleteClientePorId;
    }

    @Override
    public void delete(String id) {
        this.buscarClientePorIdUseCase.find(id);
        this.deleteClientePorId.delete(id);
    }
}
