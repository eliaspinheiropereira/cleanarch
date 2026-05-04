package projeto.academico.sobre.clean.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.academico.sobre.clean.architecture.core.dataprovider.DeleteClientePorId;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.DeleteClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.impl.DeleteClientePorIdUseCaseImpl;

@Configuration
public class DeleteClienteConfig {

    @Bean
    public DeleteClientePorIdUseCase deleteClientePorIdUseCase(
            BuscarClientePorIdUseCase buscarClientePorIdUseCase,
            DeleteClientePorId deleteClientePorId
    ){
        return new DeleteClientePorIdUseCaseImpl(buscarClientePorIdUseCase, deleteClientePorId);
    }
}
