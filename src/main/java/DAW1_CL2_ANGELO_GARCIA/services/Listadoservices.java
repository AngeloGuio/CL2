package DAW1_CL2_ANGELO_GARCIA.services;

import DAW1_CL2_ANGELO_GARCIA.model.bd.Listado;
import DAW1_CL2_ANGELO_GARCIA.repository.ListadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Listadoservices {

    private ListadoRepository listadoRepository;

    public List<Listado> listarProducto(){
        return listadoRepository.findAll();
    }


}
