package trabalhofinal.Lote;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author P
 */

public class LoteBean {
    private long nrolote;
    private long gtin;
    private Date datavalidade;

    public LoteBean(long nrolote, long gtin, Date datavalidade) {
        this.nrolote = nrolote;
        this.gtin = gtin;
        this.datavalidade = datavalidade;
    }

    /**
     * @return the nrolote
     */
    public long getNrolote() {
        return nrolote;
    }

    /**
     * @param nrolote the nrolote to set
     */
    public void setNrolote(long nrolote) {
        this.nrolote = nrolote;
    }

    /**
     * @return the gtin
     */
    public long getGtin() {
        return gtin;
    }

    /**
     * @param gtin the gtin to set
     */
    public void setGtin(long gtin) {
        this.gtin = gtin;
    }

    /**
     * @return the datavalidade
     */
    public Date getDatavalidade() {
        return datavalidade;
    }

    /**
     * @param datavalidade the datavalidade to set
     */
    public void setDatavalidade(Date datavalidade) {
        this.datavalidade = datavalidade;
    }

    @Override
    public String toString() {
        return "nrolote: " + nrolote + " gtin: " + gtin +
                " datavalidade: " + datavalidade;
    }
}

