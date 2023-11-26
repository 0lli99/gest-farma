package trabalhofinal.Medicamento;

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
import trabalhofinal.Laboratorio.LaboratorioBeanNome;

/**
 *
 * @author P
 */

public class MedicamentoModel {

    public static void create(MedicamentoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (?,?,?,?,?,?,?,?)");
            st.setInt(1, m.getCodmedic());
            st.setString(2, m.getNomemedic());
            st.setLong(3, m.getNroanvisa());
            st.setString(4, m.getPatente());
            st.setObject(5, m.getIdlabpesquisa());
            st.setDate(6, (Date) m.getDatapesquisa());
            st.setObject(7, m.getIdlabensaios());
            st.setDate(8, (Date) m.getDataensaios());
            st.execute();
            st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT * FROM medicamento";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new MedicamentoBean(result.getInt(1),result.getString(2),result.getLong(3),
                        result.getString(4),result.getInt(5),result.getDate(6),result.getInt(7),result.getDate(8)));
        }
        return list;
    }
    
    

    static HashSet listNamesWithDataPesquisa(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT m.nomemedic, m.datapesquisa,  l.nomelab FROM medicamento m JOIN laboratorio l ON m.idlabpesquisa = l.idlab;";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            String nomemedic = result.getString("nomemedic");
            Date datapesquisa = result.getDate("datapesquisa");
            String nomelab = result.getString("nomelab");

            MedicamentoBeanNomeData mb = new MedicamentoBeanNomeData(nomemedic, datapesquisa, new LaboratorioBeanNome(nomelab));

            list.add(mb);
        }
        return list;
    }
}

