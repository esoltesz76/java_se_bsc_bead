package hu.training360.javasetraining;

import java.util.HashMap;
import java.util.Map;

public class Raktar {

    private Map<Termek, Integer> keszlet = new HashMap<>();

    public void keszletetBovit(Termek termek, Integer mennyiseg) {
        if (keszlet.containsKey(termek)) {
            keszlet.put(termek,keszlet.get(termek) + mennyiseg);
        } else {
            this.keszlet.put(termek, mennyiseg);
        }
    }

    public void keszletetCsokkent(Termek termek, Integer mennyiseg) throws RendelesException {
        if (raktaronVanEAKivantMennyiseg(termek, mennyiseg)) {
            keszlet.put(termek,keszlet.get(termek) - mennyiseg);
        } else {
            throw new RendelesException("Nincs raktaron a kivant mennyiseg!");
        }
    }

    public boolean raktaronVan (Termek termek) {
        if (this.keszlet.containsKey(termek) && this.keszlet.get(termek) != null && this.keszlet.get(termek) > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean raktaronVanEAKivantMennyiseg (Termek termek, Integer mennyiseg) {
        if (raktaronVan(termek) && (this.keszlet.get(termek) >= mennyiseg) ) {
            return true;
        } else {
            return false;
        }
    }

    public Integer hanyDbVanRaktaron (Termek termek) {
        if (this.keszlet.containsKey(termek) && this.keszlet.get(termek) != null && this.keszlet.get(termek) > 0 ) {
            return this.keszlet.get(termek);
        } else {
            return 0;
        }
    }

    public Raktar() {
    }

    public Raktar(Map<Termek, Integer> termekek) {
        this.keszlet = termekek;
    }

    public Map<Termek, Integer> getKeszlet() {
        return keszlet;
    }

    public void setKeszlet(Map<Termek, Integer> termekek) {
        this.keszlet = termekek;
    }
}
