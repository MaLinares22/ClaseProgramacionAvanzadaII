package BD;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author MaLinares BlanCosta
 */
public class ConexionBD {
    private static final String Url = "jdbc:mysql://localhost:3306/sistemahoteleromb";
    private static String Usuario;
    private static String Password;
    private static HikariDataSource dataSource;
    
     public static void setCredenciales(String user, String pass) {
        Usuario = user;
        Password = pass;
    }
    
    public static boolean inicializarConexion() {
        try {
            if (dataSource != null && !dataSource.isClosed()) {
                dataSource.close();
            }

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(Url);
            config.setUsername(Usuario);
            config.setPassword(Password);
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(3);
            config.setIdleTimeout(30000);
            config.setMaxLifetime(300000);
            config.setConnectionTimeout(10000);

            dataSource = new HikariDataSource(config);

            dataSource.getConnection().close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            dataSource = null;
            return false;
        }
    }
    
    public static Connection ObtenerConexion() throws SQLException{
        return dataSource.getConnection();
    }

    
    public static void CerrarConexion() {
        if(dataSource != null){
            dataSource.close();
        }
    }
}