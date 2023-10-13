package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class Stock {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private int cantidadDisponible;

    @ManyToOne
    @JoinColumn(name= "color_id" ,nullable = false)
    private Color color;

    @ManyToOne
    @JoinColumn(name = "talle_id", nullable = false)
    private Talle talle;

    @ManyToOne
    @JoinColumn(name = "articulo_id",nullable = false)
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "deposito_id",nullable = false)
    private Deposito deposito;
}
