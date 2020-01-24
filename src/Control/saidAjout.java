package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entities.Etudiant;
import Presentation.AjouterEtudiant;
import Presentation.SaidWindow;

public class saidAjout implements ActionListener {
///////////////////////			
	SaidWindow s;
	Connection cnx;	
	Statement st;	
	ResultSet rs;
	
	public void  connect () {
		String chaine ="jdbc:mysql://localhost:3306/gestionetudiant";
	try {
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("Chargement avec succès");
	} catch (ClassNotFoundException e1) {
	System.out.println("Problème driver");
	e1.printStackTrace();
	}

	try {
	cnx = DriverManager.getConnection(chaine,"root",null);
	System.out.println("Cnx avec succès");
	} catch (SQLException e1) {
	System.out.println("problème de connection");
	e1.printStackTrace();
	}
	}	
	
	/////////////////////
		public void ajout () {
			try {
				st= cnx.createStatement();
				 int i=st.executeUpdate("insert into autodao values('"+s.login.getText()+"','"+s.pw.getText()+"')");
				 System.out.println("Ajout avec succes.....");
				} catch (SQLException e1) {
				System.out.println("problème d'enregistrement");
				e1.printStackTrace();
				}	
			}
		
		
//////////////////
		 AjouterEtudiant ajj;
		public void ajoutAll () {
			try {
				st= cnx.createStatement();
				 int i=st.executeUpdate("insert into etudiantdao values('"+ajj.Nom.getText()+"','"+ajj.Prenom.getText()+"','"+ajj.Cne.getText()+"','"+ajj.Note.getText()+"')");
				 System.out.println("Ajout avec succes.....");
				} catch (SQLException e1) {
				System.out.println("problème d'enregistrement");
				e1.printStackTrace();
				}	
			}
		
////////////////		

		public saidAjout(SaidWindow f) {
				s=f;
				connect();
			}
		public saidAjout(AjouterEtudiant f) {
			ajj=f;
			connect();
		}
	

		//////////////////	
		public void actionPerformed(ActionEvent e) {
			ajoutAll(); 
		} 
		

}
