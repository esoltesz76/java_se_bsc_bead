package hu.training360.javasetraining;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class VevoTest {

    @Test
    public void adatEllenorzes() {

        Vevo v = new Vevo("Kiss", "Miki", 523, "kissmiki@gmail.com", 4033, "Tata", "Fő", "utca", 10, null, null);

        //Vevo v = new Vevo(null, "Miki", 523, "kissmiki@gmail.com", 4033, "Tata", "Fő", "utca", 10, null, null);

        Boolean b = v.vanHianyzoAdat();

        assertThat(b, equalTo(Boolean.FALSE));

    }

}
