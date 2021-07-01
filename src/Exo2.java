public class Exo2 {
    public static void main(String[] args) {
        System.out.println("fonction estMajeur");
        System.out.println(estMajeur(18));
        System.out.println(estMajeur(5));
        System.out.println("fonction signe");
        System.out.println(MesMaths.signe(-5));
        System.out.println(MesMaths.signe(5));
        System.out.println(MesMaths.signe(0));
        System.out.println("fonction plusGrand2");
        System.out.println(MesMaths.plusGrand2(5, 8));
        System.out.println(MesMaths.plusGrand2(8, 5));
        System.out.println("fonction plusPetit2");
        System.out.println(MesMaths.plusPetit2(5, 8));
        System.out.println(MesMaths.plusPetit2(8, 5));
        System.out.println("fonction plusPetit3");
        System.out.println(MesMaths.plusPetit3(5, 8, 2));
        System.out.println(MesMaths.plusPetit3(8, 5, 10));
        System.out.println(MesMaths.plusPetit3(3, 5, 10));
        System.out.println("fonction plusGrand3");
        System.out.println(MesMaths.plusGrand3(5, 18, 2));
        System.out.println(MesMaths.plusGrand3(8, 5, 10));
        System.out.println(MesMaths.plusGrand3(13, 5, 10));
        System.out.println("fonction positifOuPas");
        System.out.println(MesMaths.positifOuPas(13, 5, 10));
        System.out.println(MesMaths.positifOuPas(13, 5, -10));
        System.out.println(MesMaths.positifOuPas(-13, -5, -10));
        System.out.println(MesMaths.positifOuPas(13, -5, 10));
        System.out.println(MesMaths.positifOuPas(-13, 5, 10));
        System.out.println("fonction quelPermis");
        quelPermis(5);
        quelPermis(10);
        quelPermis(16);
        quelPermis(17);
        quelPermis(18);
        quelPermis(19);
        quelPermis(80);
        System.out.println("fonction capital");
        System.out.println(capital("France"));
        System.out.println(capital("Allemagne"));
        System.out.println(capital("Italie"));
        System.out.println(capital("Angleterre"));
        System.out.println(capital("Brésil"));

    }

    public static boolean estMajeur (int age)
    {
        /* version longue
        if (age>=18){
            return true;
        }else {
            return false;
        }
        version courte*/
        return age >= 18;
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
