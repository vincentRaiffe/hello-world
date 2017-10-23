package caract;

import java.util.Scanner;

public class Caracteristiques {
	
	// Declaration des constantes
	
	// Questions
	private static final String QuestionNOM = "Merci d'indiquer votre nom (nombre de caracteres compris entre 1 et 20) : ";
	private static final String QuestionPRENOM = "Merci d'indiquer votre prenom (nombre de caracteres compris entre 1 et 15) : ";
	private static final String QuestionAGE = "Merci d'indiquer votre age (entier compris entre 0 et 120) : ";
	private static final String QuestionTAILLE = "Merci d'indiquer votre taille (valeur decimale comprises entre 1.0 et 2.1) : ";
	
	// Reponses
	private static final String ReponseENFANT = "Vous êtes un enfant";
	private static final String ReponseADO = "Vous êtes un adolescent";
	private static final String ReponseMAJEUR = "Vous êtes un adulte";
	
	// Messages d'erreur
	private static final String MsgErreurSAISIE = "Erreur de saisie !!!";
	
	// Constantes
	private static final int MinNOM = 1;
	private static final int MaxNOM = 20;
	private static final int MinPRENOM = 1;
	private static final int MaxPRENOM = 15;
	private static final int MinAGE = 0;
	private static final int MaxAGE = 120;
	private static final double MinTAILLE = 1.0;
	private static final double MaxTAILLE = 2.1;
	private static final int AgeMAJEUR = 18;
	private static final int AgeENFANT = 12;

	// Declaration du scanner
	private static Scanner scan;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		scan = new Scanner(System.in);	
		
		String nom = nom(QuestionNOM,MinNOM,MaxNOM);
		String prenom = nom(QuestionPRENOM,MinPRENOM,MaxPRENOM);
		int age = age(QuestionAGE,MinAGE,MaxAGE);
		double taille = taille(QuestionTAILLE,MinTAILLE,MaxTAILLE);
		affiche(nom,prenom,age,taille);

		scan.close();

	}
	
	/**
	 * Saisie d'une chaine de caractères
	 * @param question
	 * @param min
	 * @param max
	 * @return
	 */
	private static String nom(String question, int min, int max)
	{
		String nom = "";
		boolean ok = false;
		do
		{
			System.out.print(question);
			try
			{
					nom = scan.nextLine();
					if(nom.length() > min && nom.length() < max) 
						ok = true;	
			} 
			catch (Exception e)
			{
				System.err.println(MsgErreurSAISIE);
			}
			
		}while(ok == false);
		return nom;
	}

	/**
	 * Saisie d'un entier age
	 * @param question
	 * @param min
	 * @param max
	 * @return
	 */
	private static int age(String question, int min, int max)
	{
		int age = 0;
		boolean ok = false;
		do
		{
			System.out.print(question);
			try
			{
				age = scan.nextInt();
				if(age > min && age < max) 
				{
					ok = true;
					scan.nextLine();
				}
				
			} 
			catch (Exception e)
			{
				System.err.println("");
				System.err.print(MsgErreurSAISIE);
				scan.nextLine();
			}
		}while(ok == false);	
		return age;
	}
	
	/**
	 * Saisie d'un reel taille
	 * @param question
	 * @param min
	 * @param max
	 * @return
	 */
	private static double taille(String question, double min, double max)
	{
		double taille = 0.0;
		boolean ok = false;
		do
		{
			System.out.print(question);
			try
			{
				taille = scan.nextDouble();
				if(taille > min && taille < max) 
				{
					ok = true;
					scan.nextLine();
				}
			} 
			catch (Exception e)
			{
				System.err.println("");
				System.err.print(MsgErreurSAISIE);
				scan.nextLine();
			}
		}while(ok == false);
		return taille;
	}
	
	/**
	 * Affichage
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param taille
	 */
	private static void affiche(String nom, String prenom, int age, double taille)
	{
		System.out.println("");
		System.out.println("Bonjour " + prenom + " " + nom);
		System.out.println("Vous avez " + age + " ans");
		System.out.println("Vous mesurez " + taille + " métre");
		
		if(age < AgeENFANT)
		{
			System.out.println(ReponseENFANT);
		}
		else if(age > AgeMAJEUR)
		{
			System.out.println(ReponseMAJEUR);
		}
		else
		{
			System.out.println(ReponseADO);
		}
	}
	
}
