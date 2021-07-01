public class MesMaths {


    public  static String signe (int reel)
    {
        /* Version longue
        if (reel == 0){
            return "nul";
        } else if (reel>0){
            return "positif";
        }else{
            return "negatif";
        }
        Version courte*/
        return reel>0 ? "positif": (reel<0 ? "negatif":"nul") ;
    }

    public static int plusGrand2 (int nb1, int nb2)
    {
        /*if (nb1>nb2){
            return nb1;
        } else {
            return nb2;
        }*/
        return nb1>nb2 ? nb1:nb2;
    }

    public static int plusPetit2 (int nb1, int nb2)
    {
        /*if (nb1<=nb2){
            return nb1;
        } else {
            return nb2;
        }
        version math
        return Math.min(nb1, nb2);
        */
        return nb1<=nb2 ? nb1:nb2;


    }

    public static int plusPetit3 (int nb1, int nb2, int nb3)
    {
        /*if (nb1<=nb2 && nb1<=nb3){
            return nb1;
        } else if (nb2<=nb3){
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
        /*if (nb1<0 || nb2<0 || nb3<0){
            return false;
        } else {
            return true;
        }*/
        return (nb1>=0 || nb2>=0 || nb3>=0);
    }

}
