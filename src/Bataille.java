import java.util.Scanner;

public class Bataille {

    //variables en static
    static int joueur=1;
    static String joueur1;
    static String joueur2;
    static int gagnant=0;
    static int nbCard1=13;
    static int nbCard2=13;
    static String[] paquet1= new String[26];
    static String[] paquet2= new String[26];

    public static void main (String[] args)
    {
        jouerBataille();
    }
    public static void jouerBataille(){
        joueur1 = nomJoueur(1);
        joueur2 = nomJoueur(0);

        paquet1= initCartes();
        paquet2= initCartes();


        int cardJoueur1 =tirerUneCarte(paquet1);
        int cardJoueur2 =tirerUneCarte(paquet2);

        gagnant = quiGagneLeTour(cardJoueur1,cardJoueur2);

        transfererCarte(gagnant,paquet1, paquet2, cardJoueur1, cardJoueur2);

        afficherTour(gagnant,cardJoueur1,cardJoueur2);




    }

    public static void printTab(String[] tab) {
        for (int indice=0; indice< tab.length;indice++){
            System.out.print(tab[indice]+" - ");
        }
        System.out.println();
    }

    /** : initialise un jeu de cartes avec 13 cartes pour chaque joueur **/
    public static String[] initCartes(){
        String[] card;
        card= new String[] {"as","2","3","4","5","6","7","8","9","10","Valet","Dame","Roi"};
        return card;
    }

    /** tire une carte au hasard dans ce jeu de cartes **/
    public static int tirerUneCarte(String[] pPaquet){
        int choix;
        choix=(int) (Math.random()*26);
       /* if (pPaquet[choix].equals("")){
            tirerUneCarte(pPaquet);
        }*/
        return choix;

    }
    /** évalue qui gagne le tour (as<2<3<,…<Roi) Si égalité: les cartes sont perdues **/
    public static int quiGagneLeTour(int choix1, int choix2){
        int gagnant;
        if (choix1>choix2){
            gagnant=1;
        }else if (choix2>choix1){
            gagnant=2;
        } else {
            gagnant=0;
        }
        return gagnant;
    }
    /** le gagnant récupère la carte de l’autre joueur **/
    public static void transfererCarte(int gagnant,String[] pTab, String[] pTab2 , int choix1, int choix2){
        if (gagnant==1) {
            paquet1[choix2+13]=paquet2[choix2];
            paquet2[choix2]= "";
            nbCard2--;
            nbCard1++;

        }else if(gagnant==2){
            paquet2[choix1+13]=paquet1[choix1];
            paquet1[choix1]="";
            nbCard1--;
            nbCard2++;
        }
    }
    /**  affiche le tour **/
    public static void afficherTour(int pGagnant, int card1, int card2){
        String[] paquet;
        paquet= new String[13];
        paquet= initCartes();
        if (pGagnant==1){
            System.out.println(joueur1+" a battu "+paquet[card2]+" du "+joueur2+" grace à "+paquet[card1]);
            System.out.println(joueur2+" a encore "+ nbCard2+" carte en main");
        } else if (pGagnant==2){
            System.out.println(joueur2+" a battu "+paquet[card1]+" du "+joueur1+" grace à "+paquet[card2]);
            System.out.println(joueur1+" a encore "+ nbCard1+" carte en main");
        }
    }

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