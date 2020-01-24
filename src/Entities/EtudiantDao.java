package Entities;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entities.*;
import Traitement.*;

public class EtudiantDao {
	
	Connection cnx;	// Cr�er une connection cnx (lien) vers une base de donn�e
	Statement st;	// Pour envoyer et ex�cuter des requutes sql
	ResultSet rs;	// R�cup�ration des r�sultats
	Scanner sc= new Scanner(System.in);

	public EtudiantDao() {
String chaine ="jdbc:mysql://localhost:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.jdbc.Driver"); // com du fichier local exemple c/program/..
			System.out.println("Chargement avec succ�s");
		} catch (ClassNotFoundException e1) {
		System.out.println("Probl�me driver");
		e1.printStackTrace();
		}
		
		try {
		cnx = DriverManager.getConnection(chaine,"root",null);
		System.out.println("Cnx avec succ�s");
		} catch (SQLException e1) {
		System.out.println("probl�me de connection");
		e1.printStackTrace();
		}
	}
	
	
	public void ajoutEtudiant(Etudiant e) {
		try {
			st= cnx.createStatement();
			// int i=st.executeUpdate("insert into etudiantdao values('saidd','abdoo',11549,16)");
			 int i=st.executeUpdate("insert into etudiantdao values('"+e.nom+"','"+e.prenom+"','"+e.cne+"','"+e.note+"')");
			} catch (SQLException e1) {
			System.out.println("probl�me d'enregistrement");
			e1.printStackTrace();
			}	
		}
	
	
	public void modifiContenu() {
		int code;
		double notej;
		System.out.println("Veuillez saisir le code de l'�tudiant");
		code=sc.nextInt();
		System.out.println("Veuillez saisir la nouvelle note");
		notej=sc.nextDouble();

		try {
			st=cnx.createStatement();
			int i=st.executeUpdate("update etudiantdao set note = "+notej+"where cne="+code);
			System.out.println("modification succ�s");
			} catch (SQLException e1) {
			System.out.println("probl�me de modification");
			e1.printStackTrace();
			}
		}
	
	
	public void supprimerContenu()
	{
		int code;
		System.out.println("Veuillez saisir le cne de l'�tudiant");
		code=sc.nextInt();
		try {
			st=cnx.createStatement();
			int i=st.executeUpdate("delete  from etudiantdao where cne="+code);
			System.out.println("modification succ�s");
			} catch (SQLException e1) {
			System.out.println("probl�me de modification");
			e1.printStackTrace();
			}
		}
	
	public void affichage() {
		
		try {
			st=cnx.createStatement();
			rs=st.executeQuery("select * from etudiantdao");
			while (rs.next()) {
			System.out.println(rs.getString("nom")+"/t"+rs.getString("prenom")+"/t"+rs.getInt("cne")+"/t"+rs.getInt("note"));
			} } catch (SQLException e1) {
			System.out.println("probl�me d'affichage");
			e1.printStackTrace();
			}
	}
	
	
	}

	
