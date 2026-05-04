package projeto.academico.sobre.clean.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarTodosClientes;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarTodosClientesUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.impl.BuscarTodosClientesUseCaseImpl;

@Configuration
public class BuscarTodosClientesConfig {

    @Bean
    public BuscarTodosClientesUseCase buscarTodosClientesUseCase(
            BuscarTodosClientes buscarTodosClientes
    ){
        return new BuscarTodosClientesUseCaseImpl(buscarTodosClientes);
    }
}
