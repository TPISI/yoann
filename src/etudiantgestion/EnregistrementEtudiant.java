
package etudiantgestion;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author AKOMAS
 */
public class EnregistrementEtudiant extends JFrame{
//Les variables
EtudiantGestion eg = new EtudiantGestion();
String path = null;
byte[] userimage = null;
Statement pst;
ResultSet rs;
JLabel lblTitre, lblid, lblnom, lblprenoms, lblgenre, lbllicence, lblfiliere, lblage, image1;
JTextField txtid, txtnom, txtprenoms, txtlicence, txtage;
JComboBox combofiliere, combogenre;
JButton btnenregistrer, btnsupprimer, btntelecharger;
JTable table, table1;
JScrollPane scroll, scroll1;



    
    public EnregistrementEtudiant(){
        //Fenêtre
       super.setTitle("Gestion Des Etudiants");
       super.setSize(800, 450);
       super.setLocationRelativeTo(null); //placer le fenetre au milieu de l'ecran
       super.setResizable(false); //action d'agrandir  la fenêtre (true)
       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //parametrer si on ferme la fenetre elle se ferme completement sans tournée en background
       JPanel pn = new JPanel(); 
       pn.setLayout(null);
       add(pn);
       pn.setBackground(new Color(220, 210, 220)); // ou choisis la couleur avec Color.sa couleur
       
       //partie titre 
      lblTitre = new JLabel("ENREGISTREMENT ETUDIANT");
      lblTitre.setBounds(220, 10, 800, 30);
      lblTitre.setFont(new Font("Time new roman", Font.BOLD, 24));
      lblTitre.setForeground(new Color(64, 64, 64));
      pn.add(lblTitre);//Pour ajouter le texte 
       
      //idEtudiant
      
      lblid = new JLabel("ID Etudiant");
      lblid.setBounds(20, 40, 800,30);
      lblid.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblid.setForeground(new Color(0, 0, 0));
      pn.add(lblid);
      
      txtid = new JTextField();
      txtid.setBounds(200, 60, 150, 30);
      txtid.setFont(new Font("Time new roman", Font.PLAIN, 14));
      
      //NomEtudiant
      
      lblnom = new JLabel("Nom de l'Etudiant");
      lblnom.setBounds(20, 80, 800, 30);
      lblnom.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblnom.setForeground(new Color(0, 0, 0));
      pn.add(lblnom);
      
      txtnom = new JTextField();
      txtnom.setBounds(200, 80, 150, 30);
      txtnom.setFont(new Font("Time new roman", Font.PLAIN, 14));
      
      //Prenom de l'etudiant
      
      lblprenoms = new JLabel("Prénom de l'Etudiant");
      lblprenoms.setBounds(20, 120, 800, 30);
      lblprenoms.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblprenoms.setForeground(new Color(0, 0, 0));
      pn.add(lblprenoms);
      
      txtprenoms = new JTextField();
      txtprenoms.setBounds(200, 60, 150, 30);
      txtprenoms.setFont(new Font("Time new roman", Font.PLAIN, 14));
      
      //genre 
      
      lblgenre = new JLabel("Genre de l'Etudiant");
      lblgenre.setBounds(20, 160, 800, 30);
      lblgenre.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblgenre.setForeground(new Color(0, 0, 0));
      pn.add(lblgenre);
      
      combogenre = new JComboBox();
      combogenre.setBounds(200, 160, 100, 30);
      combogenre.setFont(new Font("Time new roman",Font.PLAIN, 14));
      combogenre.addItem("");
      combogenre.addItem("Masculin");
      combogenre.addItem("Feminin");
      pn.add(combogenre);
      
      //filière
      
      lblfiliere = new JLabel("Filière");
      lblfiliere.setBounds(20, 200, 800, 30);
      lblfiliere.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblfiliere.setForeground(new Color(0, 0, 0));
      pn.add(lblfiliere);
      
      combofiliere= new JComboBox();
      combofiliere.setBounds(200, 200, 100, 30);
      combofiliere.setFont(new Font("Time new roman",Font.PLAIN, 14));
      combofiliere.addItem("");
      combofiliere.addItem("ISTIN");
      combofiliere.addItem("ISEG");
      combofiliere.addItem("ISSG");
      pn.add(combofiliere);
      
      //licence
      
      lbllicence = new JLabel("Licence");
      lbllicence.setBounds(20, 230, 800, 30);
      lbllicence.setFont(new Font("Time new roman", Font.BOLD, 16));
      lbllicence.setForeground(new Color(0, 0, 0));
      pn.add(lbllicence);
      
      txtlicence = new JTextField();
      txtlicence.setBounds(200, 230, 150, 30);
      txtlicence.setFont(new Font("Time new roman", Font.PLAIN, 14));
      
      //age
      
      lblage = new JLabel("Age");
      lblage.setBounds(20, 250, 800, 30);
      lblage.setFont(new Font("Time new roman", Font.BOLD, 16));
      lblage.setForeground(new Color(0, 0, 0));
      pn.add( lblage);
      
      txtage = new JTextField();
      txtage.setBounds(200, 250, 150, 30);
      txtage.setFont(new Font("Time new roman", Font.PLAIN, 14));
      
}

public static void main(String[]args){
    
    EnregistrementEtudiant en = new EnregistrementEtudiant();
    en.setVisible(true);
    
}
}

