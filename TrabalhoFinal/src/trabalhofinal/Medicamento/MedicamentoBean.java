package trabalhofinal.Medicamento;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import trabalhofinal.Laboratorio.LaboratorioBean;


/**
 *
 * @author P
 */
public class MedicamentoBean {
    private int codmedic;
    private String nomemedic;
    private long nroanvisa;
    private String patente;
    private Integer idlabpesquisa;
    private Date datapesquisa;
    private Integer idlabensaios;
    private Date dataensaios;
    
    public MedicamentoBean(int codmedic, String nomemedic, long nroanvisa, String patente, Integer idlabpesquisa, Date datapesquisa, Integer idlabensaios, Date dataensaios) {
        this.codmedic = codmedic;
        this.nomemedic = nomemedic;
        this.nroanvisa = nroanvisa;
        this.patente = patente;
        this.idlabpesquisa = idlabpesquisa;
        this.datapesquisa = datapesquisa;
        this.idlabensaios = idlabensaios;
        this.dataensaios = dataensaios;
    }
    
    /**
     * @return the codmedic
     */
    public int getCodmedic() {
        return codmedic;
    }

    /**
     * @param codmedic the codmedic to set
     */
    public void setCodmedic(int codmedic) {
        this.codmedic = codmedic;
    }
    
    /**
     * @return the nomemedic
     */
    public String getNomemedic() {
        return nomemedic;
    }

    /**
     * @param nomemedic the nomemedic to set
     */
    public void setNomemedic(String nomemedic) {
        this.nomemedic = nomemedic;
    }
    
    /**
     * @return the nroanvisa
     */
    public long getNroanvisa(){
        return nroanvisa;
    }
    
    /**
     * @param nroanvisa the nroanvisa to set
     */    
    public void setNroanvisa(long nroanvisa){
        this.nroanvisa = nroanvisa;
    }
    
    public String getPatente(){
        return patente;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public Integer getIdlabpesquisa(){
        return idlabpesquisa;
    }
    
    public void setIdlabpesquisa(Integer idlabpesquisa){
        this.idlabpesquisa = idlabpesquisa;
    }
    
    public Date getDatapesquisa(){
        return datapesquisa;
    }
    
    public void setDatapesquisa(Date datapesquisa){
        this.datapesquisa = datapesquisa;
    }
    
    public Integer getIdlabensaios(){
        return idlabensaios;
    }
    
    public void setIdlabensaios(Integer idlabensaios){
        this.idlabensaios = idlabensaios;
    }
    
    public Date getDataensaios(){
        return dataensaios;
    }
    
    public void setDataensaios(Date dataensaios){
        this.dataensaios = dataensaios;
    }
    
    
    @Override    
    public String toString(){ 
        return "codmedic: "+codmedic+" nomemedic: "+nomemedic+" nroregistroanvisa: "+nroanvisa+" patente: "+patente+
                " idlabpesquisa: "+idlabpesquisa+" datapesquisa: "+datapesquisa+" idlabensaios: "+idlabensaios+" dataensaios: "+dataensaios;
    }
}
