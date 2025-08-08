package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import modelos.ServiciosModel;
/**
 *
 * @author MaLinares BlanCosta
 */
public class ServiciosDAO {
    public List<ServiciosModel> getAll(){
        List<ServiciosModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Servicios ORDER BY ID_Servicio ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new ServiciosModel(
                        resultado.getInt("ID_Servicio"),
                        resultado.getString("Servicio"),
                        resultado.getString("Descripcion"),
                        resultado.getString("Precio"),
                        resultado.getString("Duracion")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar servicios: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_Servicio) FROM Servicios";
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
    ServiciosModel servicios = (ServiciosModel) object;
    
    String sql = "INSERT INTO Servicios (" +
                 "ID_Servicio, Servicio, Descripcion, Precio, Duracion) VALUES (?, ?, ?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, servicios.getId());
        pst.setString(2, servicios.getServicio());
        pst.setString(3, servicios.getDescripcion());
        pst.setString(4, servicios.getPrecio());
        pst.setString(5, servicios.getDuracion());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar servicio: " + ex.getMessage());
        return false;
    }
  }
    public boolean update(Object object) {
    ServiciosModel servicio = (ServiciosModel) object;

    String sql = "UPDATE Servicios SET " +
                 "Servicio = ?, " +
                 "Descripcion = ?, " +
                 "Precio = ?, " +
                 "Duracion = ? " +
                 "WHERE ID_Servicio = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, servicio.getServicio());
        pst.setString(2, servicio.getDescripcion());
        pst.setString(3, servicio.getPrecio());
        pst.setString(4, servicio.getDuracion());
        pst.setInt(5, servicio.getId());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar servicio: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Servicios WHERE ID_Servicio = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar servicio: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Servicios WHERE ID_Servicio = ?;";
    ServiciosModel servicio = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            servicio = new ServiciosModel(
                resultado.getInt("ID_Servicio"),
                resultado.getString("Servicio"),
                resultado.getString("Descripcion"),
                resultado.getString("Precio"),
                resultado.getString("Duracion")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar servicio por ID: " + ex.getMessage());
    }

    return servicio;
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
