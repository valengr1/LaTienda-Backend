package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @ToString @AllArgsConstructor @NoArgsConstructor
public class Color {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column @Getter @Setter
    private String descripcion;

    @OneToMany(mappedBy = "color")
    private List<Stock> stocks;
}
