package hu.training360.javasetraining;

public class Termek {

    private Integer kod;
    private Integer ar;
    private String megnevezes;

    public Termek() {
    }

    public Termek(Integer kod, Integer ar, String megnevezes) {
        this.kod = kod;
        this.ar = ar;
        this.megnevezes = megnevezes;
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public void setMegnevezes(String megnevezes) {
        this.megnevezes = megnevezes;
    }
}
