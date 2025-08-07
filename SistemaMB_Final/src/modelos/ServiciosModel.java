package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares BlanCosta
 */
public class ServiciosModel {
    private int ID_Servicio;
    private String Servicio;
    private String Descripcion;
    private String Precio;
    private String Duracion;
    
    private static final Logger LOG = Logger.getLogger(ServiciosModel.class.getName());
    
    public ServiciosModel(int ID_Servicio, String Servicio, String Descripcion, String Precio, String Duracion) {
        LOG.info("Se Creó un objeto de clase servicios");
        this.ID_Servicio = ID_Servicio;
        this.Servicio = Servicio;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Duracion = Duracion;
    }  
    
    public ServiciosModel(){
        
    }
    
    public int getId() {
        return ID_Servicio;
    }

    public void setId(int id) {
        this.ID_Servicio = id;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        this.Servicio = servicio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        this.Precio = precio;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String duracion) {
        this.Duracion = duracion;
    }
}
