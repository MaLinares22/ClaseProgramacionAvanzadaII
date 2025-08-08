package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.PagosModel;

/**
 *
 * @author MaLinares BlanCosta
 */
public class PagosDAO {
    public List<PagosModel> getAll(){
        List<PagosModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Pagos ORDER BY ID_Pago ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new PagosModel(
                        resultado.getInt("ID_Pago"),
                        resultado.getString("Tipo_Pago"),
                        resultado.getString("Beneficio_Pago")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar pagos: " + ex.getMessage());
        }        
        return listado;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_Pago) FROM Pagos";
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
    PagosModel pagos = (PagosModel) object;
    
    String sql = "INSERT INTO Pagos (" +
                 "ID_Pago, Tipo_Pago, Beneficio_Pago) VALUES (?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,pagos.getId());
        pst.setString(2, pagos.getTipo());
        pst.setString(3, pagos.getBeneficio());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar tipo de pago: " + ex.getMessage());
        return false;
    }
  }
        
    public boolean update(Object object) {
    PagosModel pagos = (PagosModel) object;

    String sql = "UPDATE Pagos SET " +
                 "Tipo_Pago = ?," +
                 "Beneficio_Pago = ? " +
                 "WHERE ID_Pago = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, pagos.getTipo());
        pst.setString(2, pagos.getBeneficio());
        pst.setInt(3, pagos.getId());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar tipo de pago: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Pagos WHERE ID_Pago = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar tipo de pago: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Pagos WHERE ID_Pago = ?;";
    PagosModel pagos = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            pagos = new PagosModel(
                resultado.getInt("ID_Pago"),
                resultado.getString("Tipo_Pago"),
                resultado.getString("Beneficio_Pago")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar tipo de pago por ID: " + ex.getMessage());
    }

    return pagos;
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
