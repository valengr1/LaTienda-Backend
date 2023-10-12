package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@ToString @NoArgsConstructor @AllArgsConstructor
public class Tienda {

    @Id
    @Getter @Setter
    private Long cuit;

    @Column @Getter @Setter
    private String descripcion;

    @Getter @Setter
    @OneToMany(mappedBy="tienda")
    private List<Sucursal> sucursales;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "condiciontributaria_id")
    private CondicionTributaria condicionTributaria;
}
