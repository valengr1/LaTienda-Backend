package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString @AllArgsConstructor @NoArgsConstructor
public class PuntoVenta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @ManyToOne @Getter @Setter
    @JoinColumn(name="sucursal_id", nullable=false)
    private Sucursal sucursal;

}
