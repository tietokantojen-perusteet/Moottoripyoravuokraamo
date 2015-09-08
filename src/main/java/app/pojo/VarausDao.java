package app.pojo;

import app.db.Database;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class VarausDao {

    private Database db;

    public VarausDao(Database db) {
        this.db = db;
    }

    private String s(String s) {
        return "'" + s + "'";
    }

    public List<Varaus> findAll() throws SQLException {
        return db.queryAndCollect("SELECT * FROM Varaus;", rs -> {
            return new Varaus(
                    rs.getInt("varaustunnus"),
                    rs.getInt("varaaja"),
                    rs.getString("pyora"),
                    rs.getTimestamp("varaus_alkaa"),
                    rs.getTimestamp("varaus_loppuu"));
        });
    }
    
    
    public List<Varaus> findAllWithStartAfter(Timestamp ts) throws SQLException {
        return db.queryAndCollect("SELECT * FROM Varaus WHERE varaus_alkaa >= " + ts.getTime(), rs -> {
            return new Varaus(
                    rs.getInt("varaustunnus"),
                    rs.getInt("varaaja"),
                    rs.getString("pyora"),
                    rs.getTimestamp("varaus_alkaa"),
                    rs.getTimestamp("varaus_loppuu"));
        });
    }
}
