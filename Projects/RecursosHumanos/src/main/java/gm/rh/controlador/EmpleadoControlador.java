package gm.rh.controlador;


import gm.rh.excepcion.RecursoNoEncontradoExcepcion;
import gm.rh.modelo.Empleado;
import gm.rh.servicio.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rh-app") //http://localhost:8080/rh-app
@CrossOrigin(value = "http://localhost:3000")

public class EmpleadoControlador {

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados") //http://localhost:8080/rh-app/empleados

    public List<Empleado> obtenerEmpleados(){
        return empleadoServicio.listarEmpleados();
    }

    @PostMapping("/empleados") //http://localhost:8080/rh-app/empleados
    public Empleado agregarEmpleado(
            @RequestBody Empleado empleado
    ){
        return empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}") //http://localhost:8080/rh-app/empleados/1 por ejemplo
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(
            @PathVariable Integer id
    ){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null){
            throw new RecursoNoEncontradoExcepcion("No se encontró el empleado con ID: " + id);
        } else {
            return ResponseEntity.ok(empleado);
        }
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(
            @PathVariable Integer id,
            @RequestBody Empleado empleadoRecibido

    ){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null){
            throw new RecursoNoEncontradoExcepcion("No se encontro el empleado con ID: " + id);
        } else {
            empleado.setNombre(empleadoRecibido.getNombre());
            empleado.setDepartamento(empleadoRecibido.getDepartamento());
            empleado.setSueldo(empleadoRecibido.getSueldo());
            empleadoServicio.guardarEmpleado(empleado);
            return ResponseEntity.ok(empleado);
        }
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(
            @PathVariable Integer id
    ){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null){
            throw new RecursoNoEncontradoExcepcion("No se encontro el empleado con ID: " + id);
        } else {
            empleadoServicio.eliminarEmpleado(empleado);
            Map<String,Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado", Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        }
    }

}
