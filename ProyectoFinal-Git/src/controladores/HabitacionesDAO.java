package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.HabitacionesModel;

/**
 *
 * @author MaLinares
 */
public class HabitacionesDAO {
    public List<HabitacionesModel> getAll(){
        List<HabitacionesModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Habitaciones;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new HabitacionesModel(
                        resultado.getInt("Numero_Habitacion"),
                        resultado.getString("ID_Habitacion"),
                        resultado.getString("Tipo_Habitacion"),
                        resultado.getString("Precio"),
                        resultado.getString("Estado_Habitacion")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar Empleados: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(Numero_Habitacion) FROM Habitaciones";
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
    
    public boolean insert(Object object) {
    HabitacionesModel habitacion = (HabitacionesModel) object;
    
    String sql = "INSERT INTO Habitaciones (" +
                 "Numero_Habitacion, ID_Habitacion, Tipo_Habitacion, Precio, Estado_Habitacion) VALUES (?, ?, ?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,habitacion.getNum());
        pst.setString(2, habitacion.getId());
        pst.setString(3, habitacion.getTipo());
        pst.setString(4, habitacion.getPrecio());
        pst.setString(5, habitacion.getEstado());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar habitacion: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean update(Object object) {
    HabitacionesModel habitacion = (HabitacionesModel) object;

    String sql = "UPDATE Habitaciones SET " +
                 "ID_Habitacion = ?, " +
                 "Tipo_Habitacion = ?, " +
                 "Precio = ?, " +
                 "Estado_Habitacion = ? " +
                 "WHERE Numero_Habitacion = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, habitacion.getId());
        pst.setString(2, habitacion.getTipo());
        pst.setString(3, habitacion.getPrecio());
        pst.setString(4, habitacion.getEstado());
        pst.setInt(5, habitacion.getNum());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar empleado: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Habitaciones WHERE Numero_Habitacion = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar habitacion: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getByNum(int id) {
    String query = "SELECT * FROM Habitaciones WHERE Numero_Habitacion = ?;";
    HabitacionesModel habitacion = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            habitacion = new HabitacionesModel(
                resultado.getInt("Numero_Habitacion"),
                resultado.getString("ID_Habitacion"),
                resultado.getString("Tipo_Habitacion"),
                resultado.getString("Precio"),
                resultado.getString("Estado_Habitacion")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar habitacion por numero: " + ex.getMessage());
    }

    return habitacion;
   }
}
