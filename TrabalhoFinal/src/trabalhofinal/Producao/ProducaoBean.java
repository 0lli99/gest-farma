package trabalhofinal.Producao;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author P
 */

public class ProducaoBean {
    private int codproducao;
    private int idlab;
    private int codmedic;
    private int qtdproduto;
    private Date dataproducao;

    public ProducaoBean(int codproducao, int idlab, int codmedic, int qtdproduto, Date dataproducao) {
        this.codproducao = codproducao;
        this.idlab = idlab;
        this.codmedic = codmedic;
        this.qtdproduto = qtdproduto;
        this.dataproducao = dataproducao;
    }
    
    /**
     * @return the codproducao
     */
    public int getCodproducao() {
        return codproducao;
    }

    /**
     * @param codproducao the codproducao to set
     */
    public void setCodproducao(int codproducao) {
        this.codproducao = codproducao;
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
     * @return the qtdproduto
     */
    public int getQtdproduto() {
        return qtdproduto;
    }

    /**
     * @param qtdproduto the qtdproduto to set
     */
    public void setQtdproduto(int qtdproduto) {
        this.qtdproduto = qtdproduto;
    }

        /**
     * @return the dataproducao
     */
    public Date getDataproducao() {
        return dataproducao;
    }

    /**
     * @param dataproducao the dataproducao to set
     */
    public void setDataproducao(Date dataproducao) {
        this.dataproducao = dataproducao;
    }
    
    @Override
    public String toString() {
        return "codproducao: "+ codproducao + " idlab: " + idlab + " codmedic: " + codmedic +
                " qtdproduto: " + qtdproduto + " dataproducao: " + dataproducao;
    }
}

