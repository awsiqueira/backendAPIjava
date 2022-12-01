package medic.voll.api.controller;

import medic.voll.api.endereco.Endereco;
import medic.voll.api.medico.DadosCadastroMedico;
import medic.voll.api.medico.MedicoRepository;
import medic.voll.api.medico.medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new medico(dados));
    }

}
