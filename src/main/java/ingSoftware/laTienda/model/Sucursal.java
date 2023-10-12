package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@ToString @NoArgsConstructor @AllArgsConstructor
public class Sucursal {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Column @Getter @Setter
    private String direccion;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name="tienda_cuit", nullable=false)
    private Tienda tienda;

    @Getter @Setter
    @OneToMany(mappedBy="sucursal")
    private List<Vendedor> vendedores;

    @Getter @Setter
    @OneToMany(mappedBy="sucursal")
    private List<PuntoVenta> puntosVenta;
}
