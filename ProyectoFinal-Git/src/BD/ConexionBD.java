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
    private static final String Usuario = "Conexion";
    private static final String Password = "Blanca#Manuel";
    
    private static HikariDataSource dataSource;
    
    static{
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(Url);
        config.setUsername(Usuario);
        config.setPassword(Password);
        config.setMaximumPoolSize(10); 
        config.setMinimumIdle(3); 
        config.setIdleTimeout(30000); 
        config.setMaxLifetime(300000); 
        config.setConnectionTimeout(100000);  
        
        dataSource = new HikariDataSource(config);
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
