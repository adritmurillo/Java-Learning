package gm.cuentas.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // para indicar que es una entidad
@Data // GETTERS y SETTERS POR CADA ATRIBUTO
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremental
    Integer idCuenta;
    String nombre;
    String tipoCuenta; //Ahorro o credito
    Double saldo;
}
