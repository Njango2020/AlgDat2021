package oppgaver.uke35.seksjon121;

import static org.junit.jupiter.api.Assertions.*;

class oppgave1Test {

    @org.junit.jupiter.api.Test
    void min() {
        int [] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int minimum = oppgave1.min(a);

        assertEquals(6,minimum);

        assertEquals(1,a[minimum]);
    }
}