package spring.parking.control.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VAGA_ESTACIONAMENTO_TB")
public class VagaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String numeroVagaEstacionamento;

    @Column(nullable = false, unique = true, length = 7)
    private String placaVeiculo;

    @Column(nullable = false, length = 70)
    private String marcaVeiculo;

    @Column(nullable = false, length = 70)
    private String modeloVeiculo;

    @Column(nullable = false, length = 70)
    private String corVeiculo;

    @Column(nullable = false)
    private String dataRegistro;

    @Column(nullable = false, length = 130)
    private String nomeDonoVeiculo;

    @Column(nullable = false, length = 11)
    private String cpfDonoVeiculo;

    @Column(nullable = false, length = 30)
    private String numeroApartamento;

    @Column(nullable = false, length = 30)
    private String blocoApartamento;
}
