package Classes;

import Classes.Role;
import java.io.Serializable;
import java.util.ArrayList;

public class Utilizador implements Serializable {

    //private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String nome;
    private int nHorasDiarias;
    private Role role;
    private ArrayList<Historico> historico;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Projeto> convites;

    
    /**
     * CONSTRUTOR
     * @param username - username do utilizador
     * @param password - password do utilizador
     * @param nome - nome do utilizador
     * @param nHorasDiarias - horas diarias do utilizador
     * @param role - role do utilizador (User, UserManager, Admin)
     */
    public Utilizador( String username, String password, String nome, int nHorasDiarias, Role role){
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.nHorasDiarias = nHorasDiarias;
        this.role = role;
        this.historico = new ArrayList<>();
        this.tarefas = new ArrayList<>();
        this.convites = new ArrayList<>();
    }
    
    
     /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the nHorasDiarias
     */
    public int getnHorasDiarias() {
        return nHorasDiarias;
    }

    /**
     * @param nHorasDiarias the nHorasDiarias to set
     */
    public void setnHorasDiarias(int nHorasDiarias) {
        this.nHorasDiarias = nHorasDiarias;
    }

    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * @return the historico
     */
    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }
    
    /**
     * @return the convites
     */
    public ArrayList<Projeto> getConvites() {
        return convites;
    }

    /**
     * @param convites the convites to set
     */
    public void setConvites(ArrayList<Projeto> convites) {
        this.convites = convites;
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
     * ADICIONAR HISTORICO
     * @param acao - acao a adicionar ao historico
     */
    
    public void addHistorico(String acao){
        Historico histo = new Historico(acao);
        this.historico.add(histo);
    }
  
    /**
     * ADICIONAR CONVITE
     * @param projeto - projeto para o qual foi convidado 
     */
  
    public void addConvite(Projeto projeto){
        this.convites.add(projeto);
    }
  
  
    /**
     * REMOVER CONVITE
     * @param nomeProjeto - nome projeto a remover dos convites 
     */
    public void removeConvite(String nomeProjeto){
        for(Projeto p : this.convites){
            if(p.getNome().equals(nomeProjeto)){
                convites.remove(p);
                return;
            }
        }
        
        throw new IllegalArgumentException("Nome de projeto não existe na lista de convites!");
    }
    
    /**
     * ADICINAR TAREFA À LISTA
     * @param t - tarefa a adicionar
     */
    public void addTarefa(Tarefa t){
        this.tarefas.add(t);
    }

    /**
     * REMOVER TAREFA
     * @param t - tarefa a remover
     */
    public void removeTarefa(Tarefa t){
        this.tarefas.remove(t);
    }

    

    

    
    
    








}
