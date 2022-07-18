package spring.parking.control.repositories;

import spring.parking.control.models.VagaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VagaRepository extends JpaRepository <VagaModel, UUID> {
}
