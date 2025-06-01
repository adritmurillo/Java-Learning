package gm.datos;
import gm.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static gm.conexion.Conexion.getConexion;

// DAO ES DATA ACCESS OBJECT
public class EstudianteDAO {
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        // Preparar la sentencia de sql
        PreparedStatement ps;

        // Almacena el rsultado obtenido de la base de datos
        ResultSet rs;

        Connection con = getConexion();
        String sql = "SELECT * FROM student ORDER BY id_student";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_student"));
                estudiante.setNombre(rs.getString("name"));
                estudiante.setApellido(rs.getString("lastname"));
                estudiante.setTelefono(rs.getString("phone"));
                estudiante.setEmail(rs.getString("email"));

                listaEstudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error en la consulta: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return listaEstudiantes;
    }

    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM student WHERE id_student = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("name"));
                estudiante.setApellido(rs.getString("lastname"));
                estudiante.setTelefono(rs.getString("phone"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }
        } catch(Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: "+ e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO student(name, lastname, phone, email)" +
                " VALUES(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            // Execute es para agregar o modificar
            // executeQuery es para consultar desde la base de datos
            ps.execute();
            return true;
        } catch(Exception e){
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE student SET name = ?, lastname = ?, phone = ?, email = ? " +
                "WHERE id_student = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;

        } catch(Exception e){
            System.out.println("Ocurrio un error al modificar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM student WHERE id_student = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;

        } catch (Exception e){
            System.out.println("Ocurrio un error al eliminar estudiante: " + e.getMessage());
        }
        finally{
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return false;
    }

}
