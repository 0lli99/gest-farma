package trabalhofinal.Laboratorio;

import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author P
 */
public class LaboratorioBean {
   private int idlab;
   private String nomelab;
   private String endereco;
   private String cidade;
   private String contato;
   
   public LaboratorioBean(int idlab, String nomelab, String endereco, String cidade, String contato) {
       this.idlab = idlab;
       this.nomelab = nomelab;
       this.endereco = endereco;
       this.cidade = cidade;
       this.contato = contato;
   }

    /**
     * @return the idlab
     */
    public int getIdlab() {
        return idlab;
    }

    /**
     * @param idlab the idlab to set
     */
    public void setIdlab(int idlab) {
        this.idlab = idlab;
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
    
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }
    
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }
    
    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }
    
    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String toString(){
        return "idlab: "+idlab+" nomelab: "+nomelab+" endereco: "+endereco+ " cidade: "+cidade+" contato: "+contato;
    }
}
