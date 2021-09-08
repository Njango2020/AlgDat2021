package hjelpeKlasser;

import java.util.*;

public class Tabell
{
    private Tabell() {}   // hindrer instansiering

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
            public static void bytt(int[] a, int i, int j)
            {
                int temp = a[i]; a[i] = a[j]; a[j] = temp;
            }

    // Metoden randPerm(int n)                   Programkode 1.1.8 e)
            public static int[] randPerm(int n)
            {
                int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
                for (int i = 0; i < n; i++) a[i] = i+1;

                Random r = new Random();  // hentes fra java.util

                for (int k = n-1; k > 0; k--)
                {
                    int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
                    bytt(a,k,i);
                }

                return a; // tabellen med permutasjonen returneres

            } // randPerm


    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
            public static void randPerm(int[] a) // stokker om a
            {
                Random r = new Random();  // hentes fra java.util

                for (int k = a.length-1; k > 0; k--)
                {
                    int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
                    bytt(a,k,i);
                }
            }


    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
            public static int maks(int[] a, int fra, int til)
            {
                if (fra < 0 || til > a.length || fra >= til)
                    throw new IllegalArgumentException("Illegalt intervall!");

                int m = fra;             // indeks til største verdi i a[fra:til>
                int maksverdi = a[fra];  // største verdi i a[fra:til>

                for (int i = fra + 1; i < til; i++) if (a[i] > maksverdi)
                {
                    m = i;               // indeks til største verdi oppdateres
                    maksverdi = a[m];    // største verdi oppdateres
                }

                return m;  // posisjonen til største verdi i a[fra:til>
            }


    // Metoden maks(int[] a)                     Programkode 1.2.1 c)
            public static int maks(int[] a)  // bruker hele tabellen
            {
                return maks(a,0,a.length);  // kaller metoden over
            }


    // min-metodene 1)
            public static int min(int[] a, int fra, int til)
            {
                if (fra < 0 || til > a.length || fra >= til)
                    throw new IllegalArgumentException("Illegalt intervall!");

                int m = fra;             // indeks til minste verdi i a[fra:til>
                int minverdi = a[fra];  // minste verdi i a[fra:til>

                for (int i = fra + 1; i < til; i++) if (a[i] < minverdi)
                {
                    m = i;               // indeks til minste verdi oppdateres
                    minverdi = a[m];    // minste verdi oppdateres
                }

                return m;  // posisjonen til minste verdi i a[fra:til>
            }


    // min-metode 2)
            public static int min(int[] a)  // bruker hele tabellen
            {
                return min(a,0,a.length);  // kaller metoden over
            }


    // Bytte av innhold i posisjon i og j i en char tabell
            public static void bytt(char[] a, int i, int j)
            {
                char temp = a[i]; a[i] = a[j]; a[j] = temp;
            }
/*
  Problemer med fra til kontroll
    public static void skriv(int[] a, int fra, int til) {

        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }

    public static void skriv(int[] a)
    {
        skriv(a, 0, a.length);
    }

 */

    public static void skrivln(int[] a, int fra, int til)
    {
        //forandret her(under), skriv til skrivLn og vet ikke om dette er riktig.
        skrivln(a,fra,til);
        System.out.println();
    }

    public static void skrivln(int[] a)
    {
        skrivln(a, 0, a.length);
    }


    /* Problemmer med fratilKontrol, prover å bytte metode navn til fratilkontroll


   public static void skriv(char[] a, int fra, int til)
    {
        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }


    public static void skriv(char[] a)
    {
        skriv(a, 0, a.length);
    }


    public static void skrivln(char[] a, int fra, int til)
    {
        skriv(a,fra,til);
        System.out.println();
    }

    public static void skrivln(char[] a)
    {
        skrivln(a, 0, a.length);
    }

 */

    public static int[] naturligeTall(int n)
    {
        if (n < 1) throw new
                IllegalArgumentException("n(" + n + ") er mindre enn 1!");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = i + 1;
        return a;
    }

    public static int[] heleTall(int fra, int til)
    {
        if (fra > til) throw new
                IllegalArgumentException("fra(" + fra + ") > til(" + til + ")");

        int[] a = new int[til - fra];
        for (int i = fra; i < til; i++) a[i-fra] = i;
        return a;
    }


} // class Tabell