package trabalhofinal.Laboratorio;


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
public class LaboratorioController {
    
    public void createLaboratorio(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Laboratório: ");
        System.out.print("ID do Laboratório: ");
        int idlab = input.nextInt();
        input.nextLine();
        System.out.print("Nome do Laboratório: ");
        String nomelab = input.nextLine();
        System.out.print("Endereço: ");
        String endereco = StrcheckForNull(input.nextLine().trim());
        System.out.print("Cidade: ");
        String cidade = StrcheckForNull(input.nextLine().trim());
        System.out.print("Contato: ");
        String contato = StrcheckForNull(input.nextLine().trim());
        
        LaboratorioBean lb = new LaboratorioBean(idlab, nomelab, endereco, cidade, contato);
        LaboratorioModel.create(lb, con);
        System.out.println("Laboratorio criado com sucesso!!");
    }

    public void listarLaboratorio(Connection con) throws SQLException {
        HashSet all = LaboratorioModel.listAll(con);
        Iterator<LaboratorioBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void listarLabMaiorQtdproduto(Connection con) throws SQLException {
        HashSet all = LaboratorioModel.listQtdprodutoWithNomelab(con);
        Iterator<LaboratorioBeanNomeProd> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    private static String StrcheckForNull(String value) {
        return (value == null || value.trim().isEmpty()) ? null : value;
    }
}

