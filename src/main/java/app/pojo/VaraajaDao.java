package app.pojo;

import app.db.Database;
import java.sql.SQLException;
import java.util.List;

public class VaraajaDao {

    private Database db;

    public VaraajaDao(Database db) {
        this.db = db;
    }

    private String s(String s) {
        return "'" + s + "'";
    }

    public List<Varaaja> findAll() throws SQLException {
        return db.queryAndCollect("SELECT * FROM Varaaja;", rs -> {
            return new Varaaja(
                    rs.getInt("asiakasnumero"),
                    rs.getString("etunimi"),
                    rs.getString("sukunimi"),
                    rs.getString("osoite"),
                    rs.getString("puhelinnumero"));
        });
    }
}
