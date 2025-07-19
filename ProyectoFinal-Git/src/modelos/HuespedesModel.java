package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares
 */
public class HuespedesModel {
    private int ID_Huesped;
    private String Nombre_Huesped;
    private String Apellido_Huesped;
    private String Correo_Huesped;
    private String DNI_Huesped;
    private String Telefono_Huesped;
    
    private static final Logger LOG = Logger.getLogger(HuespedesModel.class.getName());
    
    public HuespedesModel(int ID_Huesped, String Nombre_Huesped, String Apellido_Huesped, String Correo_Huesped, String DNI_Huesped, String Telefono_Huesped) {
        LOG.info("Se Creó un objeto de clase Huesped");
        this.ID_Huesped = ID_Huesped;
        this.Nombre_Huesped = Nombre_Huesped;
        this.Apellido_Huesped = Apellido_Huesped;
        this.Correo_Huesped = Correo_Huesped;
        this.DNI_Huesped = DNI_Huesped;
        this.Telefono_Huesped = Telefono_Huesped;
    }  
    
    public HuespedesModel(){
        
    }
    
    public int getId() {
        return ID_Huesped;
    }

    public void setId(int id) {
        this.ID_Huesped = id;
    }

    public String getNombre() {
        return Nombre_Huesped;
    }

    public void setNombre(String nombre) {
        this.Nombre_Huesped = nombre;
    }

    public String getApellido() {
        return Apellido_Huesped;
    }

    public void setApellido(String apellido) {
        this.Apellido_Huesped = apellido;
    }

    public String getCorreo() {
        return Correo_Huesped;
    }

    public void setCorreo(String correo) {
        this.Correo_Huesped = correo;
    }
    
    public String getDNI() {
        return DNI_Huesped;
    }

    public void setDNI(String dni) {
        this.DNI_Huesped = dni;
    }
    
    public String getTelefono() {
        return Telefono_Huesped;
    }

    public void setTelefono(String telefono) {
        this.Telefono_Huesped = telefono;
    }
    
    
}
