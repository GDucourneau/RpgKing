/**
 * 
 */
package com.imie.algotojava.tp09Modifie.manager;

import java.awt.List;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Scanner;

import com.imie.algotojava.tp09Modifie.model.*;

/**
 * @author 
 * @date 26 juin 2018
 * 
 */
public class RpgKing {
	public static void commencer() {
		int nbrJoueurs = 0;
		System.out.println("Combien de joueurs?");
		Scanner sc = new Scanner(System.in);
		nbrJoueurs = sc.nextInt();
		game(nbrJoueurs);
		Barbare unBarbare = new Barbare();
		Paladin unPaladin = new Paladin();
		Magicien unMagicien = new Magicien();
	}
	
	public static ArrayList<Hero> createPlayer(int nbrJoueurs,Barbare unBarbare,Paladin unPaladin,Magicien unMagicien)
	{
		String saisieUser = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<Hero> Joueurs = new ArrayList<Hero>();
		String tabPerso[] = new String[7];
		String classe = "";
		
		for(int i = 0;i < nbrJoueurs;i++) {
			int j = i+1;
			
			for(int x = 0;x < tabPerso.length; x++)
			{
				saisieUser = "";
				switch(x)
				{
					case 0:
						System.out.println("Nom joueur "+j);
						saisieUser = sc.nextLine();
						tabPerso[x] = saisieUser;
					case 1:
						System.out.println("Prenom Joueur "+j);
						saisieUser = sc.nextLine();
						tabPerso[x] = saisieUser;
						
					case 2:
						while(saisieUser != "1" || saisieUser != "2" || saisieUser != "3")
						{
							System.out.println("Classe de "+tabPerso[0]+" "+tabPerso[1]);
							System.out.println("Barbare = 1 \n Paladin = 2 \n Magicien = 3");
							if(saisieUser != "1" || saisieUser != "2" || saisieUser != "3" )
							{
								System.out.println("Erreur de saisie" );
							}else {
								classe = saisieUser;
							}
						}
						tabPerso[x] = "1";
					
					case 3:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "500";
							case "2":
								tabPerso[x] = "450";
							case "3":
								tabPerso[x] = "400";
						}
					case 4:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "10";
							case "2":
								tabPerso[x] = "10";
							case "3":
								tabPerso[x] = "10";
						}
					case 5:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "12";
							case "2":
								tabPerso[x] = "8";
							case "3":
								tabPerso[x] = "16";
						}

				}
				
				
				
			}
			switch(classe)
			{
				case "1":
					Hero joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),unBarbare);

				case "2":
					//Hero joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),)
				case "3":
					//Hero joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),)
			}
			
			//Joueurs.add(joueur);
		}
		return Joueurs;
	}
	
	public static void game(int nbrJoueurs) {
		
		//variable
		String saisieUser = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<Hero> Joueurs = new ArrayList<Hero>();
		String tabPerso[] = new String[7];
		String classe = "";
		
		//debut du jeu
		
		
		
	}
}
