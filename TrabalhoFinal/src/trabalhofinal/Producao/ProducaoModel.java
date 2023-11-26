package trabalhofinal.Producao;

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
 * @author P
 */

public class ProducaoModel {

    public static void create(ProducaoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (?,?,?,?,?)");
        st.setInt(1, p.getCodproducao());
        st.setInt(2, p.getIdlab());
        st.setInt(3, p.getCodmedic());
        st.setInt(4, p.getQtdproduto());
        st.setDate(5, (Date) p.getDataproducao());
        st.execute();
        st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT * FROM producao";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new ProducaoBean(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4),
            result.getDate(5)));
        }
        return list;
    }
}

