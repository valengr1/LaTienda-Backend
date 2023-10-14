package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;
import java.util.List;

@Entity @ToString @AllArgsConstructor @NoArgsConstructor
public class Venta {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column @Getter @Setter
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    
    @OneToMany(mappedBy = "venta")
    @Getter @Setter
    private List<LineaVenta> lineasVenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    @Getter @Setter
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "puntoVenta_id",nullable = false)
    @Getter @Setter
    private PuntoVenta puntoVenta;

    @ManyToOne @JoinColumn(name = "vendedor_id", nullable = false)
    @Getter @Setter
    private Vendedor vendedor;

    @ManyToOne @JoinColumn(name = "tipoComprobante_id", nullable = false)
    @Getter @Setter
    private TipoComprobante tipoComprobante;

    @OneToOne @JoinColumn(name = "pago_id", nullable = false)
    @Getter @Setter
    private Pago pago;
    public Double getTotal() {
        Double total = 0.0;
        for (LineaVenta lineaVenta: lineasVenta) {
             total += lineaVenta.getSubtotal();
        }
        return total;
    }
}
