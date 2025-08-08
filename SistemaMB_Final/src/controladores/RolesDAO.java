package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import modelos.RolesModel;
/**
 *
 * @author MaLinares BlanCosta
 */
public class RolesDAO {
    public List<RolesModel> getAll(){
        List<RolesModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Roles ORDER BY ID_Rol ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new RolesModel(
                        resultado.getInt("ID_Rol"),
                        resultado.getString("Descripcion_Rol")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar roles: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_Rol) FROM Roles";
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
    RolesModel rol = (RolesModel) object;
    
    String sql = "INSERT INTO Roles (" +
                 "ID_Rol, Descripcion_Rol) VALUES (?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, rol.getId());
        pst.setString(2, rol.getDescripcion());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar rol: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean update(Object object) {
    RolesModel rol = (RolesModel) object;

    String sql = "UPDATE Roles SET " +
                 "Descripcion_Rol = ? " +
                 "WHERE ID_Rol = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, rol.getDescripcion());
        pst.setInt(2, rol.getId());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar rol: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Roles WHERE ID_Rol = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar rol: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Roles WHERE ID_Rol = ?;";
    RolesModel rol = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            rol = new RolesModel(
                resultado.getInt("ID_Rol"),
                resultado.getString("Descripcion_Rol")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar rol por ID: " + ex.getMessage());
    }

    return rol;
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
