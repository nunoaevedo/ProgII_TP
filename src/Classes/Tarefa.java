package Classes;

import java.io.Serializable;
import java.util.Date;

public class Tarefa implements Serializable{

    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private String nome;
    private float preco;
    private boolean finalizada;
    private Utilizador dono;
    private Projeto projeto;

    /**
     * CONSTRUTOR
     * @param descricao - descricao tarefa
     * @param nome - nome tarefa
     * @param dataInicio - data de inicio da tarefa
     * @param preco - preco da tarefa
     * @param dono - dono da tarefa
     */
    public Tarefa(String descricao, String nome, Date dataInicio, float preco, Utilizador dono){
        this.dataInicio = dataInicio;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.finalizada = false;
        this.dono = dono;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the finalizada
     */
    public boolean isFinalizada() {
        return finalizada;
    }

    /**
     * @param finalizada the finalizada to set
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    /**
     * @return the dono
     */
    public Utilizador getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(Utilizador dono) {
        this.dono = dono;
    }

    /**
     * @return the projeto
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
        this.projeto.getTarefas().add(this);
    }
    
    
    /**
     * TERMINAR TAREFA
     * @param dataFim - data do fim da tarefa 
     */
    public void terminaTarefa(Date dataFim){
        this.dataFim = dataFim;
        this.finalizada = true;
    }
    
    
}
