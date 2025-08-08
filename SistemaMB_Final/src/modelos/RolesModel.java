package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares BlanCosta
 */
public class RolesModel {
    private int ID_Rol;
    private String Descripcion_Rol;
    
     private static final Logger LOG = Logger.getLogger(RolesModel.class.getName());
     
     public RolesModel(int ID_Rol, String Descripcion_Rol) {
        LOG.info("Se Creó un objeto de clase Roles");
        this.ID_Rol = ID_Rol;
        this.Descripcion_Rol = Descripcion_Rol;
    }
     
     public RolesModel(){
         
     }
     
     public int getId() {
        return ID_Rol;
    }

    public void setId(int id) {
        this.ID_Rol = id;
    }

    public String getDescripcion() {
        return Descripcion_Rol;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion_Rol = descripcion;
    }
}
