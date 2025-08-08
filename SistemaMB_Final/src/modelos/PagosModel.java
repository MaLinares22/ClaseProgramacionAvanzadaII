package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares BlanCosta
 */
public class PagosModel {
    private int ID_Pago;
    private String Tipo_Pago;
    private String Beneficio_Pago;
    
    private static final Logger LOG = Logger.getLogger(PagosModel.class.getName());
    
    
    public PagosModel(int ID_Pago, String Tipo_Pago, String Beneficio_Pago) {
        LOG.info("Se Creó un objeto de clase pagos");
        this.ID_Pago = ID_Pago;
        this.Tipo_Pago = Tipo_Pago;
        this.Beneficio_Pago = Beneficio_Pago;
    }  
    
    public PagosModel(){
        
    }
    
    public int getId() {
        return ID_Pago;
    }

    public void setId(int id) {
        this.ID_Pago = id;
    }

    public String getTipo() {
        return Tipo_Pago;
    }

    public void setTipo(String tipo) {
        this.Tipo_Pago = tipo;
    }

    public String getBeneficio() {
        return Beneficio_Pago;
    }

    public void setBeneficio(String beneficio) {
        this.Beneficio_Pago = beneficio;
    } 
}
