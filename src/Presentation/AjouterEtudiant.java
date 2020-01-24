package Presentation;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.SaidSupp;
import Control.SaidSupp2;
import Control.saidAjout;

public class AjouterEtudiant extends JFrame {
	
	public JLabel nom = new JLabel("Nom");
	public JTextField Nom = new JTextField();
	public JLabel prenom = new JLabel("Prenom");
	public JTextField Prenom = new JTextField();
	public JLabel cne = new JLabel("Cne");
	public JTextField Cne = new JTextField();
	public JLabel note= new JLabel("Note");
	public JTextField Note = new JTextField();
	public JButton ajouter= new JButton ("Ajouter");	
	public JButton supp= new JButton ("Supprimer");	

	public  AjouterEtudiant () {
		setTitle("My First Fenetre"); 
		getContentPane().setLayout(null); 
		JPanel p = new JPanel(); 
		p= (JPanel) getContentPane();
		
		
		ajouter.addActionListener(new saidAjout(this));
		supp.addActionListener(new SaidSupp2 (this));

		
		p.add(nom);
		p.add(Nom);
		p.add(prenom);
		p.add(Prenom);
		p.add(cne);
		p.add(Cne);
		p.add(note);
		p.add(Note);
		p.add(ajouter);
		p.add(supp);


///////////
		nom.setBounds(50, 50, 100, 30);
		Nom.setBounds(200, 50, 200, 30);
		prenom.setBounds(50, 100, 100, 30);
		Prenom.setBounds(200, 100, 200, 30);
		cne.setBounds(50, 150, 100, 30);
		Cne.setBounds(200, 150, 200, 30);
		note.setBounds(50, 200, 100, 30);
		Note.setBounds(200, 200, 200, 30);
		ajouter.setBounds(50, 280, 100, 30);
		supp.setBounds(200, 280, 100, 30);

		setBounds(200,200,600,400);
		//////////////
		setVisible(true); 
		setResizable(false); 
	}

}
