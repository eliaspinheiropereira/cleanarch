package projeto.academico.sobre.clean.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarClientePorId;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.impl.BuscarClientePorIdUseCaseImpl;

@Configuration
public class BuscarClientePorIdConfig {

    @Bean
    public BuscarClientePorIdUseCase buscarClientePorIdUseCase(
            BuscarClientePorId buscarClientePorId
    ){
        return new BuscarClientePorIdUseCaseImpl(buscarClientePorId);
    }
}
