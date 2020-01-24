package Traitement;
import java.util.Scanner;
import java.util.Vector;
import Entities.*;

public class GestionEleve {
	Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	
public 	Vector ajouterEleve()
	{
	System.out.println("Eleve");
	while(true)
	{
		Eleve e = new Eleve();	
		System.out.println("veuillez saisir le nom");
		 	e.nom =sc.next();
		System.out.println("veuillez saisir le prénom");
			e.prenom =sc.next(); 
		System.out.println("veuillez saisir le nom du père");
			e.pere=sc.next();
		System.out.println("veuillez saisir le CNE");
			e.cne =sc.nextInt(); 	
			
		System.out.println("veuillez saisir la  note");
			e.note= sc.nextDouble();
			
			v.add(e); 
			
		System.out.println("Etudaint ajouté avec succés");
		System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
	
	System.out.println(v); 
	System.out.println("Nom => Prénom ==> pere ==> CNE =====> Note");
	for (int i = 0; i < v.size(); i++) {
		Eleve r = new Eleve();
		r = (Eleve)v.get(i);
		
		System.out.println(r.nom + " "+r.prenom+" "+r.pere+" "+r.cne+ " =====> " + r.note);
	}
		
		return v;
	}
public	double calculerMoyenne(Vector <Eleve> v)
	{
	double notMoyen=0;
	for (int i=0;i<v.size();i++) 
		notMoyen= notMoyen+v.get(i).note;
	
	return (notMoyen/v.size());
	
} }


