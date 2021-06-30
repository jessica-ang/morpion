import  java.util.Scanner;
public class Morpion
{
    static char cel1 = '1';
    static char cel2 = '2';
    static char cel3 = '3';
    static char cel4 = '4';
    static char cel5 = '5';
    static char cel6 = '6';
    static char cel7 = '7';
    static char cel8 = '8';
    static char cel9 = '9';
    static String separation = " | ";
    static int joueur=1;
    static boolean jeux= false;
    static char symbol='X';


    public static void main (String[] args)
    {
        morpion();

    }

    public static void morpion ()
    {
        System.out.println("Bonjour ! \nJouons au Morpion :");
        afficher();
        String joueur1=nomJoueur(1);
        String joueur2=nomJoueur(0);
        //boucle de jeux
        while (!jeux){
            if (joueur==1){
                jouer(joueur, joueur1);
                afficher();
                symbol='X';
                jeux=gagner(joueur1, symbol);
                joueur=0;
            }else{
                jouer(joueur, joueur2);
                afficher();
                symbol='O';
                jeux=gagner(joueur2, symbol);
                joueur=1;
            }
        }
		/*Scanner scan=new Scanner(System.in);
		System.out.println ("Voulez-vous rejouer ? (oui/non)");
		String rejouer=scan.nextLine();
		if (rejouer == "oui"){
			morpion();
		}*/

    }

    //fonction pour affichage grille
    public static void afficher ()
    {
        System.out.println(separation+cel7+separation+cel8+separation+cel9 +separation);
        System.out.println (separation+cel4+separation+cel5+separation+cel6 +separation);
        System.out.println (separation+cel1+separation+cel2+separation+cel3 +separation);
    }

    //fonction pour choix cellule et enregistrement symbole
    public static void jouer(int joueur, String nomJoueur)
    {
        // si pour choix symbol
        if(joueur==1){
            symbol ='X';
        }else{
            symbol='O';
        }
        //scanneur choix case
        Scanner scan=new Scanner(System.in);
        System.out.println("Quel case choisis-tu "+ nomJoueur+ "?");

        boolean erreur =false;
        int choix=scan.nextInt();
        scan.nextLine();
        //si de choix de cellule
        switch (choix){
            case 1:
                //si de verification déjà jouer
                if (cel1=='X'|| cel1=='O'){
                    erreur =true;
                }else{
                    cel1=symbol;
                }
                break;
            case 2:
                if (cel2=='X'|| cel2=='O'){
                    erreur =true;
                }else{
                    cel2=symbol;
                }
                break;
            case 3:
                if (cel3=='X'|| cel3=='O'){
                    erreur =true;
                }else{
                    cel3=symbol;
                }
                break;
            case 4:
                if (cel4=='X'|| cel4=='O'){
                    erreur =true;
                }else{
                    cel4=symbol;
                }
                break;
            case 5:
                if (cel5=='X'|| cel5=='O'){
                    erreur =true;
                }else{
                    cel5=symbol;
                }
                break;
            case 6:
                if (cel6=='X'|| cel6=='O'){
                    erreur =true;
                }else{
                    cel6=symbol;
                }
                break;
            case 7:
                if (cel7=='X'|| cel7=='O'){
                    erreur =true;
                }else{
                    cel7=symbol;
                }
                break;
            case 8:
                if (cel8=='X'|| cel8=='O'){
                    erreur =true;
                }else{
                    cel8=symbol;
                }
                break;
            case 9:
                if (cel9=='X'|| cel9=='O'){
                    erreur =true;
                }else{
                    cel9=symbol;
                }
                break;
            default :
                //si on n'a choisi un chiffre en dehors de la grille
                System.out.println("Ce chiffre n'est pas une case de la grille");
                jouer(joueur, nomJoueur);
        }
        if (erreur){
            System.out.println("Case déjà choisi. Veuillez en choisir une autre.");
            jouer(joueur, nomJoueur);
        }


    }
    //fonction pour savoir si on continue ou si on n'a gagné ou si c'est un matche nul
    public static boolean gagner(String nomJoueur, char symbol){
        //si pour tous les cas de gagne
        if (cel1==symbol && cel2==symbol && cel3==symbol || cel4==symbol && cel5==symbol && cel6==symbol || cel7==symbol && cel8==symbol && cel9==symbol || cel1==symbol && cel5==symbol && cel9==symbol || cel3==symbol && cel5==symbol && cel7==symbol || cel1==symbol && cel4==symbol && cel7==symbol || cel2==symbol && cel5==symbol && cel8==symbol || cel3==symbol && cel6==symbol && cel9==symbol){
            System.out.println("Vous avez gagné " +nomJoueur);
            return true;
            //si de match nul
        }	else if (cel1!='1' && cel2!='2'&& cel3!='3'&& cel4!='4'&& cel5!='5'&& cel6!='6'&& cel7!='7'&& cel8!='8'&& cel9!='9'){
            System.out.println("Match nul");
            return true;
        }else{
            //sinon on continue
            return false;
        }
    }

    //choix nom joueur
    public static String nomJoueur(int pjoueur)
    {
        Scanner scan=new Scanner(System.in);

        if(pjoueur==1){
            System.out.print("Quel est ton nom, joueur 1 ? ");
        }else{
            System.out.print("Quel est ton nom, joueur 2 ? ");
        }


        String nom=scan.nextLine();
        return nom;
    }


}



