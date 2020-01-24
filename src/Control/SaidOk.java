package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entities.Authentification;
import Presentation.AjouterEtudiant;
import Presentation.SaidWindow;

public class SaidOk implements ActionListener {
//////////////////////	
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
////////////////////////

public boolean login () {

	try {
		st=cnx.createStatement();
		rs= st.executeQuery("select pass from autodao where login ='"+s.login.getText()+"'");
		if (rs.next()) {
			if (rs.getString("pass").equals(s.pw.getText()))
			{ s.msg.setText("Succes");
			s.msg.setForeground(Color.GREEN);
				System.out.println(".......correct...........");
				AjouterEtudiant ee= new AjouterEtudiant();
				}
			else {
				s.msg.setForeground(Color.BLUE);
			s.msg.setText("Pass incorrect");
				 }
		}
		else {
			s.msg.setForeground(Color.RED);
			s.msg.setText("Login not found");
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
	return false; }


///////////////////////////

 public SaidOk(SaidWindow f) {
	s=f;
	connect();
}


public void actionPerformed(ActionEvent e) {
	login();
} 

}
