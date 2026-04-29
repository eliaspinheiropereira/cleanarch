package projeto.academico.sobre.clean.architecture.core.usecase;

import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.domain.PageResult;

import java.util.List;

public interface BuscarTodosClientesUseCase {
    PageResult<Cliente> findAll(int page, int size);
}
