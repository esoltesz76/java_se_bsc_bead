package hu.training360.javasetraining;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class KosarTest {

    @Test
    public void kosarModositas() throws RendelesException {

        Kosar kosar = new Kosar();
        Raktar raktar = new Raktar();

        Termek termek1 = new Termek(1,2500,"konyv");
        Termek termek2 = new Termek(2,3300,"toll");
        Termek termek3 = new Termek(3,4100,"album");

        raktar.keszletetBovit(termek1,5000);
        raktar.keszletetBovit(termek2, 2000);
        raktar.keszletetBovit(termek3, 3000);

        kosar.kosarbaTeszAdottSzamuTermeket(termek1,11, raktar);
        Integer i = 11;
        assertThat(i,equalTo(kosar.getAruLista().get(termek1).intValue()));

        kosar.kosarbaTeszAdottSzamuTermeket(termek2,22, raktar);
        kosar.kosarbaTeszAdottSzamuTermeket(termek2,10, raktar);
        i = 32;
        assertThat(i,equalTo(kosar.getAruLista().get(termek2).intValue()));

        kosar.kosarbanTermekMennyisegetFelulIr(termek1,13, raktar);
        i = 13;
        assertThat(i,equalTo(kosar.getAruLista().get(termek1).intValue()));

        kosar.kosarbolTermeketTorol(termek1, raktar);
        assertThat(null,equalTo(kosar.getAruLista().get(termek1)));

    }

}
