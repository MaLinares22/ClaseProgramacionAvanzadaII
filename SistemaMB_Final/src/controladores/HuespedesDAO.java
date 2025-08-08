package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.HuespedesModel;
/**
 *
 * @author MaLinares BlanCosta
 */
public class HuespedesDAO {
    public List<HuespedesModel> getAll(){
        List<HuespedesModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Huespedes ORDER BY ID_Huesped ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new HuespedesModel(
                        resultado.getInt("ID_Huesped"),
                        resultado.getString("Nombre_Huesped"),
                        resultado.getString("Apellido_Huesped"),
                        resultado.getString("Correo_Huesped"),
                        resultado.getString("DNI_Huesped"),
                        resultado.getString("Telefono_Huesped")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar huespedes: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_Huesped) FROM Huespedes";
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
    HuespedesModel huesped = (HuespedesModel) object;
    
    String sql = "INSERT INTO Huespedes (" +
                 "ID_Huesped, Nombre_Huesped, Apellido_Huesped, Correo_Huesped, DNI_Huesped, Telefono_Huesped) VALUES (?, ?, ?, ?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,huesped.getId());
        pst.setString(2, huesped.getNombre());
        pst.setString(3, huesped.getApellido());
        pst.setString(4, huesped.getCorreo());
        pst.setString(5, huesped.getDNI());
        pst.setString(6, huesped.getTelefono());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar huesped: " + ex.getMessage());
        return false;
    }
  }

public boolean update(Object object) {
    HuespedesModel huesped = (HuespedesModel) object;

    String sql = "UPDATE Huespedes SET " +
                 "Nombre_Huesped = ?, " +
                 "Apellido_Huesped = ?, " +
                 "Correo_Huesped = ?, " +
                 "DNI_Huesped = ?, " +
                 "Telefono_Huesped = ? " +
                 "WHERE ID_Huesped = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, huesped.getNombre());
        pst.setString(2, huesped.getApellido());
        pst.setString(3, huesped.getCorreo());
        pst.setString(4, huesped.getDNI());
        pst.setString(5, huesped.getTelefono());
        pst.setInt(6, huesped.getId());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar huesped: " + ex.getMessage());
        return false;
    }
  }

public boolean delete(int id) {
    String sql = "DELETE FROM Huespedes WHERE ID_Huesped = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar huesped: " + ex.getMessage());
        return false;
    }
 }

public Object getById(int id) {
    String query = "SELECT * FROM Huespedes WHERE ID_Huesped = ?;";
    HuespedesModel huesped = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            huesped = new HuespedesModel(
                resultado.getInt("ID_Huesped"),
                resultado.getString("Nombre_Huesped"),
                resultado.getString("Apellido_Huesped"),
                resultado.getString("Correo_Huesped"),
                resultado.getString("DNI_Huesped"),
                resultado.getString("Telefono_Huesped")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar huesped por ID: " + ex.getMessage());
    }

    return huesped;
   }

public boolean comitear() {
    try (Connection con = ConexionBD.ObtenerConexion()) {
        con.setAutoCommit(false);
        
        con.commit();
        System.err.println("Commit con exito");
        return true;
    } catch (SQLException ex) {
        System.err.println("Error al Commitear: " + ex.getMessage());
        return false;
    }
   }
}
