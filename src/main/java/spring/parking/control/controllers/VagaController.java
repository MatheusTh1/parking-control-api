package spring.parking.control.controllers;

import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.parking.control.models.VagaModel;
import spring.parking.control.repositories.VagaRepository;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@SpringBootApplication
@RestController
@RequestMapping("/vagas")
public class VagaController {

    VagaRepository vagaRepository;

    @GetMapping
    public List<VagaModel> buscarTodasVagas() {
        return vagaRepository.findAll();
    }

    @PostMapping
    public VagaModel cadastarVeiculoNaVaga(@RequestBody VagaModel vagaModel) {
        return vagaRepository.save(vagaModel);
    }

    @GetMapping("/{id}")
    public VagaModel buscarVagaPorId(@PathVariable UUID id){
        return vagaRepository.findById(id).get();
    }
    
    @PutMapping("/{id}")
    public VagaModel atualizarVeiculoNaVaga(@RequestBody VagaModel vagaModel){
        return vagaRepository.save(vagaModel);
    }

    @DeleteMapping("/{id}")
    public void excluirVaga(@PathVariable UUID id){
        vagaRepository.deleteById(id);
    }
}
