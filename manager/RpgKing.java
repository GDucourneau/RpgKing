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
		ArrayList<Hero> Joueurs = new ArrayList<Hero>();
		Barbare unBarbare = new Barbare();
		Paladin unPaladin = new Paladin();
		Magicien unMagicien = new Magicien();
		System.out.println("Combien de joueurs?");
		Scanner sc = new Scanner(System.in);
		nbrJoueurs = sc.nextInt();
		Joueurs = createPlayer(nbrJoueurs, unBarbare, unPaladin, unMagicien);
		game(Joueurs);

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
			Hero joueur = null;
			for(int x = 0;x < tabPerso.length; x++)
			{
				saisieUser = "";
				switch(x)
				{
					case 0:
						System.out.println("Nom joueur "+j);
						saisieUser = sc.nextLine();
						tabPerso[x] = saisieUser;
						break;
					case 1:
						System.out.println("Prenom Joueur "+j);
						saisieUser = sc.nextLine();
						tabPerso[x] = saisieUser;
						break;
					case 2:
						
						do{
							saisieUser = "";
							System.out.println("Classe de "+tabPerso[0]+" "+tabPerso[1]);
							System.out.println("Barbare = 1\nPaladin = 2\nMagicien = 3");
							saisieUser = sc.nextLine();
							System.out.println("a:" + saisieUser + ":a");
							if(saisieUser.equals("1") && saisieUser.equals("2") && saisieUser.equals("3"))
							{
								System.out.println("Erreur de saisie" );
							}else {
								classe = saisieUser;
							}
						}while(saisieUser.equals("1") && saisieUser.equals("2") && saisieUser.equals("3"));
						tabPerso[x] = "1";
						break;
					case 3:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "500";
								break;
							case "2":
								tabPerso[x] = "450";
								break;
							case "3":
								tabPerso[x] = "400";
								break;
						}
						break;
					case 4:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "10";
								break;
							case "2":
								tabPerso[x] = "10";
								break;
							case "3":
								tabPerso[x] = "10";
								break;
						}
						break;
					case 5:
						switch(classe)
						{
							case "1":
								tabPerso[x] = "12";
								break;
							case "2":
								tabPerso[x] = "8";
								break;
							case "3":
								tabPerso[x] = "16";
								break;
						}
						break;

				}
				
				
				
			}
			switch(classe)
			{
				case "1":
					 joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),unBarbare);
					break;
				case "2":
					 joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),unPaladin);
					break;
				case "3":
					 joueur = new Hero(tabPerso[0],tabPerso[1],Integer.parseInt(tabPerso[2]),Integer.parseInt(tabPerso[3]),Integer.parseInt(tabPerso[4]),Integer.parseInt(tabPerso[5]),unMagicien);
					break;
			}
			Joueurs.add(joueur);
		}
		
		return Joueurs;
	}
	
	public static void game(ArrayList<Hero> joueurs) {
		
		//variable
		ArrayList<Hero> Joueurs =  joueurs;
		String saisieUser = "";
		Scanner sc = new Scanner(System.in);
		String tabPerso[] = new String[7];
		String classe = "";
		
		//debut du jeu
		for(int i =0; i < Joueurs.size();i++) {
			int a = i+1;
			System.out.println("Nom du joueur"+a+": "+Joueurs.get(i).getPrenom());
			System.out.println("Nom du joueur"+a+": "+Joueurs.get(i).getNom());
			
		}
	}
		
	
}
