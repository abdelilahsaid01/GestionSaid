package Presentation;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import Control.SaidExit;
import Control.SaidMousse;
import Control.SaidMousse2;
import Control.SaidOk;
import Control.SaidSupp;
import Control.saidAjout;
import Entities.Authentification;

public class SaidWindow extends JFrame { //Jframe est une classe qui contient des sous classe
	
	private static final long serialVersionUID = 1L;
	public int a =1 ;
	public JLabel msg = new JLabel();
	public JTextField login = new JTextField("Tape your Login");
	public JTextField pw = new JTextField("Tape your password");
	public JButton ok= new JButton ("ok");
	public JButton exit= new JButton ("exit");
	public JButton aj= new JButton ("Ajouter");
	public JButton supp= new JButton ("supprimer");

	public SaidWindow () {
		
		
		setTitle("My First Fenetre"); //afficher le titre de la page
		setBounds(200,200,650,400); //définir les dimensions de la page

		//JButton ok= new JButton ("ok"); //botton simple
		//JButton aj= new JButton ("Ajouter"); //botton simple

		//JButton supp= new JButton ("supprimer");

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
		
		//////////
		ImageIcon imm = new ImageIcon("C:\\Users\\SAID\\Desktop\\GestionEtudiant\\src\\Image\\zdd.png"); // load the image to a imageIcon
		Image image = imm.getImage().getScaledInstance(50, 30,  java.awt.Image.SCALE_SMOOTH); ; // transform it 
		imm = new ImageIcon(image);  // transform it back
		ok = new JButton(imm);
		/////////////
		/////////////
		ImageIcon im = new ImageIcon("C:\\Users\\SAID\\Desktop\\GestionEtudiant\\src\\Image\\index.jpg"); // load the image to a imageIcon
		Image imagee = im.getImage().getScaledInstance(50, 30,  java.awt.Image.SCALE_SMOOTH); ; // transform it 
		im = new ImageIcon(imagee);  // transform it back
		aj = new JButton(im);
		////////////
		 /////////////
		ImageIcon ee = new ImageIcon("C:\\Users\\SAID\\Desktop\\GestionEtudiant\\src\\Image\\delete.png"); // load the image to a imageIcon
		Image imageee = ee.getImage().getScaledInstance(50, 30,  java.awt.Image.SCALE_SMOOTH); ; // transform it 
		ee = new ImageIcon(imageee);  // transform it back
		supp = new JButton(ee);
		////////////
		 /////////////
		ImageIcon eez = new ImageIcon("C:\\Users\\SAID\\Desktop\\GestionEtudiant\\src\\Image\\exit.jpg"); // load the image to a imageIcon
		Image imag = eez.getImage().getScaledInstance(50, 30,  java.awt.Image.SCALE_SMOOTH); ; // transform it 
		eez = new ImageIcon(imag);  // transform it back
		exit = new JButton(eez);
		////////////
		
		ok.setBounds(50, 200, 50, 30);
		aj.setBounds(200, 200, 50, 30);
		supp.setBounds(360, 200, 50, 30);
		exit.setBounds(520, 200, 50, 30);
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
		p.add(supp);
		p.add(f);
		p.add(h);
		p.add(msg);
		p.add(aj);
		p.add(exit);
		p.add(bx);		
		p.setBackground(Color.LIGHT_GRAY);
		login.setBackground(Color.WHITE);

		
		ok.addActionListener(new SaidOk (this));//afficher un message lors du click
		aj.addActionListener(new saidAjout(this));
		supp.addActionListener(new SaidSupp(this));
		exit.addActionListener(new SaidExit());
		
		login.addMouseListener(new SaidMousse(this));
		pw.addMouseListener(new SaidMousse2 (this));

		
		
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
