package hjelpeKlasser;

import hjelpeKlasser.Tabell;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.OptionalInt;

public class Program
{
    public static void main(String ... args)
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
    }
}