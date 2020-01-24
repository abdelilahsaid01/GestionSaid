package Exception;
import java.util.Scanner;

public class ExceptionEssai {
	
	public static void  methode () throws ExceptionAEgalB {
Scanner sc= new Scanner(System.in);	
while (true) {
System.out.println("Saisir la valeu de a");
int a= sc.nextInt();
System.out.println("Saisir la valeu de b");
int b= sc.nextInt();

		if (a == b)
			throw new ExceptionAEgalB ();
		else
		System.out.println (a+" et "+b+" OK !");
		
		System.out.println("Vous voulez quitter....O/N");
		if(sc.next().equalsIgnoreCase("o"))
		break;
		
		}
	}
}
	
	
