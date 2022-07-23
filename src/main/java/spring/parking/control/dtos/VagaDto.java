package spring.parking.control.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VagaDto {

    @NotBlank
    private String numeroVagaEstacionamento;

    @NotBlank
    @Size(max = 7)
    private String placaVeiculo;

    @NotBlank
    private String marcaVeiculo;

    @NotBlank
    private String modeloVeiculo;

    @NotBlank
    private String corVeiculo;

    @NotBlank
    private String nomeDonoVeiculo;

    @NotBlank
    @CPF
    private String cpfDonoVeiculo;

    @NotBlank
    private String numeroApartamento;

    @NotBlank
    private String blocoApartamento;
}

