package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString
public class Deposito {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column @Getter @Setter
    private String descripcion;

    @OneToOne
    @JoinColumn(name="sucursal_id")
    @Getter @Setter
    private Sucursal sucursal;

    @OneToMany(mappedBy = "deposito")
    private List<Stock> stocks;
}
