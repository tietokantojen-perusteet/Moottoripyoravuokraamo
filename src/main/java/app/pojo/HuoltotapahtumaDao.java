package app.pojo;

import app.db.Database;
import java.sql.SQLException;
import java.util.List;

public class HuoltotapahtumaDao {

    private Database db;

    public HuoltotapahtumaDao(Database db) {
        this.db = db;
    }

    private String s(String s) {
        return "'" + s + "'";
    }

    public List<Huoltotapahtuma> findAll() throws SQLException {
        return db.queryAndCollect("SELECT * FROM Huoltotapahtuma;", rs -> {
            return new Huoltotapahtuma(
                    rs.getString("pyora"),
                    rs.getDate("suorituspaivamaara"),
                    rs.getString("suorittajan_puumerkki"),
                    rs.getString("kuvaus"));
        });
    }

    public List<Huoltotapahtuma> findForBike(String pyora) throws SQLException {
        List<Huoltotapahtuma> matches = db.queryAndCollect("SELECT * FROM Huoltotapahtuma WHERE pyora=" + s(pyora), rs -> {
            return new Huoltotapahtuma(
                    rs.getString("pyora"),
                    rs.getDate("suorituspaivamaara"),
                    rs.getString("suorittajan_puumerkki"),
                    rs.getString("kuvaus"));
        });

        return matches;
    }
}
