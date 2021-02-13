package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Projeto implements Serializable{

    private String nomeCliente;
    private String nome;
    private float precoHora;
    private Utilizador dono;
    private ArrayList<Utilizador> convidados;
    private ArrayList<Tarefa> tarefas;
    
    /**
     * CONSTRUTOR
     * @param nomeCliente - nome do cliente do projeto
     * @param nome - nome do projeto
     * @param precoHora - preco por hora do projeto
     * @param dono - dono do projeto
     */
    public Projeto(String nomeCliente, String nome, float precoHora, Utilizador dono){
        this.nomeCliente = nomeCliente;
        this.nome = nome;
        this.precoHora = precoHora;
        this.dono = dono;
        this.convidados = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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
     * @return the precoHora
     */
    public float getPrecoHora() {
        return precoHora;
    }

    /**
     * @param precoHora the precoHora to set
     */
    public void setPrecoHora(float precoHora) {
        this.precoHora = precoHora;
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
     * @return the convidados
     */
    public ArrayList<Utilizador> getConvidados() {
        return convidados;
    }

    /**
     * @param convidados the convidados to set
     */
    public void setConvidados(ArrayList<Utilizador> convidados) {
        this.convidados = convidados;
    }

    
    /**
     * @return the tarefas
     */
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    /**
     * @param tarefas the tarefas to set
     */
    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    /**
     * ADICIONAR UTILIZADOR CONVIDADO AO PROJETO
     * @param user - utilizador a adicionar
     */
    
    public void addConvidado(Utilizador user){
        this.convidados.add(user);
    }
    
    /**
     * REMOVER CONVIDADO
     * @param user - utilizador a remover
     */
    
    public void removeConvidado(Utilizador user){
        this.convidados.remove(user);
    }
    
    /**
     * ADICIONAR TAREFA
     * @param t - tarefa a adiconar
     */
    public void addTarefa(Tarefa t){
        this.tarefas.add(t);
    }

    
}
