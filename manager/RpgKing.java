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
	
	
	public static  void commencer() {
		int nbrJoueurs = 0;
		ArrayList<Hero> Joueurs = new ArrayList<Hero>();
		ArmePhysique armeBarbare = new ArmePhysique("CartonJaune",1,5,5);
		ArmurePhysique armureBarbare = new ArmurePhysique("GiletJaune",1,2);
		Barbare unBarbare = new Barbare(armeBarbare,armureBarbare);
		Paladin unPaladin = new Paladin();
		Magicien unMagicien = new Magicien();
		System.out.println("Combien de joueurs?");
		Scanner sc = new Scanner(System.in);
		nbrJoueurs = sc.nextInt();
		Joueurs = createPlayer(nbrJoueurs, unBarbare, unPaladin, unMagicien);
		game(Joueurs, unBarbare, unPaladin, unMagicien);

	}
	
	public static  ArrayList<Hero> createPlayer(int nbrJoueurs,Barbare unBarbare,Paladin unPaladin,Magicien unMagicien)
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
							System.out.println("Classe de "+tabPerso[0]+" "+tabPerso[1]);
							System.out.println("Barbare = 1\nPaladin = 2\nMagicien = 3");
							saisieUser = sc.nextLine();
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
	
	public static  void game(ArrayList<Hero> joueurs,Barbare unBarbare,Paladin unPaladin,Magicien unMagicien) {
		
		//variable
		String saisieUser = "";
		Scanner sc = new Scanner(System.in);
		String tabPerso[] = new String[7];
		String classe = "";
		String winner="";
		
		//Affichage Personnages 
		for(int i =0; i < joueurs.size();i++) {
			int a = i+1;
			System.out.println("Nom du joueur"+a+": "+joueurs.get(i).getPrenom());
			System.out.println("Nom du joueur"+a+": "+joueurs.get(i).getNom());
			System.out.println("Arme du joueur"+a+": "+joueurs.get(i).getArme().getNom());
			System.out.println("Armure du joueur"+a+": "+joueurs.get(i).getArmure().getNom());
		}
		
		Mob gobelin = apparitionGobelinBarbare(unBarbare);
		winner = combat(joueurs,gobelin);
		System.out.println("le gagnant hero vs gobelin est "+winner);
		
	}
		
	public static  Mob apparitionGobelinBarbare(Barbare unBarbare)
	{
		Mob Gobelin = new Mob("Roi","Gobelin",1,80,5,5,unBarbare);
		return Gobelin;
	}
	
	public static  String combat(ArrayList<Hero> joueurs,Mob mob)
	{
		Scanner sc = new Scanner(System.in);
		String winner ="";
		while(mob.getVie() > 0 || joueurs.isEmpty())
		for(int i = 0;i < joueurs.size();i++)
		{
			// le joueur attaque le monstre
			System.out.println("Le "+joueurs.get(i).getNom()+"attaque a"+joueurs.get(i).getAttaque()[0]+" degats");
			sc.nextLine();
			mob.setVie(mob.getVie() - joueurs.get(i).getAttaque()[0]);
			
			//Affichage points de vie restant
			System.out.println("Il reste "+mob.getVie()+" PDV au "+mob.getPrenom()+mob.getNom());
			
			//Si il  est vivant il peut attaquer
			if(mob.getVie() < 1)
			{
				System.out.println(mob.getPrenom()+" "+mob.getNom()+" is dead");
				winner = joueurs.get(i).getNom()+" "+joueurs.get(i).getPrenom();
				joueurs.get(i).recupererButin(mob); 
				
				//Apres une victoire on Loot!
				
				for(int f = 0 ;f < joueurs.get(i).getInventaire().size();f++)
				{
					System.out.println(joueurs.get(i).getInventaire().get(f).getNom());
				}
				
				joueurs.remove(joueurs.get(i));
				break;
			}else {
				// Affichage Attaque mob
				System.out.println("Le mob fait "+mob.getAttaque()[0]+" degats");
				
			 	joueurs.get(i).setVie(joueurs.get(i).getVie() - mob.getAttaque()[0]); 
			 	
			 	System.out.println("PDV Joueur"+joueurs.get(i).getNom()+" "+joueurs.get(i).getPrenom()+": " +joueurs.get(i).getVie());
				if(joueurs.get(i).getVie() < 1)
				{
					System.out.println(joueurs.get(i).getNom()+" "+joueurs.get(i).getPrenom()+" is dead");
					winner = mob.getNom()+" "+mob.getPrenom();
					break;
				}
			}
		}
		return winner;
	}
	
	public static void attaquer()
	{
		
	}
	
	public static void donjon()
	{
		
	}
}
