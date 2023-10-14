package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class Cliente {
    @Id @Getter @Setter
     private Long dni;
    @Column @Getter @Setter
     private Long cuil;
    @Column @Getter @Setter
     private String nombre;
    @Column @Getter @Setter
     private String apellido;
    @Column @Getter @Setter
     private String telefono;
    @Column @Getter @Setter
     private String mail;

    @ManyToOne
    @JoinColumn(name = "condicionTributaria_id", nullable = false)
    private CondicionTributaria condicionTributaria;

    @OneToMany(mappedBy = "cliente")
    @Getter @Setter
    private List<Venta> ventas;
}
