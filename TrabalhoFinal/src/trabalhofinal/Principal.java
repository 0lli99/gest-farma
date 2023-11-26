package trabalhofinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import trabalhofinal.Estoque.EstoqueController;
import trabalhofinal.Lote.LoteController;
import trabalhofinal.Producao.ProducaoController;
import trabalhofinal.Medicamento.MedicamentoController;
import trabalhofinal.Laboratorio.LaboratorioController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author P
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new LaboratorioController().createLaboratorio(con);
                            break;
                    case 2: new MedicamentoController().createMedicamento(con);
                            break;
                    case 3: new ProducaoController().createProducao(con);
                            break;
                    case 4: new LoteController().createLote(con);
                            break;
                    case 5: new EstoqueController().createEstoque(con);
                            break;
                    case 6: new LaboratorioController().listarLaboratorio(con);
                            break;
                    case 7: new MedicamentoController().listarMedicamento(con);
                            break;
                    case 8: new ProducaoController().listarProducao(con);
                            break;
                    case 9: new LoteController().listarLote(con);
                            break; 
                    case 10: new EstoqueController().listarEstoque(con);
                            break;
                    case 11: new MedicamentoController().listarMedicamentoLaboratorios(con);
                            break; 
                    case 12: new LaboratorioController().listarLabMaiorQtdproduto(con);
                            break; 
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<13);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que deseja executar: ");
        System.out.println("1 - Inserir um novo laboratório");
        System.out.println("2 - Inserir um novo medicamento");
        System.out.println("3 - Inserir um nova produção");
        System.out.println("4 - Inserir um novo lote");
        System.out.println("5 - Inserir um novo estoque");
        System.out.println("6 - Exibir todos os laboratórios");
        System.out.println("7 - Exibir todos os medicamentos");
        System.out.println("8 - Exibir todas as produções");
        System.out.println("9 - Exibir todos os lotes");
        System.out.println("10 - Exibir todos os estoques");
        System.out.println("11 - Exibir o nome e data de pesquisa de todos os medicamentos e seus respectivos laboratórios de pesquisa");
        System.out.println("12 - Exibir o nome do laboratório que produziu a maior quantidade de produtos somados");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
}
