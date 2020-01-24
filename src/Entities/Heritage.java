package Entities;

import java.util.Scanner;

public class Heritage extends ClassAbstract { //C'est une classe fille qui hérite à partir de la classe mère (ClassAbstract
	 Scanner sc= new Scanner(System.in);
	 private String competition;
	 private int classement,record,single,mixte;
	 
	 public void tennis ( int single, int mixte) {
			System.out.println("Entrer votre classement");
			classement=sc.nextInt();
			this.record=single;
	 }
}
