package Entities;
import java.util.Scanner;

//final public class ClassAbstract { //On peut pas h�riter � partir de cette methode

 abstract public class ClassAbstract { //ne s'ex�cute pas. Juste pour l'organisation
	 String nom;
	 String prenom;
	 int cne;
	 Scanner sc= new Scanner(System.in);
	
	public void Figure ()
	{
		String nom;
		System.out.println("Entrer le nom");
		nom=sc.next();
		this.nom=nom;
	}
}
