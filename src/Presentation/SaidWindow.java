package Presentation;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Control.Click;

public class SaidWindow extends JFrame { //Jframe est une classe qui contient des sous classe
	
	private static final long serialVersionUID = 1L;
	
	public JLabel msg = new JLabel();
	public JTextField login = new JTextField();
	public JTextField pw = new JTextField();

	public SaidWindow () {
		
		
		setTitle("My First Fenetre"); //afficher le titre de la page
		setBounds(200,200,600,400); //définir les dimensions de la page

		JButton ok= new JButton ("ok"); //botton simple
		JButton annuler= new JButton ("annuler");

		JLabel lab1 = new JLabel("Login");	//message écrit par défaut
		JLabel lab2 = new JLabel("Mot de passe");



	/*	JTextField login = new JTextField(); //permet décrire un texte dans la case convenable
		JTextField pw = new JTextField(); */
		
		JCheckBox bx = new JCheckBox("RememberMe");	//permet de faire un coche
		//bx.setSelected(false);
		bx.setBounds(50, 280, 110, 30); //(x,y,longueur, largeur)

		
		JRadioButton f= new JRadioButton("femme"); //un botton radio similaire à un botton sous forme d'un cercle
		JRadioButton h= new JRadioButton("hommee");
		f.setBounds(50, 250, 100, 30);
		h.setBounds(150, 250, 100, 30);
		ButtonGroup b= new ButtonGroup();
		b.add(h);
		b.add(f);
		
		getContentPane().setLayout(null); //permet d'allumer la glasse (page recouverte)
		JPanel p = new JPanel(); 
		p= (JPanel) getContentPane(); //le panel dans lequel les botton s'affichents
		ok.setBounds(50, 200, 100, 30);
		annuler.setBounds(200, 200, 100, 30);
		lab1.setBounds(50, 50, 100, 30);
		login.setBounds(200, 50, 100, 30);
		lab2.setBounds(50, 100, 100, 30);
		pw.setBounds(200, 100, 100, 30);
		msg.setBounds(310, 50, 100, 30);

			
		p.add(lab1);
		p.add(login);
		p.add(lab2);
		p.add(pw);
		p.add(ok);
		p.add(annuler);
		p.add(f);
		p.add(h);
		p.add(bx);
		p.add(msg);
		
		ok.addActionListener(new Click(this)); //afficher un message lors du click
		
		// déclaration de menu et sous-menu
		JMenuBar menuBar = new JMenuBar();
		
		JMenu test1 = new JMenu("Fichier");
		JMenu test2 = new JMenu("Help");
		JMenu test3 = new JMenu("Autres");

		
		JMenuItem item1 = new JMenuItem("Ouvrir");
		JMenuItem item2= new JMenuItem("Online help");
		JMenuItem item3 = new JMenuItem("Ajouter");
		JMenuItem item4 = new JMenuItem("Supp");

		
		test1.add(item1);
		test2.add(item2);
		test3.add(item3);
		test3.add(item4);
		test1.add(test3);

		
		menuBar.add(test1);
		menuBar.add(test2);
		
		setJMenuBar(menuBar); //pour afficher le menu
		setVisible(true); //la page est automatiquement s'affiche
		setResizable(false); //éviter d'agandir la page
	}
}
