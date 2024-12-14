package david.tp04;

import java.util.Scanner;

import commun.Outils;

public class Tp04 {
	


	public static final int NB_CASES = 7; // Nombre de cases à remplir par partie, maximum 20
	public static void main(String[] args) {
		
	
		// A FAIRE (45) : code
//		Outils.Aleatoire.setSeed(9531);
        Outils.Aleatoire.setSeed(9531);
		Scanner cl = new Scanner(System.in);
		// Déclarer un tableau pour les points et l'initialiser avec les points
		// de base inscrits sur la feuille de pointage disponible dans l'énoncé
		
		float[]tableau1 = new float = {0,1,3,5,7,9,11,15,20,25,30,35,40,50,60,70,85,100,150,300};
		// Créer un tableau de taille quarante pour stocker les tuiles
		nbTuiles=cl.nextInt();
		tableau2=new float [40];
		nbTuiles=40;
		
		// Répéter
		scoreMax=0;

		do{
			System.out.print("Sélectionnez le pointage de Base ou Expert ou Quitter : ");
		int point=cl.nextInt();

	    // changement des pointage en mode expert
			if (point==e||E){
				point [5] =6;
				point [11]=12;
				point [16] =18;
			}
		// sinon normal
		System.out.print("Distribution des chiffres, soit Classique ou Différents?");
        int dist= cl.nextInt();
		if(dist==d||D){
			// faut préciser que les liste change 
			//pas eu le temps


		}
		// On modifie les trois cases du tableau des points selon le type de pointage choisi
		// On initialise le tableau des tuiles selon la distribution désirée
		
		// Appel de jouerPartie() et récupération du score final
		scoreFinal= jouerPartie(cl, tuiles, points);
		System.out.print(" Total de la partie =" + scoreFinal);
		// Mise à jour du score maximal si le joueur a fait un nouveau record
		if(scoreFinal>scoreMax){
		scoreMax=scoreFinal;
		}
 	// Tant que le joueur ne choisit pas de quitter
	}while (reponse!=Q||q);
		// Afficher le pointage record et saluer le joueur
		System.out.print("Votre record est:" + scoreMax );
		System.out.print("Bonne journée");
	}

	// A FAIRE (14) : code - documentation(/**)
	public static int jouerPartie(Scanner cl, int[] tuiles, int[] points) {
		int [] cases;
		int  [] scores;
		// tuiles et points ne doivent pas être modifiés
		// Déclarer un tableau de cases et de scores, mais ne pas les initialiser
		Float[]TableauCaseNScore=new float[NB_CASES];
		// Appeler toursDeJeu() et récupérer le tableau de cases
		cases= toursDeJeu( cl,tuiles);
		// Appeler changeJoker()
		changeJoker( cl, cases);
		
		// Appeler calculScore() et récupérer le tableau des scores
		calculScore( cases,  points);
		scores=calculScore(cases,points);
		// Appeler somme() pour obtenir le score total
		somme(vecteur);
		// Appeler maximum() pour obtenir la poisition du score maximal pour une suite
		int scoreTot=somme(scores);
		int posMax=maximum(scores);
		// Afficher le résultat de la partie
		System.out.print("Total de la partie = "+scoreTot );
		return scoreTot; // Retourner le score total
	}

	// A FAIRE (26) : code - documentation(/**)
	public static int[] toursDeJeu(Scanner cl, int[] tuiles) {
		// tuiles ne doit pas être modifié
		// Initialiser un tableau de cases à -1 ayant pour taille NB_CASES
		// Initialiser un tableau de positions avec les nombres de 1 à NB_CASES
		int[]cases=new int[NB_CASES];
		int[]dispo = new int[tuiles.length];
		
		// Initialiser un tableau tuiles disponibles à vrai (true) ??? de la même taille que tuiles
		// tant que c'est vrai la boucle continue
		for (int i =0;i< dispo,length;i++){

		disponible[i] = 1;
	}
	for ( int i =0;i< NB_CASES;i++) {
		int tuile=pigeTuile(tuiles, disponible);
		affiche(dispo, 0, 0, tuile, null);

		int pos;
		do{
			System.err.print("Position d'ajout du nombre 30 >");
			pos=cl.nextInt();
		}while (position< 0|| position>=NB_CASES|| cases[pos]!=0);

cases[pos]=tuile;
}

		// Pour le nombre de cases à remplir, piger une tuile, afficher l'état actuel
		// des cases, demander la position d'ajout au joueur, jusqu'à ce qu'il
		// entre une position valide, et écrire la tuile dans la case.
		// Indice : Les positions du joueur débutent à 1 alors que votre tableau débute à 0
		return cases; // Retourne le tableau de cases rempli
	}

	// A FAIRE (8) : code - documentation(/**)
	public static void changeJoker(Scanner cl, int[] cases) {
		// Le tableau cases peut être modifié si un JOKER est présent
		// Lire la documentation de l'énoncé et utiliser la fonction trouve()
		// permet de trouver le joker
		int pos= trouve(cases,-1);
		if (pos!=-1){
			System.out.print("En quelle valeur voulez-vous changer le JOKER?");
			cases[pos]=cl.nextInt();
	}       //lire la valeur mise pour le joker
		}//pos=position

	// A FAIRE (13) : code - documentation(/**)
	public static int[] calculScore(int[] cases, int[] points) {
		// cases et points ne doivent pas être modifiés
		// Aucun affichage n'est réalisé par cette fonction
		// Initialiser à zéro un tableau de scores de la même taille que le tableau cases
         int[] score= new int[NB_CASES];
		 //parcourir tant que la condition est vraie et après chaque boucle rajouter +1 
		 for (int i =0;i< NB_CASES;i++){
           score[i]=0; // initialise les scores à 0
		 }
		// Initialiser la longueur de la suite à 1
		int suiteLongueur=1;
		// Pour chaque paire de cases adjacentes, vérifier s'il s'agit de la fin 
		// d'une suite et faire le traitement approprié
		// Ne pas oublier d'écrire les points de la dernière suite  *????*
		return score; // Retourne le tableau des scores créé
	}

	// A FAIRE (8) : code - documentation(/**)
	public static int pigeTuile(int[] tuiles, boolean[] disponible) {
		// Seul tuiles ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Lire la documentation de l'énoncé et utiliser Outils.Aleatoire
		// piger une tuile de facon aléatoire depuis le tableau
		int emplacement = (int) (Outils.Aleatoire()*tuiles.length);
		//emplacement permet d'accéder à une tuile précise dans le tableau de tuiles
		// Indice : Ne pas oublier de mettre la tuile pigée à
		// false dans le tableau disponible
		disponible[emplacement]=false;
		return tuiles[emplacement]; // Retourne la valeur de la tuile pigée
	}

	// A FAIRE (15) : code - documentation(/**)
	public static void affiche(int[] tab, char sepC, char sepD, int val, String rem) {
		// tab ne doit pas être modifié
		// Lire la documentation de l'énoncé et utiliser String.formatted()
		// Indice : Faire un cas spécial pour le premier élément qui ne
		// doit pas être précédé d'un séparateur
		//parcourir tant que la condition est vraie et après chaque boucle rajouter +1 
		for (int i = 0; i < tab.length; i++) {
			if (i>0){
				System.out.print(sepC);
				//permet d'afficher une séparation entre les colonnes
		}
		// permet d'afficher la valeur de la case
		System.out.print(tab[i]);
	}
	}

	// A FAIRE (6) : code - documentation(/**)
	public static int somme(int[] vecteur) {
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		int tot=0;
		//parcourir tant que la condition est vraie et après chaque boucle rajouter +1
		for(int i =0;i< vecteur.length;i++);{
			tot +=vecteur;}
		return tot; // Retourne une valeur
	}

	// A FAIRE (8) : code - documentation(/**)
	public static int maximum(int[] vecteur) {
		// vecteur ne doit pas être modifié
		
		int max= vecteur[0];
		int position=0;
		//parcourir tant que la condition est vraie et après chaque boucle rajouter +1
		for (int i =1;i < vecteur.length; i++)// pour le tableau 
		{
        if (vecteur[i] > max){
			max=vecteur[i];
			position=i;
			// calcul de la position du score maximal dans le tableau
		}
	}
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return position; // Retourne une position
	}

	// A FAIRE (9) : code - documentation(/**)
	public static int trouve(int[] vecteur, int valeur) {
		// vecteur ne doit pas être modifié
		//parcourir tant que la condition est vraie et après chaque boucle rajouter +1
		for (int i =0; i< vecteur.length;i++ )//pour le tableau
		{
			if (vecteur[i]==valeur)// si le vecteur est égal à la valeur , return 1
			{
				return 1;

			}
   

		}
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return -1; // sinon return -1
		// Retourne une position
	}
}
