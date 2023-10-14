package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @AllArgsConstructor @NoArgsConstructor
public class TipoComprobante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private String descripcion;

    @OneToMany(mappedBy = "tipoComprobante")
    @Getter @Setter
    private List<Venta> ventas;

    @OneToMany(mappedBy = "tipoComprobante")
    @Getter @Setter
    private List<CondicionTributaria> condicionesTributarias;
}
