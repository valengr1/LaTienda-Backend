package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "condicionTributaria")
    @Getter @Setter
    private List<Cliente> clientes;

    @ManyToOne @JoinColumn(name = "tipoComprobante_id",  nullable = false)
    @Getter @Setter
    private TipoComprobante tipoComprobante;
}
