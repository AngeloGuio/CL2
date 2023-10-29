package DAW1_CL2_ANGELO_GARCIA.repository;

import DAW1_CL2_ANGELO_GARCIA.model.bd.Listado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListadoRepository extends JpaRepository <Listado, Integer>{
}
