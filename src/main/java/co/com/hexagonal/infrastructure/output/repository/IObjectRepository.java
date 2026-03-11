package co.com.hexagonal.infrastructure.output.repository;

import co.com.hexagonal.infrastructure.output.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IObjectRepository extends JpaRepository<ObjectEntity, Long> {

}
