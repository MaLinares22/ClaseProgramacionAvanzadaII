package controladores;
import java.util.ArrayList;
import java.util.List;
import BD.ConexionBD;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import modelos.ReservasModel;

/**
 *
 * @author MaLinares BlanCosta
 */
public class ReservasDAO {
    public List<ReservasModel> getAll(){
        List<ReservasModel> listado = new ArrayList<>();
        String query = "SELECT * FROM Reservas ORDER BY ID_Reserva ASC;";
        try (Connection con = ConexionBD.ObtenerConexion()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()){
                listado.add(new ReservasModel(
                        resultado.getInt("ID_Reserva"),
                        resultado.getInt("ID_Huesped"),
                        resultado.getInt("ID_Habitacion"),
                        resultado.getString("Tiempo_Reserva"),
                        resultado.getInt("Tipo_Pago"),
                        resultado.getString("Estado_Pago")
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
             PreparedStatement ps = con.prepareStatement("SELECT ID_Huesped FROM Huespedes ORDER BY ID_Huesped ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("ID_Huesped"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public static List<Integer> obtenerIdHabitacion() {
        List<Integer> lista = new ArrayList<>();
        try (Connection con = ConexionBD.ObtenerConexion();
             PreparedStatement ps = con.prepareStatement("SELECT Numero_Habitacion FROM Habitaciones ORDER BY Numero_Habitacion ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("Numero_Habitacion"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public static List<Integer> obtenerPago() {
        List<Integer> lista = new ArrayList<>();
        try (Connection con = ConexionBD.ObtenerConexion();
             PreparedStatement ps = con.prepareStatement("SELECT DISTINCT Tipo_Pago FROM Reservas ORDER BY Tipo_Pago ASC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getInt("Tipo_Pago"));
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
        String sql = "SELECT MAX(ID_Reserva) FROM Reservas";
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
    ReservasModel reserva = (ReservasModel) object;
    
    String sql = "INSERT INTO Reservas (" +
                 "ID_Reserva, ID_Huesped, ID_Habitacion, Tiempo_Reserva, Tipo_Pago, Estado_Pago) VALUES (?, ?, ?, ?, ?, ?);";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,reserva.getIDReserva());
        pst.setInt(2, reserva.getIDHuesped());
        pst.setInt(3, reserva.getIDHabitacion());
        pst.setString(4, reserva.getTiempo());
        pst.setInt(5, reserva.getTipoPago());
        pst.setString(6, reserva.getEstado());
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al insertar reserva: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean update(Object object) {
    ReservasModel reserva = (ReservasModel) object;

    String sql = "UPDATE Reservas SET " +
                 "ID_Huesped = ?, " +
                 "ID_Habitacion = ?, " +
                 "Tiempo_Reserva = ?, " +
                 "Tipo_Pago = ?, " +
                 "Estado_Pago = ? " +
                 "WHERE ID_Reserva = ?;";

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, reserva.getIDHuesped());
        pst.setInt(2, reserva.getIDHabitacion());
        pst.setString(3, reserva.getTiempo());
        pst.setInt(4, reserva.getTipoPago());
        pst.setString(5, reserva.getEstado());
        pst.setInt(6, reserva.getIDReserva());

        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al actualizar reserva: " + ex.getMessage());
        return false;
    }
  }
    
    public boolean delete(int id) {
    String sql = "DELETE FROM Reservas WHERE ID_Reserva = ?;";
    
    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;

    } catch (SQLException ex) {
        System.err.println("Error al eliminar reserva: " + ex.getMessage());
        return false;
    }
 }
    
    public Object getById(int id) {
    String query = "SELECT * FROM Reservas WHERE ID_Reserva = ?;";
    ReservasModel reserva = null;

    try (Connection con = ConexionBD.ObtenerConexion()) {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet resultado = pst.executeQuery();

        if (resultado.next()) {
            reserva = new ReservasModel(
                resultado.getInt("ID_Reserva"),
                resultado.getInt("ID_Huesped"),
                resultado.getInt("ID_Habitacion"),
                resultado.getString("Tiempo_Reserva"),
                resultado.getInt("Tipo_Pago"),
                resultado.getString("Estado_Pago")
            );
        }

    } catch (SQLException ex) {
        System.err.println("Error al buscar reserva por ID: " + ex.getMessage());
    }

    return reserva;
    }
}
