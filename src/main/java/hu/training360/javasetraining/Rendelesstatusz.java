package hu.training360.javasetraining;

public enum Rendelesstatusz {

    BOOKED(1, "Lefoglalva"),
    DELIVERED(2,"Sikeres szállítás"),
    FAILED_DELIVERY(3,"Sikertelen kiszállítás"),
    IN_PROGRESS(4,"Futárnál van a rendelt termék");

    Integer kod;
    String nev;

    Rendelesstatusz(Integer kod, String nev) {
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
