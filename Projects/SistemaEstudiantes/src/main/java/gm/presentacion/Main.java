package gm.presentacion;

import gm.datos.EstudianteDAO;
import gm.dominio.Estudiante;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        var salir = false;
        Scanner scanner = new Scanner(System.in);
        // Crear instancia de clase servicio
        EstudianteDAO estudianteDAO = new EstudianteDAO();

        while (!salir) {
            try {
                mostrarMenu();
                salir = ejecutarOpciones(scanner, estudianteDAO);
            } catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }// Fin del while

    }

    private static void mostrarMenu(){
        System.out.println("Bienvenido al sistema de estudiantes");
        System.out.println("1. Listar estudiantes");
        System.out.println("2. Buscar estudiante por id");
        System.out.println("3. Agregar estudiante");
        System.out.println("4. Modificar estudiante");
        System.out.println("5. Eliminar estudiante");
        System.out.println("6. Salir");
    }

    private static boolean ejecutarOpciones(Scanner scanner, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(scanner.nextLine());
        var salir = false;

        switch (opcion){
            case 1 -> {
                System.out.println("Lista de estudiantes: ");
                var estudiantesLista = estudianteDAO.listarEstudiantes();
                estudiantesLista.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Ingrese el id del estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(scanner.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if (encontrado){
                    System.out.println("Estudiante encontrado: " + estudiante);
                } else {
                    System.out.println("No se encontro al estudiante: " + estudiante);
                }
            }
            case 3 -> {
                System.out.println("Agregar estudiante");
                System.out.print("Nombre: ");
                var nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                var apellido = scanner.nextLine();
                System.out.print("Telefono: ");
                var telefono = scanner.nextLine();
                System.out.print("Email: ");
                var email = scanner.nextLine();
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado){
                    System.out.println("Estudiante agregado: " + estudiante);
                } else {
                    System.out.println("No se pudo agregar al estudiante: " + estudiante);
                }
            }
            case 4 -> {
                System.out.println("Modificar estudiante: ");
                System.out.println("Ingrese el id del estudiante a modificar: ");
                var idEstudiante = Integer.parseInt(scanner.nextLine());
                System.out.print("Nombre: ");
                var nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                var apellido = scanner.nextLine();
                System.out.print("Telefono: ");
                var telefono = scanner.nextLine();
                System.out.print("Email: ");
                var email = scanner.nextLine();
                // Creamos el objeto estudiante

                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);

                if (modificado){
                    System.out.println("Estudiante modificado: " + estudiante);
                } else {
                    System.out.println("Estudiante no modificado: " + estudiante);
                }
            }
            case 5 -> {
                System.out.println("Eliminar estudiante: ");
                System.out.println("Ingrese el id del estudiante a eliminar: ");
                var idEstudiante = Integer.parseInt(scanner.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado){
                    System.out.println("Se elimino al estudiante: " + estudiante);
                } else {
                    System.out.println("No se pudo eliminar al estudiante: " + estudiante);
                }
            }
            case 6 -> {
                System.out.println("Saliendo del sistema...");
                salir = true;
            }
            default -> System.out.println("Opcion no valida, por favor intente de nuevo");
        }
        return salir;
    }
}