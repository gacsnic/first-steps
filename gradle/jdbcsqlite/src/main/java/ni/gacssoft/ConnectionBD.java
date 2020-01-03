package ni.gacssoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Establece la conexion con la base de datos y nos devuelve la conexion por el metodo
 * @author gacs
 */
public class ConnectionBD {
    private static ConnectionBD connectionBD=null;    //inilicializamos la clase de conexion 
    private final String strUrl;                      //Almacena la direccion de la base de datos
    private final String strDriver ;                  //Almacena el driver de conexion
    private static Connection conn=null;
    private ConnectionBD() {
    	this.strDriver="org.sqlite.JDBC"; //Driver de conexion
    	strUrl="jdbc:sqlite:var/db/mybd.db"; //Parametros de conexion de conexion
    	setConnection(); //Establece la conexion y la almacena en la propiedad conn
	}
    public static Connection getConnection(){
           if(connectionBD==null)
        	   connectionBD=new ConnectionBD(); 
           return conn;
    }
    /**
     * metodo de conexion con la base de datos
     * Almacena la conexion en la propiedad conn
     */
    private void setConnection() {
        try {
            Class.forName(strDriver);
            conn=DriverManager.getConnection(strUrl);
        }catch(ClassNotFoundException | SQLException e){
               System.err.println(e);
        }		   
  }
    
   /**
   * metodo para cerrar la conexion
   */
   public void close() {
   	try {
            conn.close();
	 }catch( SQLException e){
	    System.err.println(e);
	 }		   
    }
}
