package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<Articulo> articulos;
}
