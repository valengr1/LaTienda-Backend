package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class Stock {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private int cantidadDisponible;

    @ManyToOne
    @JoinColumn(name= "color_id" ,nullable = false)
    @Getter @Setter
    private Color color;

    @ManyToOne
    @JoinColumn(name = "talle_id", nullable = false)
    @Getter @Setter
    private Talle talle;

    @ManyToOne @Getter @Setter
    @JoinColumn(name = "articulo_id",nullable = false)
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "deposito_id",nullable = false)
    @Getter @Setter
    private Deposito deposito;

    @OneToMany(mappedBy = "stock")
    @Getter @Setter
    private List<LineaVenta> lineasVenta;
}
