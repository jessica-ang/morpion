public class arrayUtils {

    /**Remplis le tableau de valeurs aléatoires comprises entre 0 et99 */
    public static void fillTab(int[] tab) {
        for (int indice=0; indice< tab.length;indice++){
            tab[indice]=(int) (Math.random()*100);
        }
    }
    /** Affiche le tableau dans la console sur 1 seule ligne */
    public static void printTab(int[] tab) {
        for (int indice=0; indice< tab.length;indice++){
            System.out.print(tab[indice]+";");
        }
    }
    /** Retourne la valeur maximum du tableau */
    public static int getMax(int[] tab) {
        int comparateur=tab[0];
        for (int indice=1; indice< tab.length;indice++){
            if (comparateur<tab[indice]) {
                comparateur=tab[indice];
            }
        }
        return comparateur;
    }
    /** Permute l’emplacement i et j dans le tableau */
    public static void permute(int[] tab, int i, int j){
        int temp;
        temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }




}
