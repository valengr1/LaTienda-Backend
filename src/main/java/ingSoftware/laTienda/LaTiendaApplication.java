package ingSoftware.laTienda;

import ingSoftware.laTienda.model.Articulo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaTiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaTiendaApplication.class, args);
		/*Articulo a1 = new Articulo(1L, "Remera nike", 10000.0,0.5);
		System.out.println("Neto gravado: " + a1.getNetoGravado());
		System.out.println("IVA: " + a1.getIva());
		System.out.println("Precio venta: " + a1.getPrecioVenta());*/
	}

}
