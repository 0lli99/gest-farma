package trabalhofinal.Producao;

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
public class ProducaoController {

    public void createProducao(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar uma nova Produção: ");
        System.out.print("Código da Producao: ");
        int codproducao = input.nextInt();
        System.out.print("ID do Laboratório: ");
        int idlab = input.nextInt();
        System.out.print("Código do Medicamento: ");
        int codmedic = input.nextInt();
        System.out.print("Quantidade de Produto: ");
        int qtdproduto = input.nextInt();
        System.out.print("Data de Produção (yyyy-mm-dd): ");
        String dataproducaoStr = input.next();
        Date dataproducao = parseDate(dataproducaoStr);
        
        ProducaoBean pb = new ProducaoBean(codproducao, idlab, codmedic, qtdproduto, dataproducao);
        
        ProducaoModel.create(pb, con);
        
        System.out.println("Produção criada com sucesso!!");
    }

    public void listarProducao(Connection con) throws SQLException {
        HashSet all = ProducaoModel.listAll(con);
        Iterator<ProducaoBean> it = all.iterator();
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
