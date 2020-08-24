
package problemaTRES;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MARAUD
 */
public class Conexion {
    public static Connection getConexion(){
        Connection con = null;
        try {     
            con = DriverManager.getConnection("jdbc:sqlserver://MARAUD-RYZEN\\\\SQLEXPRESS;databaseName=problemaTRES","usuarioSQL","1234");  
        }catch (Exception ex){
			System.out.println("Error."+ ex.getMessage());
        } 
        return con;
    }
}
