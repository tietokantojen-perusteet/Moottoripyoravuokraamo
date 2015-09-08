package app.pojo;

import java.sql.Timestamp;

public class Varaus {

    private Integer varaustunnus;
    private int varaaja;
    private String pyora;
    private Timestamp varausAlkaa;
    private Timestamp varausLoppuu;

    public Varaus() {
    }

    public Varaus(Integer varaustunnus, int varaaja, String pyora, Timestamp varausAlkaa, Timestamp varausLoppuu) {
        this.varaustunnus = varaustunnus;
        this.varaaja = varaaja;
        this.pyora = pyora;
        this.varausAlkaa = varausAlkaa;
        this.varausLoppuu = varausLoppuu;
    }

    public Integer getVaraustunnus() {
        return varaustunnus;
    }

    public void setVaraustunnus(Integer varaustunnus) {
        this.varaustunnus = varaustunnus;
    }

    public int getVaraaja() {
        return varaaja;
    }

    public void setVaraaja(int varaaja) {
        this.varaaja = varaaja;
    }

    public String getPyora() {
        return pyora;
    }

    public void setPyora(String pyora) {
        this.pyora = pyora;
    }

    public Timestamp getVarausAlkaa() {
        return varausAlkaa;
    }

    public void setVarausAlkaa(Timestamp varausAlkaa) {
        this.varausAlkaa = varausAlkaa;
    }

    public Timestamp getVarausLoppuu() {
        return varausLoppuu;
    }

    public void setVarausLoppuu(Timestamp varausLoppuu) {
        this.varausLoppuu = varausLoppuu;
    }

}
