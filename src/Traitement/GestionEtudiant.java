package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;

public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector(); //déclarer un variable de type vecteur
	EtudiantDao dao=new EtudiantDao();
	
	public void choix () {
		System.out.println("1: AjouterEtudiant	2: ModifierEtudiant	3:supprimerContenu 4:afficher ");

		while(true) {
		int i=sc.nextInt();
		if(i==1) 
			ajouterEtudiant();
		if (i==2)
			dao.modifiContenu();
		if (i==3)
			dao.supprimerContenu();
		if (i==4)
			dao.affichage();
		System.out.println("Quitter O/N");
		if(sc.next().equalsIgnoreCase("o"))
			break;
		}
	}
	
	
	public 	Vector ajouterEtudiant(){
System.out.println("Eleve");
	
	while(true)
	{
		Etudiant e = new Etudiant();	// L'objet 'e' perrmet de stocker le nom,prénom.... pour chaque étudiant
		System.out.println("veuillez saisir le nom");
		 	e.nom =sc.next();
		System.out.println("veuillez saisir le prénom");
			e.prenom =sc.next(); 
			System.out.println("veuillez saisir le CNE");
			e.cne =sc.nextInt(); 	
		System.out.println("veuillez saisir la  note");
			e.note= sc.nextDouble();
			
			v.add(e); // stocker tous les valeurs dans une couleur avec une adresse unique
			dao.ajoutEtudiant(e);
			
		System.out.println("Etudaint ajouté avec succés");
		System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
	
	System.out.println(v); // Maintenant je stock des variables pas de prémitifs valeur. Pour cela il va afficher leurs adresses uniquement
	// afficher les adresses de chaque étudiant. Dans chaque étération une nouvelle adresse affichée
	System.out.println("Nom => Prénom ==> CNE =====> Note");
	for (int i = 0; i < v.size(); i++) {
		Etudiant r = new Etudiant(); // soit r ou bien e c'est la meme chose
		r = (Etudiant)v.get(i); // pour chaque i chaque adresse il existe le nom,prenom....
		
		System.out.println(r.nom + " "+r.prenom+" "+r.cne+ " =====> " + r.note);
	}
		
		return v;
	}
public	double calculerMoyenne(Vector <Etudiant> v)
	{
	double notMoyen=0;
	for (int i=0;i<v.size();i++) 
		notMoyen= notMoyen+v.get(i).note;
	
	return (notMoyen/v.size());
	
} }
