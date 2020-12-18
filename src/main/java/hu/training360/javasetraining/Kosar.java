package hu.training360.javasetraining;

import java.util.HashMap;
import java.util.Map;

public class Kosar {

    private Map<Termek,Integer> aruLista = new HashMap<>();

    public void kosarbaTeszAdottSzamuTermeket (Termek termek, Integer mennyiseg, Raktar raktar) throws RendelesException {
        if (raktar.raktaronVanEAKivantMennyiseg(termek, mennyiseg)) {
            if (this.aruLista.containsKey(termek)) {
                this.aruLista.put(termek, this.aruLista.get(termek) + mennyiseg);
            } else {
                this.aruLista.put(termek, mennyiseg);
            }
            raktar.keszletetCsokkent(termek,mennyiseg);
        } else {
            throw new RendelesException("Nincs raktaron a kivant mennyiseg!");
        }

    }

    public void kosarbanTermekMennyisegetFelulIr(Termek termek, Integer mennyiseg, Raktar raktar) {
        if (this.aruLista.containsKey(termek)) {
            raktar.keszletetBovit(termek,this.aruLista.get(termek));
            this.aruLista.put(termek, 0);
            if (raktar.raktaronVanEAKivantMennyiseg(termek, mennyiseg)) {
                this.aruLista.put(termek, mennyiseg);
            } else {
                String uzenet = "Nincs raktáron a kívánt mennyiség!";
            }
        } else {
            if (raktar.raktaronVanEAKivantMennyiseg(termek, mennyiseg)) {
                this.aruLista.put(termek, mennyiseg);
            } else {
                String uzenet = "Nincs raktáron a kívánt mennyiség!";
            }
        }
    }

    public void kosarbolTermeketTorol(Termek termek, Raktar raktar) {
        raktar.keszletetBovit(termek, this.aruLista.get(termek));
        this.aruLista.remove(termek);
    }

    public void kosarbolTermekEgyPeldanyatKivesz(Termek termek, Raktar raktar) {
        raktar.keszletetBovit(termek, this.aruLista.get(termek));
        if (this.aruLista.get(termek) > 1) {
            this.aruLista.put(termek,this.aruLista.get(termek) - 1);
        } else {
            this.aruLista.remove(termek);
        }
    }

    public Kosar() {
    }

    public Kosar(Map<Termek, Integer> aruLista) {
        this.aruLista = aruLista;
    }

    public Map<Termek, Integer> getAruLista() {
        return aruLista;
    }

    public void setAruLista(Map<Termek, Integer> aruLista) {
        this.aruLista = aruLista;
    }
}
