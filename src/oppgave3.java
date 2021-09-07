import java.util.Arrays;

public class oppgave3 {
    public static void main(String[]args){
        int [] a ={11,9};

        System.out.println(Arrays.toString(minmaks(a)));
        System.out.println(fakultet(5));
    }

    static int[] minmaks(int[]a){
        int min =0;
        int min_verdi = a[0];
        int maks =0;
        int maks_verdi = a[0];

        int verdi =0;

        for ( int i =1; i<a.length; i++){
            verdi = a[i];

            if (verdi > maks_verdi){
                maks_verdi = verdi;
                maks = i;
            }
            if (verdi < min_verdi){
                min_verdi = verdi;
                min=i;
            }
        }
        return new int[]{min,maks};

    }

    public static long fakultet(int n){

        if(n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        long fakultet = 1;

        for(int i = 2; i <= n; i++){
            fakultet *= i;
        }

        return fakultet;

    }

}

