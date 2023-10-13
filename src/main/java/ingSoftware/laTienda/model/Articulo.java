package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;
import org.apache.tomcat.util.bcel.Const;

import java.util.List;

@Entity @ToString @NoArgsConstructor @AllArgsConstructor
public class Articulo {
    @Id @Getter @Setter
    private Long id;

    @Column @Getter @Setter
    private String descripcion;

    @Column @Getter @Setter
    private Double costo;

    @Column @Getter @Setter
    private Double margenGanancia;

    @ManyToOne
    @JoinColumn(name="categoria_id", nullable=false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    @OneToMany(mappedBy = "articulo")
    private List<Stock> stocks;
    public double getNetoGravado(){
        return costo + costo * margenGanancia;
    }
    public double getIva(){
        return getNetoGravado() * 0.21;
    }
    public double getPrecioVenta(){
        return getNetoGravado() + getIva();
    }


}
