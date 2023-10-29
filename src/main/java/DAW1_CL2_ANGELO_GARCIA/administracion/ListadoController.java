package DAW1_CL2_ANGELO_GARCIA.administracion;

import DAW1_CL2_ANGELO_GARCIA.services.Listadoservices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/listado")
public class ListadoController {

    private Listadoservices listadoservices;

    @GetMapping("/frmestado")
    public String frmestado(Model model){
        model.addAttribute("listaproducto",listadoservices.listarProducto());
        return "administracion/frmestado";
    }
}
