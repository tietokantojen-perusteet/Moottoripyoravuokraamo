package app;

import app.db.Database;
import app.pojo.Huoltotapahtuma;
import app.pojo.HuoltotapahtumaDao;
import app.pojo.Pyora;
import app.pojo.PyoraDao;
import app.pojo.Varaaja;
import app.pojo.VaraajaDao;
import app.pojo.Varaus;
import app.pojo.VarausDao;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String args[]) throws Exception {
        Database database = new Database("vuokraamo.db");

        HuoltotapahtumaDao huoltoDao = new HuoltotapahtumaDao(database);

        System.out.println("Huoltotapahtumat::");
        for (Huoltotapahtuma t : huoltoDao.findAll()) {
            System.out.println(t.getPyora());
        }

        System.out.println("");
        System.out.println("Pyörät::");
        PyoraDao pyoraDao = new PyoraDao(database);
        for (Pyora p : pyoraDao.findAll()) {
            System.out.println(p.getRekisterinumero() + " " + p.getMerkki());
        }

        System.out.println("");
        System.out.println("Varaajat::");
        VaraajaDao varaajaDao = new VaraajaDao(database);
        for (Varaaja v : varaajaDao.findAll()) {
            System.out.println(v.getAsiakasnumero() + " " + v.getEtunimi() + " " + v.getSukunimi());
        }

        System.out.println("");
        System.out.println("Varaukset::");
        VarausDao varausDao = new VarausDao(database);
        for (Varaus v : varausDao.findAll()) {
            System.out.println(v.getPyora() + " " + v.getVaraaja() + " " + v.getVarausAlkaa() + " " + v.getVarausLoppuu());
        }

        System.out.println("Apuvälineitä päivämäärien käsittelyyn:");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Timestamp ts = new Timestamp(dateFormat.parse("07-09-2015 16:00:00").getTime());

        System.out.println("Tietyn päivämäärän jälkeen::");
        for (Varaus v : varausDao.findAllWithStartAfter(new Timestamp(dateFormat.parse("07-09-2014 16:00:00").getTime()))) {
            System.out.println(v.getPyora() + " " + v.getVaraaja() + " " + v.getVarausAlkaa() + " " + v.getVarausLoppuu());
        }

        System.out.println("Tietyn päivämäärän jälkeen::");
        for (Varaus v : varausDao.findAllWithStartAfter(ts)) {
            System.out.println(v.getPyora() + " " + v.getVaraaja() + " " + v.getVarausAlkaa() + " " + v.getVarausLoppuu());
        }
    }
}
