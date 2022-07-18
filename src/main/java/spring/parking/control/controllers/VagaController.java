package spring.parking.control.controllers;

import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.parking.control.models.VagaModel;
import spring.parking.control.repositories.VagaRepository;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@SpringBootApplication
@RestController
public class VagaController {

    VagaRepository vagaEstacionamentoRepository;

    @GetMapping("/vaga")
    public List<VagaModel> buscarTodasVagas() {
        return vagaEstacionamentoRepository.findAll();
    }

    @GetMapping("/vaga/{id}")
    public VagaModel buscarVagaPorId(@PathVariable UUID id){
        return vagaEstacionamentoRepository.findById(id).get();
    }

    @PostMapping("/vaga")
    public VagaModel cadastarVeiculoNaVaga(@RequestBody VagaModel vagaModel) {
        return vagaEstacionamentoRepository.save(vagaModel);
    }

    @DeleteMapping("/vaga/{id}")
    public void excluirVaga(@PathVariable UUID id){
        vagaEstacionamentoRepository.deleteById(id);
    }
}
