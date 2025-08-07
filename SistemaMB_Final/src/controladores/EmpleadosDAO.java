package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.EmpleadosModel;

/**
 *
 * @author MaLinares BlanCosta
 */
public class EmpleadosDAO {
    public List<EmpleadosModel> getAll(){
        List<EmpleadosModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Empleados ORDER BY Id_Empleados ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new EmpleadosModel(
                        resultado.getInt("Id_Empleados"),
                        resultado.getString("Nombre_Empleado"),
                        resultado.getString("Apellido_Empleado"),
                        resultado.getString("Fecha_Entrada"),
                        resultado.getString("Numero_Empleado"),
                        resultado.getString("Correo_Empleado"),
                        resultado.getString("DNI_Empleado"),
                        resultado.getString("Sueldo"),
                        resultado.getString("Rol_Empleado"),
                        resultado.getString("Hora_Entrada"),
                        resultado.getString("Hora_Salida")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar empleados: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_Empleados) FROM Empleados";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int ultimoId = rs.getInt(1);
            idDisponible = ultimoId + 1;
        }
        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        System.err.println("Error al obtener el siguiente ID: " + e.getMessage());
    }
    return idDisponible;
}
    
    public static List<Integer> obtenerIDRol() {
        List<Integer> lista = new ArrayList<>();
        try (Connection con = ConexionBD.ObtenerConexion();
             PreparedStatement ps = con.prepareStatement("SELECT DISTINCT Rol_Empleado FROM Empleados ORDER BY Rol_Empleado ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("Rol_Empleado"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public boolean insert(Object object) {
    EmpleadosModel empleado = (EmpleadosModel) object;
    
    String sql = "INSERT INTO Empleados (" +
                 "ID_Empleados, Nombre_Empleado, Apellido_Empleado, Fecha_Entrada, Numero_Empleado, " +
                 "Correo_Empleado, DNI_Empleado, Sueldo, Rol_Empleado, " +
                 "Hora_Entrada, Hora_Salida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,empleado.getId());
        pst.setString(2, empleado.getNombre());
        pst.setString(3, empleado.getApellido());
        pst.setString(4, empleado.getFechaEntrada());
        pst.setString(5, empleado.getNumeroEmpleado());
        pst.setString(6, empleado.getCorreo());
        pst.setString(7, empleado.getDni());
        pst.setString(8, empleado.getSueldo());
        pst.setString(9, empleado.getRol());
        pst.setString(10, empleado.getHoraEntrada());
        pst.setString(11, empleado.getHoraSalida());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar empleado: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean update(Object object) {
    EmpleadosModel empleado = (EmpleadosModel) object;

    String sql = "UPDATE Empleados SET " +
                 "Nombre_Empleado = ?, " +
                 "Apellido_Empleado = ?, " +
                 "Fecha_Entrada = ?, " +
                 "Numero_Empleado = ?, " +
                 "Correo_Empleado = ?, " +
                 "DNI_Empleado = ?, " +
                 "Sueldo = ?, " +
                 "Rol_Empleado = ?, " +
                 "Hora_Entrada = ?, " +
                 "Hora_Salida = ? " +
                 "WHERE Id_Empleados = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, empleado.getNombre());
        pst.setString(2, empleado.getApellido());
        pst.setString(3, empleado.getFechaEntrada());
        pst.setString(4, empleado.getNumeroEmpleado());
        pst.setString(5, empleado.getCorreo());
        pst.setString(6, empleado.getDni());
        pst.setString(7, empleado.getSueldo());
        pst.setString(8, empleado.getRol());
        pst.setString(9, empleado.getHoraEntrada());
        pst.setString(10, empleado.getHoraSalida());
        pst.setInt(11, empleado.getId());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar empleado: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Empleados WHERE Id_Empleados = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar empleado: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Empleados WHERE Id_Empleados = ?;";
    EmpleadosModel empleado = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            empleado = new EmpleadosModel(
                resultado.getInt("Id_Empleados"),
                resultado.getString("Nombre_Empleado"),
                resultado.getString("Apellido_Empleado"),
                resultado.getString("Fecha_Entrada"),
                resultado.getString("Numero_Empleado"),
                resultado.getString("Correo_Empleado"),
                resultado.getString("DNI_Empleado"),
                resultado.getString("Sueldo"),
                resultado.getString("Rol_Empleado"),
                resultado.getString("Hora_Entrada"),
                resultado.getString("Hora_Salida")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar empleado por ID: " + ex.getMessage());
    }

    return empleado;
  }
}
