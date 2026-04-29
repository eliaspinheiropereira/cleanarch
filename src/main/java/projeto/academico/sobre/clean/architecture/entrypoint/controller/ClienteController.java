package projeto.academico.sobre.clean.architecture.entrypoint.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.academico.sobre.clean.architecture.core.usecase.InserindoClienteUseCase;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.dto.ClienteDTO;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.mapper.ClienteMapper;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    InserindoClienteUseCase inserindoClienteUseCase;

    @Autowired
    ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> inserir(
            @Valid @RequestBody ClienteDTO clienteDTO
    ){
        var cliente = this.clienteMapper.toCliente(clienteDTO);
        this.inserindoClienteUseCase.inserir(cliente, clienteDTO.cep());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
