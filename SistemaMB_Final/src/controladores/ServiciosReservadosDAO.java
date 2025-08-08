package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.ServiciosReservadosModel;

/**
 *
 * @author MaLinares BlanCosta
 */
public class ServiciosReservadosDAO {
    public List<ServiciosReservadosModel> getAll(){
        List<ServiciosReservadosModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Reservas_Servicios ORDER BY ID_ReservaSer ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new ServiciosReservadosModel(
                        resultado.getInt("ID_ReservaSer"),
                        resultado.getInt("ID_Huesped"),
                        resultado.getInt("ID_Servicio"),
                        resultado.getString("Fecha_ReservaSer")
                ));
            }        
        }catch(SQLException ex){
            System.err.println("Error al listar reserva: " + ex.getMessage());
        }        
        return listado;
    }
    
    public static List<Integer> obtenerIDHuesped() {
        List<Integer> lista = new ArrayList<>();
        try (Connection con = ConexionBD.ObtenerConexion();
             PreparedStatement ps = con.prepareStatement("SELECT DISTINCT ID_Huesped FROM Reservas_Servicios ORDER BY ID_Huesped ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("ID_Huesped"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public static List<Integer> obtenerIdServicio() {
        List<Integer> lista = new ArrayList<>();
        try (Connection con = ConexionBD.ObtenerConexion();
             PreparedStatement ps = con.prepareStatement("SELECT DISTINCT ID_Servicio FROM Reservas_Servicios ORDER BY ID_Servicio ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("ID_Servicio"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public int SiguienteID() {
    int idDisponible = 1;
    try {
        Connection conn = ConexionBD.ObtenerConexion(); 
        String sql = "SELECT MAX(ID_ReservaSer) FROM Reservas_Servicios";
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
    ServiciosReservadosModel reserva = (ServiciosReservadosModel) object;
    
    String sql = "INSERT INTO Reservas_Servicios (" +
                 "ID_ReservaSer, ID_Huesped, ID_Servicio, Fecha_ReservaSer) VALUES (?, ?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,reserva.getIDReservaSer());
        pst.setInt(2, reserva.getIDHuesped());
        pst.setInt(3, reserva.getIDServicio());
        pst.setString(4, reserva.getFecha());
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar reserva: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean update(Object object) {
    ServiciosReservadosModel reserva = (ServiciosReservadosModel) object;

    String sql = "UPDATE Reservas_Servicios SET " +
                 "ID_Huesped = ?, " +
                 "ID_Servicio = ?, " +
                 "Fecha_ReservaSer = ? " +
                 "WHERE ID_ReservaSer = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, reserva.getIDHuesped());
        pst.setInt(2, reserva.getIDServicio());
        pst.setString(3, reserva.getFecha());
        pst.setInt(4, reserva.getIDReservaSer());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar reserva: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Reservas_Servicios WHERE ID_ReservaSer = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Reservas_Servicios WHERE ID_ReservaSer = ?;";
    ServiciosReservadosModel reserva = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            reserva = new ServiciosReservadosModel(
                resultado.getInt("ID_ReservaSer"),
                resultado.getInt("ID_Huesped"),
                resultado.getInt("ID_Servicio"),
                resultado.getString("Fecha_ReservaSer")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar reserva por ID: " + ex.getMessage());
    }

    return reserva;
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
