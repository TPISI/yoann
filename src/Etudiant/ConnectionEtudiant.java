
package Etudiant;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AKOMAS
 */
public class ConnectionEtudiant {
    Connection cn;
    
    public ConnectionEtudiant() {
        
        try {
            Class.forName("com.mysql.jbdc.Driver");
            cn = (Connection) DriverManager.getConnection("jbdc:mysql://localhost/etudiant","root","");
            System.out.println("Connection Etablie");
        }catch (Exception e) {
            System.out.println("Erreur de connection");
            e.printStackTrace();
        }
        
        
        
      
    }
    public ConnectionEtudiant maConnection(){
          return (ConnectionEtudiant) cn;
      }
}
    

