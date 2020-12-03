package hu.training360.javasetraining;

public class Vevo {

    private String vezetekNev;
    private String keresztNev;
    private Integer telefonszam;
    private String email;
    private Integer iranyitoszam;
    private String varos;
    private String kozteruletNeve;
    private String kozteruletJellege;
    private Integer hazszam;
    private Integer emelet;
    private Integer ajto;

    public Boolean vanHianyzoAdat() {
        if (this.vezetekNev == null || this.keresztNev == null  || this.telefonszam == null  || this.email == null  || this.iranyitoszam == null  || this.kozteruletNeve == null  || this.kozteruletJellege == null  || this.hazszam == null ) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public Vevo() {
    }

    public Vevo(String vezetekNev, String keresztNev, Integer telefonszam, String email, Integer iranyitoszam, String varos, String kozteruletNeve, String kozteruletJellege, Integer hazszam, Integer emelet, Integer ajto) {
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
        this.telefonszam = telefonszam;
        this.email = email;
        this.iranyitoszam = iranyitoszam;
        this.varos = varos;
        this.kozteruletNeve = kozteruletNeve;
        this.kozteruletJellege = kozteruletJellege;
        this.hazszam = hazszam;
        this.emelet = emelet;
        this.ajto = ajto;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }

    public void setVezetekNev(String vezetekNev) {
        this.vezetekNev = vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public void setKeresztNev(String keresztNev) {
        this.keresztNev = keresztNev;
    }

    public Integer getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(Integer telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(Integer iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getKozteruletNeve() {
        return kozteruletNeve;
    }

    public void setKozteruletNeve(String kozteruletNeve) {
        this.kozteruletNeve = kozteruletNeve;
    }

    public String getKozteruletJellege() {
        return kozteruletJellege;
    }

    public void setKozteruletJellege(String kozteruletJellege) {
        this.kozteruletJellege = kozteruletJellege;
    }

    public Integer getHazszam() {
        return hazszam;
    }

    public void setHazszam(Integer hazszam) {
        this.hazszam = hazszam;
    }

    public Integer getEmelet() {
        return emelet;
    }

    public void setEmelet(Integer emelet) {
        this.emelet = emelet;
    }

    public Integer getAjto() {
        return ajto;
    }

    public void setAjto(Integer ajto) {
        this.ajto = ajto;
    }
}
