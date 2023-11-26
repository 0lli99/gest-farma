package trabalhofinal.Estoque;

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

public class EstoqueModel {
   public static void create(EstoqueBean e, Connection con) throws SQLException {
      PreparedStatement st;
        st = con.prepareStatement("INSERT INTO estoque (nrolote, codproducao) VALUES (?,?)");
        st.setLong(1, e.getNrolote());
        st.setInt(2, e.getCodproducao());
        st.execute();
        st.close();
   }

   static HashSet listAll(Connection con) throws SQLException {
      HashSet list = new HashSet();
      Statement st = con.createStatement();
      String sql = "SELECT * FROM estoque";
      ResultSet result = st.executeQuery(sql);

      while(result.next()) {
         list.add(new EstoqueBean(result.getLong(1), result.getInt(2)));
      }

      return list;
   }
}
