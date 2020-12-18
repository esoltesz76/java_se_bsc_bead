package hu.training360.javasetraining;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RaktarTest {

    @Test
    public void keszletModositas() throws RendelesException {

        Raktar raktar = new Raktar();

        Termek termek1 = new Termek(1,2500,"konyv");
        Termek termek2 = new Termek(2,3300,"toll");
        Termek termek3 = new Termek(3,4100,"album");

        raktar.keszletetBovit(termek1,100);

        Integer i;
        i = 1;
        assertThat(i,equalTo(raktar.getKeszlet().size()));

        i = 100;
        assertThat(i,equalTo(raktar.getKeszlet().get(termek1)));

        raktar.keszletetBovit(termek2, 200);

        i = 200;
        assertThat(i,equalTo(raktar.getKeszlet().get(termek2)));

        raktar.keszletetBovit(termek2, 300);

        i = 500;
        assertThat(i,equalTo(raktar.getKeszlet().get(termek2)));

        raktar.keszletetCsokkent(termek2,50);

        i = 450;
        assertThat(i,equalTo(raktar.getKeszlet().get(termek2)));

        assertThat(Boolean.FALSE, equalTo(raktar.raktaronVan(termek3)));

        assertThat(Boolean.TRUE, equalTo(raktar.raktaronVan(termek2)));

        raktar.keszletetCsokkent(termek2,450);
        assertThat(Boolean.FALSE, equalTo(raktar.raktaronVan(termek2)));

        i = 100;
        assertThat(i, equalTo(raktar.hanyDbVanRaktaron(termek1)));

        assertThat(Boolean.TRUE, equalTo(raktar.raktaronVanEAKivantMennyiseg(termek1,99)));
        assertThat(Boolean.TRUE, equalTo(raktar.raktaronVanEAKivantMennyiseg(termek1,100)));
        assertThat(Boolean.FALSE, equalTo(raktar.raktaronVanEAKivantMennyiseg(termek1,101)));

    }

}
