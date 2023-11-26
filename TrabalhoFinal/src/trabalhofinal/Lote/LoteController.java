package trabalhofinal.Lote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * author P
 */
public class LoteController {

    public void createLote(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Lote: ");
        System.out.print("Número do Lote: ");
        long nrolote = input.nextLong();
        System.out.print("Número Global de Item Comercial (GTIN): ");
        long gtin = input.nextLong();
        input.nextLine();
        System.out.print("Data de Validade (yyyy-mm-dd): ");
        String datavalidadeStr = input.next();
        Date datavalidade = parseDate(datavalidadeStr);

        LoteBean lb = new LoteBean(nrolote, gtin, datavalidade);

        LoteModel.create(lb, con);

        System.out.println("Lote criado com sucesso!!");
    }

    public void listarLote(Connection con) throws SQLException {
        HashSet all = LoteModel.listAll(con);
        Iterator<LoteBean> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    private java.sql.Date parseDate(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = sdf.parse(dateStr);
            return new java.sql.Date(parsedDate.getTime());
        } catch (ParseException ex) {
            return null;
        }
    }
}
