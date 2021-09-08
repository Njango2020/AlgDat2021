package oppgaver.uke34;


////2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2,
// dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.

public class oppgave1 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int m = 0;

        for (int i=1; i<a.length; i++){
            if (a[i] < a[m]){
                m=i;

            }
        }
        System.out.println(m);
    }

}


//oppgave 3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
// Hva må endres for at den skal returnere posisjonen til den siste?

/*public class uke1Oppgave1,3 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int m = 0;

        for (int i=1; i<a.length; i++){
            if (a[i] <= a[m]){
                m=i;

            }
        }
        System.out.println(m);
    }

}

 */