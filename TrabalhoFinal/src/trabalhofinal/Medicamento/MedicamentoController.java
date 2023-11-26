package trabalhofinal.Medicamento;

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
 * @author P
 */

public class MedicamentoController {

    public void createMedicamento(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Medicamento: ");
        System.out.print("Código do medicamento: ");
        int codmedic = input.nextInt();
        input.nextLine();
        System.out.print("Nome do medicamento: ");
        String nomemedic = input.nextLine();
        System.out.print("Número de registro da ANVISA: ");
        long nroanvisa = input.nextLong();
        input.nextLine();
        System.out.print("Patente: ");
        String patente = StrcheckForNull(input.nextLine());
        System.out.print("ID do Laboratório de Pesquisa: ");
        String idlabpesquisaStr = input.next();
        Integer idlabpesquisa = IntcheckForNull(idlabpesquisaStr);
        input.nextLine();
        System.out.print("Data de Pesquisa (yyyy-mm-dd): ");
        String datapesquisaStr = input.nextLine();
        Date datapesquisa = parseDate(datapesquisaStr);
        System.out.print("ID do Laboratório de Ensaios: ");
        String idlabensaiosStr = input.next();
        Integer idlabensaios = IntcheckForNull(idlabensaiosStr);
        input.nextLine();
        System.out.print("Data de Ensaios (yyyy-mm-dd): ");
        String dataensaiosStr = input.nextLine();
        Date dataensaios = parseDate(dataensaiosStr);
        
        MedicamentoBean mb = new MedicamentoBean(codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios);
        
        MedicamentoModel.create(mb, con);
        
        System.out.println("Medicamento criado com sucesso!!");
    }

    public void listarMedicamento(Connection con) throws SQLException {
        HashSet all = MedicamentoModel.listAll(con);
        Iterator<MedicamentoBean> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void listarMedicamentoLaboratorios(Connection con) throws SQLException {
        HashSet all = MedicamentoModel.listNamesWithDataPesquisa(con);
        Iterator<MedicamentoBeanNomeData> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    private static String StrcheckForNull(String value) {
        return (value == null || value.trim().isEmpty()) ? null : value;
    }
    
    private static Integer IntcheckForNull(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        } else {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                return null;
            }
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

