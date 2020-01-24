package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Presentation.AjouterEtudiant;
import Presentation.SaidWindow;

public class SaidSupp implements ActionListener {
	
	////////////////
	
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
	
///////////////////	
	
	public void supprimerContenu()
	{
			try {
			st=cnx.createStatement();
			int i=st.executeUpdate("delete  from autodao where pass="+s.pw.getText());
			System.out.println("modification succès");
			} catch (SQLException e1) {
			System.out.println("problème de modification");
			e1.printStackTrace();
			}
		}
/////////////////////////

	
	public SaidSupp(SaidWindow f) {
		s=f;
		connect();
		
	}
	



public void actionPerformed(ActionEvent e) {
	supprimerContenu();
} 		



	
}
