package projeto.academico.sobre.clean.architecture.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import projeto.academico.sobre.clean.architecture.dataprovider.client.response.EnderecoResponse;

@FeignClient(
        name = "BuscarEnderecoPorCep",
        url = "${arantes.client.address.url}"
)
public interface BuscarEnderecoPorCep {
    @GetMapping("/{cep}")
    EnderecoResponse encontrar(@PathVariable String cep);
}
