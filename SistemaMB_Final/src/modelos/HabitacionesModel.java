package modelos;
import java.util.Objects;
import java.util.logging.Logger;
/**
 *
 * @author MaLinares BlanCosta
 */
public class HabitacionesModel {
    private int Numero_Habitacion;
    private String ID_Habitacion;
    private String Tipo_Habitacion;
    private String Precio;
    private String Estado_Habitacion;
    
    private static final Logger LOG = Logger.getLogger(HabitacionesModel.class.getName());
    
    public HabitacionesModel(int Numero_Habitacion, String ID_Habitacion,String Tipo_Habitacion, String Precio, String Estado_Habitacion) {
        LOG.info("Se Creó un objeto de clase Habitaciones");
        this.Numero_Habitacion = Numero_Habitacion;
        this.ID_Habitacion = ID_Habitacion;
        this.Tipo_Habitacion = Tipo_Habitacion;
        this.Precio = Precio;
        this.Estado_Habitacion = Estado_Habitacion;
    }
    
    public HabitacionesModel(){
        
    }
    
    public int getNum() {
        return Numero_Habitacion;
    }

    public void setNum(int Num) {
        this.Numero_Habitacion = Num;
    }

    public String getId() {
        return ID_Habitacion;
    }

    public void setId(String ID) {
        this.ID_Habitacion = ID;
    }

    public String getTipo() {
        return Tipo_Habitacion;
    }
    
    public void setTipo(String Tipo){
        this.Tipo_Habitacion = Tipo;
    }
    
    public String getPrecio(){
        return Precio;
    }
    
    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    public String getEstado() {
        return Estado_Habitacion;
    }
    
    public void setEstado(String Estado) {
        this.Estado_Habitacion = Estado;
    }
}
