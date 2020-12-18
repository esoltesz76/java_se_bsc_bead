package hu.training360.javasetraining;

public enum Fizetesimod {

    KESZPENZ(1,"Készpénz"),
    KARTYA(2,"Kártya");

    Integer kod;
    String nev;

    Fizetesimod(Integer kod, String nev) {
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
