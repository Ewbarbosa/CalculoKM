
package Model;

import java.sql.Date;

public class ModelQuilometragem {
    
    // aqui estão encapsulados os campos da tabela quilometragem no banco de dados
    
    private String placa;
    private Date data;
    private String localmotivo;
    private Double kmrodado;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the localmotivo
     */
    public String getLocalmotivo() {
        return localmotivo;
    }

    /**
     * @param localmotivo the localmotivo to set
     */
    public void setLocalmotivo(String localmotivo) {
        this.localmotivo = localmotivo;
    }

    /**
     * @return the kmrodado
     */
    public Double getKmrodado() {
        return kmrodado;
    }

    /**
     * @param kmrodado the kmrodado to set
     */
    public void setKmrodado(Double kmrodado) {
        this.kmrodado = kmrodado;
    }


}