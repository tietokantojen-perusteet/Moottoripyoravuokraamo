package app.pojo;

import java.sql.Date;

public class Huoltotapahtuma {

    private String pyora;
    private Date suorituspaivamaara;
    private String suorittajanPuumerkki;
    private String kuvaus;

    public Huoltotapahtuma(String pyora, Date suorituspaivamaara, String suorittajanPuumerkki, String kuvaus) {
        this.pyora = pyora;
        this.suorituspaivamaara = suorituspaivamaara;
        this.suorittajanPuumerkki = suorittajanPuumerkki;
        this.kuvaus = kuvaus;
    }

    public String getPyora() {
        return pyora;
    }

    public void setPyora(String pyora) {
        this.pyora = pyora;
    }

    public Date getSuorituspaivamaara() {
        return suorituspaivamaara;
    }

    public void setSuorituspaivamaara(Date suorituspaivamaara) {
        this.suorituspaivamaara = suorituspaivamaara;
    }

    public String getSuorittajanPuumerkki() {
        return suorittajanPuumerkki;
    }

    public void setSuorittajanPuumerkki(String suorittajanPuumerkki) {
        this.suorittajanPuumerkki = suorittajanPuumerkki;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

}
