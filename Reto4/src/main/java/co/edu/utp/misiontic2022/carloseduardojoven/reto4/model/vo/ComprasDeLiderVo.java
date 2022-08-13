package co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.vo;

/*parte 5 */
public class ComprasDeLiderVo {

    private String lider;
    private Double valor;

    
    

    /**
     * @return String return the lider
     */
    public String getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(String lider) {
        this.lider = lider;
    }

    /**
     * @return Double return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%-25s %,15.1f", lider, valor);
    }

    

}
