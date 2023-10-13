package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class Talle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column @Getter @Setter
    private String descripcion;

    @ManyToOne @Getter @Setter
    @JoinColumn(name="tipotalle_id", nullable=false)
    private TipoTalle tipoTalle;

    @OneToMany(mappedBy = "talle")
    private List<Stock> stocks;
}
