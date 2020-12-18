package hu.training360.javasetraining;

public class Rendeles {

    private Kosar kosar = new Kosar();
    private Vevo vevo = new Vevo();
    private String kezbesitesModja;
    private String fizetesModja;
    private String vasarlasStatusza;
    private String megjegyzes;
    private Integer id;

    public void vevoAdatainakFelvetele(String vezetekNev, String keresztNev, Integer telefonszam, String email, Integer iranyitoszam, String varos, String kozteruletNeve, String kozteruletJellege, Integer hazszam, Integer emelet, Integer ajto) throws RendelesException {
        vevo.setVezetekNev(vezetekNev);
        vevo.setAjto(ajto);
        vevo.setEmail(email);
        vevo.setEmelet(emelet);
        vevo.setHazszam(hazszam);
        vevo.setIranyitoszam(iranyitoszam);
        vevo.setKeresztNev(keresztNev);
        vevo.setKozteruletJellege(kozteruletJellege);
        vevo.setKozteruletNeve(kozteruletNeve);
        vevo.setTelefonszam(telefonszam);
        vevo.setVaros(varos);

        if (vevo.vanHianyzoAdat()) {
            throw new RendelesException("Hiányosak a vevő adatai!");
        }
    }

    public void hazhoszallitasSikertelenBeallit(String megjegyzes) {
        this.setVasarlasStatusza(Rendelesstatusz.FAILED_DELIVERY.getNev());
        this.setMegjegyzes(megjegyzes);
    }

    public void hazhoszallitasSikeresBeallit() {
        this.setVasarlasStatusza(Rendelesstatusz.DELIVERED.getNev());
    }

    public void futarAtvetteBeallit(String kezbesitesModja) throws RendelesException {

        if (kezbesitesModja == null) {
            throw new RendelesException("Nincs beállítva a rendelés státusza!");
        }
        if (kezbesitesModja.equals(Kezbesitesimod.HAZHOZSZALLITAS.getNev())) {
            this.setVasarlasStatusza(Rendelesstatusz.IN_PROGRESS.getNev());
        }
    }

    public void kezbesitesimodBeallit(Integer kod) throws RendelesException  {

        switch(kod) {
            case 1:
                this.setKezbesitesModja(Kezbesitesimod.HAZHOZSZALLITAS.getNev());
                this.setVasarlasStatusza(Rendelesstatusz.BOOKED.getNev());
                break;
            case 2:
                this.setKezbesitesModja(Kezbesitesimod.BOLTIVASARLAS.getNev());
                this.setVasarlasStatusza(Rendelesstatusz.DELIVERED.getNev());
                break;
            case 3:
                this.setKezbesitesModja(Kezbesitesimod.BOLTIATVETEL.getNev());
                this.setVasarlasStatusza(Rendelesstatusz.BOOKED.getNev());
                break;
            default:
                throw new RendelesException("Hibás kézbesítési kód került megadásra!");
        }
    }

    public void fizetesimodBeallit(Integer kod) throws RendelesException {
        switch (kod) {
            case 1:
                this.setFizetesModja(Fizetesimod.KESZPENZ.getNev());
                break;
            case 2:
                this.setFizetesModja(Fizetesimod.KARTYA.getNev());
                break;
            default:
                throw new RendelesException("Hibás fizetési kód került megadásra!");
        }
    }

    public Rendeles() {
    }

    public Rendeles(Kosar kosar, Vevo vevo, String kezbesitesModja, String fizetesModja, String vasarlasStatusza, String vasarlasTipusa, String megjegyzes, Integer id) {
        this.kosar = kosar;
        this.vevo = vevo;
        this.kezbesitesModja = kezbesitesModja;
        this.fizetesModja = fizetesModja;
        this.vasarlasStatusza = vasarlasStatusza;
        this.megjegyzes = megjegyzes;
        this.id = id;
    }

    public Kosar getKosar() {
        return kosar;
    }

    public void setKosar(Kosar kosar) {
        this.kosar = kosar;
    }

    public Vevo getVevo() {
        return vevo;
    }

    public void setVevo(Vevo vevo) {
        this.vevo = vevo;
    }

    public String getKezbesitesModja() {
        return kezbesitesModja;
    }

    public void setKezbesitesModja(String kezbesitesModja) {
        this.kezbesitesModja = kezbesitesModja;
    }

    public String getFizetesModja() {
        return fizetesModja;
    }

    public void setFizetesModja(String fizetesModja) {
        this.fizetesModja = fizetesModja;
    }

    public String getVasarlasStatusza() {
        return vasarlasStatusza;
    }

    public void setVasarlasStatusza(String vasarlasStatusza) {
        this.vasarlasStatusza = vasarlasStatusza;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
