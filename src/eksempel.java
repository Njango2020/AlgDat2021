


public class eksempel {
    public static void main (String []args){

    }
    static int maks(int[]a, int fra, int til){  //Metodens signture

        if (fra <0 || til > a.length|| fra>=til){
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;                    // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];         // største verdi i a[fra:til>

        for (int i=fra+1; i<til; i++ ){

            if (a[i] > m){
                m=i;                    // indeks til største verdi oppdateres
                maksverdi = a[m];       // største verdi oppdateres
            }
        }
        return m;                       // posisjonen til største verdi i a[fra:til>
    }
}
