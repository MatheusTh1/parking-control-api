package spring.parking.control.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VagaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String numeroVagaEstacionamento;
    private String placaVeiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private String corVeiculo;
    private String dataRegistro;
    private String nomeResponsavelVeiculo;
    private String numeroApartamento;
    private String blocoApartamento;
}
