public class Exo2 {
    public static void main(String[] args) {
        /*System.out.println("fonction estMajeur");
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
        MesMaths.multiplicationFor(5);
        MesMaths.multiplicationWhile(5);
        MesMaths.multiplicationDo(5);
        MesMots.sansE("J'aimE les omelettes sans e");
        MesMots.nbA("J'aime les omelettes sAns e");
        MesMots.envers("toto");
        MesMots.majuscule("J'aime Les Majuscules avec un Grand M");
        MesMots.sansVoyelle("Les chaussettes de archiduchesse");
        MesMots.sansMaj("J'aime Les Majuscules avec un Grand M");
        MesMots.grandChara("le plus grand character c'est moi");
        MesMots.espaceAvant("    Espace");
        MesMots.sansEspace("     Geant         ");*/
        int[] tab;
        tab=new int[10];
        int[] tab2;
        tab2=new int[11];
        arrayUtils.fillTab(tab);
        arrayUtils.fillTab(tab2);
        arrayUtils.printTab(tab);
        System.out.println();
        arrayUtils.printTab(tab2);
        System.out.println("le nombre max est "+arrayUtils.getMax(tab));
        arrayUtils.permute(tab,0,9);
        System.out.println("i="+tab[0]+" et j="+tab[9]);
        System.out.println(arrayUtils.sum(tab));
        System.out.println(arrayUtils.average(tab));
        arrayUtils.higherAverage(tab);
        System.out.println();
        System.out.println("le nombre max "+arrayUtils.getMax(tab)+" apparait "+arrayUtils.nbMax(tab)+" fois.");
        arrayUtils.printTab(arrayUtils.fusion(tab,tab2));
        arrayUtils.printTab(arrayUtils.add(tab,45));
        arrayUtils.printTab(arrayUtils.remove(tab,5));
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
