package gm.tienda_libros.modelo;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Esta sera nuestra clase libro donde agregaremos nuestros
//constructores, getters y setters. Ojo con las anotaciones que agregaremos

@Entity // para que se convierta en una tabla en la base de datos
@Data// para que se generen los getters, setters, constructores, toString
@NoArgsConstructor // para que se genere el constructor sin argumentos
@AllArgsConstructor // constructor con todos los argumentos
@ToString // para que se genere el toString


public class Libro {
    @Id // para que se convierta en la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idLibro;
    String nombreLibro;
    String autor;
    Double precio;
    Integer existencias;
}


