package gm.estudiantes;

import gm.estudiantes.modelo.Estudiante;
import gm.estudiantes.servicio.EstudianteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger =
			LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();


	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		// Levantar la fabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada!");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el metodo run de Spring Boot..." +nl);

		var salir = false;
		Scanner scanner = new Scanner(System.in);

		while(!salir){
			mostrarMenu();
			salir = ejecutarOperacion(scanner);
			logger.info(nl);
		}// fin del while
	}

	private void mostrarMenu(){
		logger.info(nl);
		logger.info("""
				***SISTEMA DE ESTUDIANTES***
				1. Listar estudiantes
				2. Buscar estudiante por ID
				3. Agregar estudiantes
				4. Modificar estudiante
				5. Eliminar estudiante
				6. Salir
				Elige una opcion:""");
	}

	private boolean ejecutarOperacion(Scanner scanner){
		var opcion = Integer.parseInt(scanner.nextLine());
		var salir = false;
		switch(opcion){
			case 1 -> { // Listar estudiantes
				logger.info(nl + "Listado de estudiantes: " + nl);
				List<Estudiante> listaEstudiantes = estudianteServicio.listarEstudiantes();
				listaEstudiantes.forEach((estudiante -> logger.info(estudiante.toString() + nl)));
			}
			case 2 -> {
				logger.info("Introduce el id estudiante a buscar: ");
				var idEstudiante = Integer.parseInt(scanner.nextLine());
				Estudiante estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null) {
					logger.info("Estudiante encontrado: " + estudiante + nl);
				} else {
					logger.info("Estudiante no encontrado con id: "+idEstudiante +nl );
				}
			}
			case 3 -> {
				logger.info("Agregar estudiante: " + nl);
				logger.info("Nombre: ");
				var nombre = scanner.nextLine();
				logger.info("Apellido: ");
				var apellido = scanner.nextLine();
				logger.info("Telefono: ");
				var telefono = scanner.nextLine();
				logger.info("Email: ");
				var email = scanner.nextLine();
				// Creamos el estudiante sin el id
				var estudiante = new Estudiante();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteServicio.guardarEstudiante(estudiante);
				logger.info("Estudiante agregado: " + estudiante + nl);
			}
			case 4 -> {
				logger.info("Modificar estudiante: " + nl);
				logger.info("Id Estudiante: ");
				var idEstudiante = Integer.parseInt(scanner.nextLine());
				// Buscamos al estudiante por id
				Estudiante estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante!=null){
					logger.info("Nombre: ");
					var nombre = scanner.nextLine();
					logger.info("Apellido: ");
					var apellido = scanner.nextLine();
					logger.info("Telefono: ");
					var telefono = scanner.nextLine();
					logger.info("Email: ");
					var email = scanner.nextLine();
					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setTelefono(telefono);
					estudiante.setEmail(email);
					estudianteServicio.guardarEstudiante(estudiante);
					logger.info("Estudiante modificado: " + estudiante + nl);
				} else {
					logger.info("Estudiante no encontrado con id: "+idEstudiante +nl );
				}

			}
			case 5 -> {
				logger.info("Eliminar estudiante: "+nl);
				logger.info("Proporcione el id del estudiante a eliminar: ");
				var idEstudiante = Integer.parseInt(scanner.nextLine());
				// Buscamos si el estudiante existe
				var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info("Estudiante eliminado: " + estudiante + nl);
				} else {
					logger.info("Estudiante no encontrado con id: "+idEstudiante +nl );
				}
			}
			case 6 -> {
				logger.info("Saliendo del sistema...");
				salir = true;
			}
			default -> logger.info("Opcion invalida, elige una opcion del menu: " + nl);
		} // fin switch
		return salir;
	}
}
