package Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;

public class ExempleFile {
	public static void main(String[] args) throws IOException { 
		// creation d'un fichier ou un dossier
	/*	File monFichier = new File("c:/note/Note.text");
		monFichier.createNewFile(); //créer un fichier
		System.out.println(monFichier.exists());
		File f=monFichier.getParentFile();
		System.out.println(f.toString()); 	*/
		////////////
		
		//////////// créer un dossier
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter le nom de dossier");
		String a=sc.next();
		System.out.println("Enter le chemin");
		String b=sc.next();
		File monFichier = new File(b+a);
		monFichier.mkdir(); 
		// monFichier.delete();
		System.out.println("Le dossier est bien crée"); 	*/
		///////////
		
	/*private static void listeFichier (File dir){ //fonction d'affiche du conteu de dossier
		if (dir.isDirectory () == true){
			String fichiers [ ] = dir.list () ;
			System.out.println(dir.getAbsolutePath()+":");
			for (int i = 0 ; i != fichiers.length ; i++) {
				System.out.println("\t"+fichiers[i]);		
			}	
		}  else{   System.err.println (dir + " n'est pas un repertoire") ; }
	}
	static public void main (String args [ ]) { 
	File f=new File("C:\\note");	
	listeFichier(f); */
		
		///// écrir sur un text sur un fichier 
		/* String Chaine = "Bonjour  les GE te les GI" ;
		try {
		FileOutputStream f = new FileOutputStream ("c:/note/Note.text") ;
			f.write (Chaine.getBytes ()) ;
			f.close () ;
		} catch (IOException e)
		{
			System.err.println ("Erreur ecriture") ;
		} */
		
		////////// lire le contenu
	/*	try {
			InputStream s = new FileInputStream ("c:/note/Note.text") ;
				byte buffer [ ] = new byte [s.available()] ;
				s.read (buffer) ;
				for (int i = 0 ; i != buffer.length ; i++)
					System.out.print ( (char) buffer [i]) ;
				s.close () ;
			} catch (IOException e)
			{
				System.err.println ("Erreur lecture") ;
			} */
	}}
	

