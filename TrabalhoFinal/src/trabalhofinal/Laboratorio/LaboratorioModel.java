package trabalhofinal.Laboratorio;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalhofinal.Producao.ProducaoBeanQtdproduto;

public class LaboratorioModel {

    public static void create(LaboratorioBean l, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO laboratorio (idlab, nomelab, endereco, cidade, contato) " 
                    + "VALUES (?,?,?,?,?)");
            st.setInt(1, l.getIdlab());
            st.setString(2, l.getNomelab());
            st.setString(3, l.getEndereco());
            st.setString(4, l.getCidade());
            st.setString(5, l.getContato());
            st.execute();
            st.close();  
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT * FROM laboratorio";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new LaboratorioBean(result.getInt(1), result.getString(2), result.getString(3),
            result.getString(4), result.getString(5)));
        }
        return list;
    }
    
        static HashSet listQtdprodutoWithNomelab(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT l.nomelab, SUM(p.qtdproduto) AS qtdtotal FROM laboratorio l "
                + "JOIN producao p ON p.idlab = l.idlab "
                + "GROUP BY l.nomelab "
                + "HAVING SUM(p.qtdproduto) >= ALL (SELECT SUM(qtdproduto) FROM producao GROUP BY idlab)";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            String nomelab = result.getString("nomelab");
            int qtdproduto = result.getInt("qtdtotal");

            LaboratorioBeanNomeProd lb = new LaboratorioBeanNomeProd(nomelab, new ProducaoBeanQtdproduto(qtdproduto));

            list.add(lb);
        }
        return list;
    }
}
