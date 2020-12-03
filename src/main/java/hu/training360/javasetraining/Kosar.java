package hu.training360.javasetraining;

import java.util.HashMap;
import java.util.Map;

public class Kosar {

    private Map<Termek,Integer> aruLista = new HashMap<>();

    public void kosarbaTeszAdottSzamuTermeket (Termek termek, Integer mennyiseg) {
        if (this.aruLista.containsKey(termek)) {
            this.aruLista.put(termek,this.aruLista.get(termek) + mennyiseg);
        } else {
            this.aruLista.put(termek, mennyiseg);
        }
    }

    public void kosarbanTermekMennyisegetFelulIr(Termek termek, Integer mennyiseg) {
        if (this.aruLista.containsKey(termek)) {
            this.aruLista.put(termek,mennyiseg);
        } else {
            this.aruLista.put(termek, mennyiseg);
        }
    }

    public void kosarbolTermeketTorol(Termek termek) {
        this.aruLista.remove(termek);
    }

    public void kosarbolTermekEgyPeldanyatKivesz(Termek termek) {
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
