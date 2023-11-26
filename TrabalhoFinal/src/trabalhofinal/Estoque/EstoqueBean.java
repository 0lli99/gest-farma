package trabalhofinal.Estoque;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author P
 */

public class EstoqueBean {
   private long nrolote;
   private int codproducao;

   public EstoqueBean(long nrolote, int codproducao) {
      this.nrolote = nrolote;
      this.codproducao = codproducao;
   }

   public long getNrolote() {
      return this.nrolote;
   }

   public void setNrolote(long nrolote) {
      this.nrolote = nrolote;
   }

   public int getCodproducao() {
      return this.codproducao;
   }

   public void setCodproducao(int codproducao) {
      this.codproducao = codproducao;
   }

   public String toString() {
      return "nrolote: " + nrolote + " codmedic: " + codproducao;
   }
}