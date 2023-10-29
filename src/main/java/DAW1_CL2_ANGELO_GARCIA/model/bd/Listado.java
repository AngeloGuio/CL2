package DAW1_CL2_ANGELO_GARCIA.model.bd;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "listado")

public class Listado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;

    @Column(name = "nomproducto")
    private  String nomproducto;

    @Column(name = "precio")
    private  Double precio;

}
