package CaracPerso;

import java.util.Scanner;

public class CaracPerso {

	private static Scanner	scan;
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		
		System.out.println ("Merci d'indiquer votre nom(entre 1 � 20 caracteres)");
		String xnom= saisirnom();
		System.out.println ("Merci de saisir votre pr�nom(entre 1 et 15 caracteres)");
		String xprenom= saisirprenom();
		System.out.println ("Merci d'indiquer votre age(entre 0 et 120ans)");
		int xage=saisirage();
		System.out.println ("Merci d'indiquer votre taille (valeur decimale comprises entre 1.0 et 2.1m)");
		float xtaille= saisirtaille();
		System.out.println("Bonjour " +xprenom +xnom );
		System.out.println("Vous avez "+xage +" ans");
		System.out.println("Vous mesurez "+xtaille +" metre");
		
		if (xage>=18)
			System.out.print("Vous �tes majeur(e)");
		else if (xage<12)
			System.out.print("Vous �tes un(e) enfant");
		else 
			System.out.print("Vous �tes un(e) adolescent(e))");
	}

	
		public static String saisirnom()
		{
			String entree="";
			entree= scan.nextLine();
			int L= entree.length();
			
			if (L>20)
				do
				{
					System.out.println("Merci d'indiquer votre nom (entre 1 et 20 caracteres)");
					entree= scan.nextLine();
					int M= entree.length();
					L=	M;
				}while(L>20);;
		
			return entree;
		}
		
		public static String saisirprenom()
		{
			String entree="";
			entree= scan.nextLine();
			int L= entree.length();
			
			if (L>15)
				do
				{
					System.out.println("Merci d'indiquer votre pr�nom (entre 1 et 20 caracteres)");
					entree= scan.nextLine();
					int M= entree.length();
					L=	M;
				}while(L>15);;
			return entree;
			
		}
		
		public static int saisirage()
		{
			int entree = -1;

			try
			{
				entree = scan.nextInt();
			} 
			catch (Exception e)
			{
				System.err.println("Erreur de saisie,veuillez indiquer votre �ge en chiffres");
			}
			scan.nextLine();
			int L= entree;
			if (L<0 | L>120)
				do
				{
					System.out.println("Merci d'indiquer votre age(entre 0 et 120ans)");
					try
					{
						entree = scan.nextInt();
					} 
					catch (Exception e)
					{
						System.err.println("Erreur de saisie,veuillez indiquer votre �ge en chiffres");
					}
					scan.nextLine();
					L=entree;
				}while (L<0 |L>120);
			return entree;
		}
		
		public static float saisirtaille()
		{
			float entree=0.0f;
			try
			{
				entree = scan.nextFloat();
			} 
			catch (Exception e)
			{
				System.err.println("Erreur de saisie,veuillez indiquer votre taile en chiffres");
			}
			scan.nextLine();
			float L= entree;
			if (L<1.0 | L>2.1)
				do
				{
					System.out.println("Merci d'indiquer votre taille(entre 1.0 et 2.1m)");
					try
					{
						entree = scan.nextFloat();
					} 
					catch (Exception e)
					{
						System.err.println("Erreur de saisie,veuillez indiquer votre taile en chiffres");
					}
					scan.nextLine();
					L=entree;
				}while (L<1.0 |L>2.1);
			return entree;
			
		}
}