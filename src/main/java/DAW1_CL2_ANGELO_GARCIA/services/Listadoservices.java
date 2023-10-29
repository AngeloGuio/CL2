package DAW1_CL2_ANGELO_GARCIA.services;

import DAW1_CL2_ANGELO_GARCIA.model.bd.Listado;
import DAW1_CL2_ANGELO_GARCIA.repository.ListadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstadoListado {

    private ListadoRepository listadoRepository;

    public List<Listado> listarEstados(){
        return listadoRepository.findAll();
    }

    public boolean registrarEstado(Listado listado){
        return listadoRepository.save(listado) != null;
    }

    public void  eliminarEstado(Integer idproducto){
        listadoRepository.deleteById(idproducto);
    }
}
