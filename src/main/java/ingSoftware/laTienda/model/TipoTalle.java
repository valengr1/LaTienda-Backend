package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class TipoTalle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column @Getter @Setter
    private String descripcion;

    @Getter @Setter
    @OneToMany(mappedBy="tipoTalle")
    private List<Talle> talles;
}
