package app.pojo;

public class Varaaja {

    private Integer asiakasnumero;
    private String etunimi;
    private String sukunimi;
    private String osoite;
    private String puhelinnumero;

    public Varaaja(Integer asiakasnumero, String etunimi, String sukunimi, String osoite, String puhelinnumero) {
        this.asiakasnumero = asiakasnumero;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.osoite = osoite;
        this.puhelinnumero = puhelinnumero;
    }

    public Integer getAsiakasnumero() {
        return asiakasnumero;
    }

    public void setAsiakasnumero(Integer asiakasnumero) {
        this.asiakasnumero = asiakasnumero;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getPuhelinnumero() {
        return puhelinnumero;
    }

    public void setPuhelinnumero(String puhelinnumero) {
        this.puhelinnumero = puhelinnumero;
    }

}
