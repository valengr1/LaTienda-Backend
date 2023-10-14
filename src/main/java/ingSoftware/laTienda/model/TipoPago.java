package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @AllArgsConstructor @NoArgsConstructor
public class TipoPago {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private String descripcion;

    @OneToMany(mappedBy = "tipoPago")
    @Getter @Setter
    private List<Pago> pagos;
}
