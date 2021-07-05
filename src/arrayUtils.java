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
            System.out.print(tab[indice]+" - ");
        }
        System.out.println();
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

    // Retourne la somme
    public static int sum (int[] tab)
    {
        int result=0;
        for (int indice=0; indice< tab.length;indice++) {
        result+=tab[indice];
        }
        return result;
    }

    // Retourne la moyenne
    public static int average (int[] tab)
    {
        return sum(tab)/tab.length;
    }
    // Affiche les valeurs supérieurs à la moyenne (ne retourne rien)
    public static void higherAverage (int[] tab){
        int resultAverage=average(tab);
        System.out.print("Les nombres supérieurs a la moyenne ("+resultAverage+"): ");
        for (int indice=0; indice< tab.length;indice++){
            if (resultAverage<tab[indice]) {
                System.out.print(tab[indice]+" ;");
            }
        }

    }
    //Retourne le nombre d’occurrence de la valeur maximum (Version O(2n) et O(n))
    public static int nbMax(int[]tab)
    {
        int max=getMax(tab);
        int result=0;
        for (int indice=0; indice< tab.length;indice++){
            if (max==tab[indice]){
                result++;
            }
        }
        return result;
    }
    /** Crée et retourne un nouveau tableau qui est la concaténation des 2 tableaux **/
    public static int[] fusion(int[]tab1, int[] tab2) {
        int[] tab3;
        if (tab1.length>=tab2.length){
            tab3=new int[tab1.length];
            for (int indice=0; indice< tab2.length;indice++){
                tab3[indice]=tab1[indice]+tab2[indice];
            }
            for(int indice= tab2.length;indice<tab1.length;indice++){
                tab3[indice]=tab1[indice];
            }
        } else{
            tab3=new int[tab2.length];
            for (int indice=0; indice< tab1.length;indice++){
                tab3[indice]=tab1[indice]+tab2[indice];
            }
            for(int indice= tab1.length;indice<tab2.length;indice++){
                tab3[indice]=tab2[indice];
            }
        }

        return tab3;
    }

    /** Retourne un tableau avec une nouvelle valeur ajoutée **/
    public static int[] add(int[] pTab, int pValeurNouvelle) {
        int[] tab2;
        tab2 = new int[pTab.length+1];
        for (int i=0;i< pTab.length;i++){
            tab2[i]=pTab[i];
        }
        tab2[tab2.length-1]= pValeurNouvelle;
        return tab2;
    }
    /** Supprime un élément du tableau **/
    public static int[] remove(int[] pTab, int pIndiceASupprimer) {
        int[] newTab;
        newTab = new int[pTab.length-1];
        for (int i=pIndiceASupprimer;i<pTab.length-1;i++){
            newTab[i]=pTab[i+1];
        }
        return newTab;

    }







}
