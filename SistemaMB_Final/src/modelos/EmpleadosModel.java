package modelos;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author MaLinares BlanCosta
 */
public class EmpleadosModel {
    private int Id_Empleado;
    private String Nombre_Empleado;
    private String Apellido_Empleado;
    private String Fecha_Entrada;
    private String Numero_Empleado;
    private String Correo_Empleado;
    private String DNI_Empleado;
    private String Sueldo;
    private String Rol_Empleado;
    private String Hora_Entrada;
    private String Hora_Salida;
    
    private static final Logger LOG = Logger.getLogger(EmpleadosModel.class.getName());
    
    public EmpleadosModel(int Id_Empleado, String Nombre_Empleado, String Apellido_Empleado, String Fecha_Entrada, String Numero_Empleado, String Correo_Empleado, String DNI_Empleado, String Sueldo, String Rol_Empleado, String Hora_Entrada, String Hora_Salida) {
        LOG.info("Se Creó un objeto de clase Empleados");
        this.Id_Empleado = Id_Empleado;
        this.Nombre_Empleado = Nombre_Empleado;
        this.Apellido_Empleado = Apellido_Empleado;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Numero_Empleado = Numero_Empleado;
        this.Correo_Empleado = Correo_Empleado;
        this.DNI_Empleado = DNI_Empleado;
        this.Sueldo = Sueldo;
        this.Rol_Empleado = Rol_Empleado;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
    }  
    public EmpleadosModel(){
        
    }
    
    public int getId() {
        return Id_Empleado;
    }

    public void setId(int id) {
        this.Id_Empleado = id;
    }

    public String getNombre() {
        return Nombre_Empleado;
    }

    public void setNombre(String nombre) {
        this.Nombre_Empleado = nombre;
    }

    public String getApellido() {
        return Apellido_Empleado;
    }

    public void setApellido(String apellido) {
        this.Apellido_Empleado = apellido;
    }

    public String getFechaEntrada() {
        return Fecha_Entrada;
    }

    public void setFechaEntrada(String fecha) {
        this.Fecha_Entrada = fecha;
    }

    public String getNumeroEmpleado() {
        return Numero_Empleado;
    }

    public void setNumeroEmpleado(String numero) {
        this.Numero_Empleado = numero;
    }

    public String getCorreo() {
        return Correo_Empleado;
    }

    public void setCorreo(String correo) {
        this.Correo_Empleado = correo;
    }

    public String getDni() {
        return DNI_Empleado;
    }

    public void setDni(String dni) {
        this.DNI_Empleado = dni;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String sueldo) {
        this.Sueldo = sueldo;
    }

    public String getRol() {
        return Rol_Empleado;
    }

    public void setRol(String rol) {
        this.Rol_Empleado = rol;
    }

    public String getHoraEntrada() {
        return Hora_Entrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.Hora_Entrada = horaEntrada;
    }

    public String getHoraSalida() {
        return Hora_Salida;
    }

    public void setHoraSalida(String horaSalida) {
        this.Hora_Salida = horaSalida;
    }    
}
