package Entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



import Presentation.SaidWindow;

public class Authentification implements ActionListener {
	Connection cnx;	
	Statement st;	
	ResultSet rs;
	SaidWindow s ;


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
	
	/*
public boolean login () {
	
		try {
			st=cnx.createStatement();
			rs= st.executeQuery("select pass from autodao where login ='"+s.login.getText()+"'");
			while (rs.next()) {
				if (rs.getString("pass").equals(s.pw.getText()))
				{System.out.println(".......correct...........");
					return true; }
				else return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return false;	
		}
		return(false);	} 


public void ajoutAuth () {
	try {
		st= cnx.createStatement();
		 int i=st.executeUpdate("insert into autodao values('"+s.login.getText()+"','"+s.pw.getText()+"')");
		 System.out.println("Ajout avec succes.....");
		} catch (SQLException e1) {
		System.out.println("problème d'enregistrement");
		e1.printStackTrace();
		}	
	} 
	
/*public void affichage() {
		
		try {
			st=cnx.createStatement();
			rs=st.executeQuery("select * from autodao");
			while (rs.next()) {
			System.out.println(rs.getString("login")+"	"+rs.getString("pass"));
			} } catch (SQLException e1) {
			System.out.println("problème d'affichage");
			e1.printStackTrace();
			}
	} */



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}