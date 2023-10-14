package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;

@Entity @ToString @AllArgsConstructor @NoArgsConstructor
public class Pago {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private Calendar fecha;

    @Column @Getter @Setter
    private Double monto;

    @ManyToOne @JoinColumn(name = "tipoPago_id", nullable = false)
    @Getter @Setter
    private TipoPago tipoPago;

    @OneToOne(mappedBy = "pago")
    @Getter @Setter
    private Venta venta;

}
