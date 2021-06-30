public class Exo2 {
    public static void main(String[] args) {
        /*System.out.println(estMajeur(18));
        System.out.println(estMajeur(5));
        System.out.println(signe(-5));
        System.out.println(signe(5));
        System.out.println(signe(0));
        System.out.println(plusGrand2(5, 8));
        System.out.println(plusGrand2(8, 5));
        System.out.println(plusPetit2(5, 8));
        System.out.println(plusPetit2(8, 5));*/
        System.out.println(plusPetit3(5, 8, 2));
        System.out.println(plusPetit3(8, 5, 10));
        System.out.println(plusPetit3(3, 5, 10));
        System.out.println(plusGrand3(5, 18, 2));
        System.out.println(plusGrand3(8, 5, 10));
        System.out.println(plusGrand3(13, 5, 10));
       /* System.out.println(positifOuPas(13, 5, 10));
        System.out.println(positifOuPas(13, 5, -10));
        System.out.println(positifOuPas(-13, -5, -10));
        System.out.println(positifOuPas(13, -5, 10));
        System.out.println(positifOuPas(-13, 5, 10));
        quelPermis(5);
        quelPermis(10);
        quelPermis(16);
        quelPermis(17);
        quelPermis(18);
        quelPermis(19);
        quelPermis(80);
        System.out.println(capital("France"));
        System.out.println(capital("Allemagne"));
        System.out.println(capital("Italie"));
        System.out.println(capital("Angleterre"));
        System.out.println(capital("Brésil"));*/

    }

    public static boolean estMajeur (int age)
    {
        if (age>=18){
            return true;
        }else {
            return false;
        }
    }

    public  static String signe (int reel)
    {
        if (reel == 0){
            return "nul";
        } else if (reel>0){
            return "positif";
        }else{
            return "negatif";
        }
    }

    public static int plusGrand2 (int nb1, int nb2)
    {
        if (nb1>nb2){
            return nb1;
        } else {
            return nb2;
        }
    }

    public static int plusPetit2 (int nb1, int nb2)
    {
        if (nb1<nb2){
            return nb1;
        } else {
            return nb2;
        }
    }

    public static int plusPetit3 (int nb1, int nb2, int nb3)
    {
        /*if (nb1<nb2 && nb1<nb3){
            return nb1;
        } else if (nb2<nb3){
            return nb2;
        } else {
            return nb3;
        }*/
        return plusPetit2( plusPetit2(nb1,nb2),nb3);
    }


    public static int plusGrand3 (int nb1, int nb2, int nb3)
    {
        /*if (nb1>nb2 && nb1>nb3){
            return nb1;
        } else if (nb2>nb3){
            return nb2;
        } else {
            return nb3;
        }*/
        return plusGrand2(plusGrand2(nb1,nb2),nb3);
    }

    public static boolean positifOuPas (int nb1, int nb2, int nb3)
    {
        if (nb1<0 || nb2<0 || nb3<0){
            return false;
        } else {
            return true;
        }
    }

    public static void quelPermis (int age)
    {
        if (age<16){
            System.out.println("Passager d'un vehicule");
        } else if (age<18){
            System.out.println("Eligible conduite accompagnée");
        } else {
            System.out.println("Eligible au Permis B");
        }
    }

    public static String capital (String pays)
    {
        switch (pays) {
            case "France":
                return "Paris";
            case "Allemagne":
                return "Berlin";
            case "Italie":
                return "Rome";
            case "Maroc":
                return "Rabat";
            case "Espagne":
                return "Madrid";
            case "Portugal":
                return "Lisbonne";
            case "Angleterre":
                return "Londres";
            default:
                return "inconnue";
        }

    }

}
