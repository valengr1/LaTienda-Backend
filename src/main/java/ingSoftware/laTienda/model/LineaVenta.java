package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.NaturalId;

import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString
public class LineaVenta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private int cantidadRequerida;

    @ManyToOne
    @JoinColumn(name = "stock_id",nullable = false)
    @Getter @Setter
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "venta_id", nullable = false)
    @Getter @Setter
    private Venta venta;

    public Double getSubtotal(){
        return stock.getArticulo().getPrecioVenta() * cantidadRequerida;
    }
}
