package trabalhofinal.Laboratorio;

import java.util.HashSet;
import java.util.Iterator;
import trabalhofinal.Producao.ProducaoBeanQtdproduto;

/**
 *
 * @author P
 */
public class LaboratorioBeanNomeProd {
    private String nomelab;
    private ProducaoBeanQtdproduto producao;

    public LaboratorioBeanNomeProd(String nomelab, ProducaoBeanQtdproduto producao) {
        this.nomelab = nomelab;
        this.producao = producao;
    }
    
    
    /**
    * @return the nomelab
    */
    public String getNomelab() {
        return nomelab;
    }

    /**
     * @param nomelab the nomelab to set
     */
    public void setNomelab(String nomelab) {
        this.nomelab = nomelab;
    }
    
    public ProducaoBeanQtdproduto getProducao(){
        return producao;
    }
    
    public void setProducao(ProducaoBeanQtdproduto producao){
        this.producao = producao;
    }

    public String toString(){ 
        return "nomelab: "+nomelab+" qtdproduto: "+producao.getQtdproduto();
    }    
}
