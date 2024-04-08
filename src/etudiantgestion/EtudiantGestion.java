
package etudiantgestion;

import java.sql.*;

/**
 *
 * @author AKOMAS
 */
public class EtudiantGestion {
    Connection cn;
    
    public EtudiantGestion() {
        
        try {
            Class.forName("com.mysql.jbdc.Driver");
            cn = (Connection) DriverManager.getConnection("jbdc:mysql://localhost/etudiant","root","");
            System.out.println("Connection Etablie");
        }catch (Exception e) {
            System.out.println("Erreur de connection");
            e.printStackTrace();
        }
        
        
        
      
    }
    public EtudiantGestion maConnection(){
          return (EtudiantGestion) cn;
      }
}

