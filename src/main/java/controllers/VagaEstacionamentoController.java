package controllers;

import Repositories.VagaEstacionamentoRepository;
import models.VagaEstacionamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class VagaEstacionamentoController {

    @Autowired
    VagaEstacionamentoRepository vagaEstacionamentoRepository;

    @GetMapping("/vaga")
    public List<VagaEstacionamento> buscarTodasVagas() {
        return vagaEstacionamentoRepository.findAll();
    }

    @GetMapping("/vaga/{id}")
    public VagaEstacionamento buscarVagaPorId(@PathVariable UUID id){
        return vagaEstacionamentoRepository.findById(id).get();
    }

    @PostMapping("/vaga")
    public VagaEstacionamento cadastarVeiculoNaVaga(@RequestBody VagaEstacionamento vagaEstacionamento) {
        return vagaEstacionamentoRepository.save(vagaEstacionamento);
    }

    @DeleteMapping("/vaga/{id}")
    public void excluirVaga(@PathVariable UUID id){
        vagaEstacionamentoRepository.deleteById(id);
    }
}
