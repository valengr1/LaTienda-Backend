package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString @NoArgsConstructor @AllArgsConstructor
public class CondicionTributaria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Column @Getter @Setter
    private String descripcion;

    @Getter @Setter
    @OneToOne(mappedBy = "condicionTributaria")
    private Tienda tienda;
}
