package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares
 */
public class ReservasModel {
    private int ID_Reserva;
    private int ID_Huesped;
    private int ID_Habitacion;
    private String Tiempo_Reserva;
    private int Tipo_Pago;
    private String Estado_Pago;
    
    private static final Logger LOG = Logger.getLogger(EmpleadosModel.class.getName());
    
    public ReservasModel(int ID_Reserva, int ID_Huesped, int ID_Habitacion, String Tiempo_Reserva, int Tipo_Pago, String Estado_Pago) {
        LOG.info("Se Creó un objeto de clase Reservas");
        this.ID_Reserva = ID_Reserva;
        this.ID_Huesped = ID_Huesped;
        this.ID_Habitacion = ID_Habitacion;
        this.Tiempo_Reserva = Tiempo_Reserva;
        this.Tipo_Pago = Tipo_Pago;
        this.Estado_Pago = Estado_Pago;
    }  
    public ReservasModel(){
        
    }
    
     public int getIDReserva() {
        return ID_Reserva;
    }

    public void setIDReserva(int id) {
        this.ID_Reserva = id;
    }
    
     public int getIDHuesped() {
        return ID_Huesped;
    }

    public void setIDHuesped(int id) {
        this.ID_Huesped = id;
    }
    
     public int getIDHabitacion() {
        return ID_Habitacion;
    }

    public void setIDHabitacion(int id) {
        this.ID_Habitacion = id;
    }
    
     public String getTiempo(){
        return Tiempo_Reserva;
    }

    public void setTiempo(String tiempo) {
        this.Tiempo_Reserva = tiempo;
    }
    
     public int getTipoPago() {
        return Tipo_Pago;
    }

    public void setTipoPago(int tipo) {
        this.Tipo_Pago = tipo;
    }
    
     public String getEstado() {
        return Estado_Pago;
    }

    public void setEstado(String estado) {
        this.Estado_Pago = estado;
    }
    
}
