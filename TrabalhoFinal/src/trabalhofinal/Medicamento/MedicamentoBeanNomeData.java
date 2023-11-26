package trabalhofinal.Medicamento;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import trabalhofinal.Laboratorio.LaboratorioBeanNome;

/**
 *
 * @author P
 */

public class MedicamentoBeanNomeData {
    private String nomemedic;
    private Date datapesquisa;
    private LaboratorioBeanNome laboratorio;

    public MedicamentoBeanNomeData(String nomemedic, Date datapesquisa, LaboratorioBeanNome laboratorio) {
        this.nomemedic = nomemedic;
        this.datapesquisa = datapesquisa;
        this.laboratorio = laboratorio;
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
    
    public Date getDatapesquisa(){
        return datapesquisa;
    }
    
    public void setDatapesquisa(Date datapesquisa){
        this.datapesquisa = datapesquisa;
    }
    
    public LaboratorioBeanNome getLaboratorio() {
        return laboratorio;
    }


    public void setLaboratorio(LaboratorioBeanNome laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    public String toString(){ 
        StringBuffer sb = new StringBuffer();
        sb.append("nomemedic: "+nomemedic+" datapesquisa: "+datapesquisa);
        if(laboratorio != null)
            sb.append(" nomelab: "+laboratorio.getNomelab());
        return sb.toString();
    }
}
