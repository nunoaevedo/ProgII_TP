/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Nuno
 */
public class Historico implements Serializable {
    private Date data;
    private String acao;
    
    public Historico(String acao){
        this.data = new Date();
        this.acao = acao;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @return the acao
     */
    public String getAcao() {
        return acao;
    }
    
    
    
}
