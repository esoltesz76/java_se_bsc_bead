package hu.training360.javasetraining;

import org.junit.Test;

public class KosarTest {

    @Test
    public void kosarModositas() {

        Kosar kosar = new Kosar();

        Termek termek1 = new Termek(1,2500,"konyv");
        Termek termek2 = new Termek(2,3300,"toll");
        Termek termek3 = new Termek(3,4100,"album");

        kosar.kosarbaTeszAdottSzamuTermeket(termek1,11);
        kosar.kosarbaTeszAdottSzamuTermeket(termek2,22);
        kosar.kosarbaTeszAdottSzamuTermeket(termek2,10);

    }

}
