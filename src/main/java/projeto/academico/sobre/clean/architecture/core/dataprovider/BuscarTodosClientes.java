package projeto.academico.sobre.clean.architecture.core.dataprovider;

import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.domain.PageResult;

public interface BuscarTodosClientes {
    PageResult<Cliente> findAll(int page, int size);
}
