package gm.Tareas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


// Esta es la creacion de nuestra clase Tarea que cuenta con getters, setters
// Tambien cuenta con constructores
// Al mismo tiempo define la tabla llamada Tarea de nuestra base de datos tareas_db
// todos los privates que estan declarados son los atributos de la tabla
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarea;
    private String nombreTarea;
    private String responsable;
    private String estatus;
}
