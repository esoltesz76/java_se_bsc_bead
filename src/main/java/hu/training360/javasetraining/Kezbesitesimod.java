package hu.training360.javasetraining;

public enum Kezbesitesimod {

    HAZHOZSZALLITAS(1, "Hazhozszallitas"),
    BOLTIVASARLAS(2,"Bolti vasarlas személyesen"),
    BOLTIATVETEL(3,"Későbbi személyes átvétel boltban");

    Integer kod;
    String nev;

    Kezbesitesimod(Integer kod, String nev) {
        this.kod = kod;
        this.nev = nev;
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
}
