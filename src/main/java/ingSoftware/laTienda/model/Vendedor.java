package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@ToString @AllArgsConstructor @NoArgsConstructor
public class Vendedor {
    @Id @Getter @Setter
    private String legajo;

    @Column @Getter @Setter
    private String nombre;

    @Column @Getter @Setter
    private String apellido;

    @Column @Getter @Setter
    private String mail;

    @Column @Getter @Setter
    private String usuario;

    @Column @Getter @Setter
    private String contraseña;

    @Getter @Setter
    @ManyToOne @JoinColumn(name="sucursal_id", nullable=false)
    private Sucursal sucursal;

    @OneToMany(mappedBy = "vendedor")
    private List<Venta> ventas;
}
