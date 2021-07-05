public class MesMots {

    public static void sansE (String phrase)
    {
        String resultat="";
        for (int i=0; i<phrase.length();i++){
            if (phrase.charAt(i)!='e' && phrase.charAt(i)!='E'){
                resultat  += phrase.charAt(i);
            }
        }
        System.out.println(resultat);
    }

    public static void nbA (String pphrase)
    {
        int resultat= 0;
        for (int i=0; i< pphrase.length();i++){
            if (pphrase.charAt(i)=='a' || pphrase.charAt(i)=='A'){
                resultat++;
            }
        }
        System.out.println("il y a "+resultat+" a dans la phrase.");
    }

    public static void envers (String pphrase) {
        String resultat = "";
        for (int i=(pphrase.length()-1); i>=0; i--){
            resultat+=pphrase.charAt(i);
        }
        System.out.println("la phrase à l'envers donne "+resultat);
    }

    public  static void majuscule(String pphrase)
    {
        int resultat=0;
        for (int i=0; i<pphrase.length();i++) {
            if (Character.isUpperCase(pphrase.charAt(i))) {
                resultat++;
            }
        }
        System.out.println("Il y a "+resultat+" Majuscule dans la phrase");
    }

    public static void sansVoyelle (String pphrase)
    {
        String resultat="";
        for (int i=0; i<pphrase.length();i++){
            if (pphrase.charAt(i)!='e' && pphrase.charAt(i)!='a' && pphrase.charAt(i)!='i' && pphrase.charAt(i)!='y' && pphrase.charAt(i)!='u' &&pphrase.charAt(i)!='o'){
                resultat  += pphrase.charAt(i);
            }
        }
        System.out.println(resultat);
    }

    public static void sansMaj (String pphrase)
    {
        String resultat="";
        for (int i=0; i<pphrase.length();i++){
            if (!Character.isUpperCase(pphrase.charAt(i))){
                resultat += pphrase.charAt(i);
            }
        }
        System.out.println(resultat);
    }

    public static void grandChara (String pphrase)
    {
        char resultat=pphrase.charAt(0);
        for (int i=1; i<pphrase.length();i++){
            if ( pphrase.charAt(i)>pphrase.charAt(i-1)) {
                resultat=pphrase.charAt(i);
            }
        }
        System.out.println("la lettre la plus grande est : "+resultat);

    }

    public static void espaceAvant (String pphrase)
    {
        String resultat="";
        int i=0;
        while (pphrase.charAt(i)== ' '){
            i++;
        }
        for (;i<pphrase.length();i++){
            resultat+=pphrase.charAt(i);
        }

        System.out.println(resultat);
    }

    public static void sansEspace (String pphrase)
    {
        System.out.println(pphrase.trim());
    }

}
