package app.pojo;

import app.db.Database;
import java.sql.SQLException;
import java.util.List;

public class PyoraDao {
    
    private Database db;

    public PyoraDao(Database db) {
        this.db = db;
    }

    private String s(String s) {
        return "'" + s + "'";
    }

    public List<Pyora> findAll() throws SQLException {
        return db.queryAndCollect("SELECT * FROM Pyora;", rs -> {
            return new Pyora(
                    rs.getString("rekisterinumero"),
                    rs.getString("merkki"));
        });
    }
}
