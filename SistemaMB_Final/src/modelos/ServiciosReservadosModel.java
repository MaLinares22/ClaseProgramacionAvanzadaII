package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares BlanCosta
 */
public class ServiciosReservadosModel {
    private int ID_ReservaSer;
    private int ID_Huesped;
    private int ID_Servicio;
    private String FechaReservaSer;
    
     private static final Logger LOG = Logger.getLogger(ServiciosReservadosModel.class.getName());
     
     public ServiciosReservadosModel(int ID_ReservaSer, int ID_Huesped, int ID_Servicio, String FechaReservaSer) {
        LOG.info("Se Creó un objeto de clase Reservas");
        this.ID_ReservaSer = ID_ReservaSer;
        this.ID_Huesped = ID_Huesped;
        this.ID_Servicio = ID_Servicio;
        this.FechaReservaSer = FechaReservaSer;
    }
     
     public ServiciosReservadosModel(){
         
     }
     
      public int getIDReservaSer() {
        return ID_ReservaSer;
    }

    public void setIDReservaSer(int reservaser) {
        this.ID_ReservaSer = reservaser;
    }
    
     public int getIDHuesped() {
        return ID_Huesped;
    }

    public void setIDHuesped(int id) {
        this.ID_Huesped = id;
    }
    
     public int getIDServicio() {
        return ID_Servicio;
    }

    public void setIDServicio(int id) {
        this.ID_Servicio = id;
    }
    
     public String getFecha(){
        return FechaReservaSer;
    }

    public void setFecha(String fecha) {
        this.FechaReservaSer = fecha;
    }
}
