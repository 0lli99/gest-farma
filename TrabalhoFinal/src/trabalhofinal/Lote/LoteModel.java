package trabalhofinal.Lote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * author P
 */
public class LoteModel {

    public static void create(LoteBean l, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO lote (nrolote, gtin, datavalidade) VALUES (?,?,?)");
        st.setLong(1, l.getNrolote());
        st.setLong(2, l.getGtin());
        st.setDate(3, (Date) l.getDatavalidade());
        st.execute();
        st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT * FROM lote";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new LoteBean(result.getLong(1), result.getLong(2), result.getDate(3)));
        }
        return list;
    }
}
