package trabalhofinal.Estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P
 */

public class EstoqueController {

    public void createEstoque(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo item no Estoque: ");
        System.out.print("Número do Lote: ");
        long nrolote = input.nextLong();
        System.out.print("Código da Producao: ");
        int codproducao = input.nextInt();

        EstoqueBean eb = new EstoqueBean(nrolote, codproducao);

        EstoqueModel.create(eb, con);

        System.out.println("Item de Estoque criado com sucesso!!");
    }

    public void listarEstoque(Connection con) throws SQLException {
        HashSet all = EstoqueModel.listAll(con);
        Iterator<EstoqueBean> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
