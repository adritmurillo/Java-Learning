package gm.Tareas.servicio;

import gm.Tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    public List<Tarea> listarTareas();
    public Tarea buscarTareaPorId(Integer idTarea);

    // El metodo guardar tarea sirve para modificar o insertar una tarea
    // Si la tarea no tiene id es porque no esta dentro de la base de datos, entonces se inserta
    // Si la tarea ya tiene un id, entonces tiene la capacidad de ser modificada

    public void guardarTarea(Tarea tarea);
    public void eliminarTarea(Tarea tarea);
}
