/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.ListaVazia;
import Exceptions.LoginErrado;
import Exceptions.ProjetoRepetido;
import Exceptions.UsernameInexistente;
import Exceptions.UtilizadorRepetido;
import Exceptions.nomeRepetido;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Nuno
 */
public class Repo implements Serializable{
    
    private ArrayList<Projeto> projetos;
    private ArrayList<Utilizador> utilizadores;
    private ArrayList<Tarefa> tarefas;
    private Utilizador userLogado = null;
    private static Repo repo = null;
    private static String ficheiro = "repositorio.txt";
    
    private Repo(){
        this.projetos = new ArrayList<>();
        this.utilizadores = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }
    
    public static Repo getInstance() {
        if (repo == null) {
            repo = new Repo();
        }
        return repo;
    }
    
    
    
    
    /**
     * GETTERS E SETTERS
     */

    /**
     * @return the projetos
     */
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    /**
     * @param projetos the projetos to set
     */
    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    /**
     * @return the utilizadores
     */
    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    /**
     * @param utilizadores the utilizadores to set
     */
    public void setUtilizadores(ArrayList<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }
    
    /**
     * @return the ficheiro
     */
    public static String getFicheiro() {
        return ficheiro;
    }

    /**
     * @param aFicheiro the ficheiro to set
     */
    public static void setFicheiro(String aFicheiro) {
        ficheiro = aFicheiro;
    }

    /**
     * @return the userLogado
     */
    public Utilizador getUser() {
        return userLogado;
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
     * ADICIONAR ADMIN
     */
    
    /**
     * ADICIONAR ADMINISTRADOR
     * @throws UtilizadorRepetido - JÁ EXISTE UM UTILIZADOR REGISTADO 
     */
    public void addAdmin() throws UtilizadorRepetido{
        
        String password = Encripta.encriptaPassword("admin");
        
        for(Utilizador u: utilizadores ){
            if(u.getUsername().equals("admin")){
                u.setNome("admin");
                u.setUsername("admin");
                u.setPassword(password);
                u.setRole(Role.Admin);
                return;
            }
        }
        
        Utilizador utilizador = new Utilizador("admin", password, "admin", 0, Role.Admin);
        this.addUtilizador(utilizador);
        
    }
    
    /**
     * LOGIN E REGISTO DE UTILIZADORES
     */
    
    
    /**
     * LOGIN
     * @param user - username do utilizador a logar
     * @param pass - password do utilizador a logar
     * @throws ListaVazia - Se não houver nenhum utilizador registado lança uma exceção de lista vazia
     * @throws LoginErrado - Se o username ou a password estiver errados lança exceção de login errado
     */
        
    public void login(String user, String pass) throws ListaVazia, LoginErrado {
        
        String password = Encripta.encriptaPassword(pass);
        
        if(this.utilizadores.isEmpty()){
            throw new ListaVazia("Não há utilizadores registados!");
        }
        else{
            for(Utilizador u1: this.utilizadores){
                if(u1.getUsername().equals(user) && u1.getPassword().equals(password)){
                    System.out.println("Login Efetuado!");
                    this.userLogado = u1;
                    return;
                }
            }
        }
        throw new LoginErrado("O Username ou a Password estão incorretos.");
    }
    
    
    /**
     * REGISTAR UTILIZADORES
     * @param ut - utilizador a registar
     * @throws UtilizadorRepetido - já existe um utilizador igual no sistema
     */
    public void addUtilizador(Utilizador ut) throws UtilizadorRepetido {
        
        for(Utilizador u : utilizadores)
            if(u.getUsername().equals(ut.getNome()))
                throw new UtilizadorRepetido("Username já existe");
        
        
        this.utilizadores.add(ut);
        
    } 
    
    /**
     * GET UTILIZADOR POR NOME
     * @param utilizador - nome de utilizador
     * @return - utilizador
     */
    public Utilizador getUserByName(String utilizador){
        for(Utilizador u: this.utilizadores)
            if(u.getNome().equals(utilizador))
                return u;
        
        throw new IllegalArgumentException(String.format("Não existe nenhum utilizador com o nome : %s", utilizador));
        
    }
    
    
    /**
     * EDITAR PERFIL DE UTILIZADOR
     * @param perfil - Utilizador a alterar
     * @param username - novo username a alterar
     * @throws UtilizadorRepetido - já existe utilizador com o nome passado
     */
    
    
    public void changeUsername(Utilizador perfil, String username) throws UtilizadorRepetido{
        
        
        for(Utilizador u: utilizadores)
            if(u.getUsername().equals(username))
                throw new UtilizadorRepetido("Username já existe");
        
        
        perfil.setUsername(username);
    }
    
    
    /**
     * ALTERAR PASSWORD
     * @param username - username do utilizador
     * @param password - password a alterar
     * @throws UsernameInexistente - não existe utilizador com o nome passado
     */
    public void changePassword(String username, String password) throws UsernameInexistente{
        
        Utilizador util = this.utilizadorPorUsername(username);
                
        for(Utilizador u: utilizadores)
            if(u.getUsername().equals(username)){
                u.setPassword(password);
                utilizadores.remove(util);
                utilizadores.add(u);
                return;
            }
        
    }
    
    /**
     * ALTERAR PERMISSOES DE UM UTILIZADOR
     * @param username - username do utilizador a alterar
     * @param role - nova role do utilizador
     * @throws UsernameInexistente - não existe utilizador com o nome passado
     */
    
    public void changeRole(String username, Role role) throws UsernameInexistente{
        
        Utilizador util = this.utilizadorPorUsername(username);
                
        for(int i = 0; i<utilizadores.size(); i++)
            if(utilizadores.get(i).getUsername().equals(username))
                this.utilizadores.get(i).setRole(role);
        
    }
    
    
    /**
     * DEVOLVER UTILIZDORES BASEADO EM ROLES
     * @param role - role do utilizador a usar o programa
     * @return - lista de utilizadores baseado nas permissões do utilizador principal
     */
    
    public ArrayList<Utilizador> utilizadoresPorRole(Role role){
        
        ArrayList<Utilizador> users = new ArrayList<>();
        
        if(role == Role.UserManager){
            for(Utilizador u : this.utilizadores)
                if(u.getRole() == Role.User)
                    users.add(u);
            return users;
        }else{
            return this.getUtilizadores();
        }
    }
    
    
    
    
    
    /**
     * GET USER POR USERNAME
     * @param username - username a procurar
     * @return - utilizador relativo ao username
     * @throws UsernameInexistente - se nao exister utilizador com o nome passado
     */
    
    
    public Utilizador utilizadorPorUsername(String username) throws UsernameInexistente{
        for(Utilizador u: this.utilizadores)
            if(u.getUsername().equals(username))
                return u;
        
        throw new UsernameInexistente("Username indicado não existe");
        
    }
    
    /**
     * ADICIONAR AO HISTORICO
     * @param acao acao a adicionar ao historico
     */
    
    public void addHistorico(String acao){
        this.userLogado.addHistorico(acao);
    }
    
    
    
    /**
     * PROJETOS
     */
    
    /**
     * ADICIONAR PROJETOS À LISTA
     * @param nomeCliente - nome do cliente
     * @param nome - nome do projeto
     * @param preco - preco do projeto
     * @param dono - dono do projeto (username do utilizador)
     * @throws ProjetoRepetido - se já existir um projeto com o nome passado
     */
    
    public void addProjeto(String nomeCliente, String nome, float preco, Utilizador dono) throws ProjetoRepetido{
        
        for(Projeto p : projetos)
            if(p.getNome().equals(nome))
                throw new ProjetoRepetido("Já existe um projeto com o nome indicado");
        
        Projeto p = new Projeto(nomeCliente, nome, preco, dono);
        
        projetos.add(p);
        
    }
    
    /**
     * GET PROJETOS POR NOME
     * @param nome - nome do projeto
     * @return - projeto relativo ao nome passado
     */
    
    public Projeto getProjetoByName(String nome){
        
        for(Projeto p: this.projetos)
            if(p.getNome().equals(nome))
                return p;
        
        throw new IllegalArgumentException(String.format("Não existe nenhum projeto com o nome : %s", nome));
        
    }
    
    
    /**
     * GET POSSIVEIS CONVIDADOS
     * @param nome - nome do projeto
     * @return - utilizadores que podem ser convidados para o projeto
     */
    
    public ArrayList<String> getPessoasParaConvidar(String nome){
        ArrayList<String> lista = new ArrayList<>();
        Projeto p = this.getProjetoByName(nome);
        
        for(Utilizador u : utilizadores){
            if(!(p.getConvidados().contains(u) || p.getDono().equals(u))){
                lista.add(u.getUsername());
            }
        }
        return lista;
    }
    
    /**
     * ADICIONAR CONTIVE
     * @param user - utilizador a enviar convite
     * @param projeto - projeto ao qual foi convidado
     */
    public void addConvite(Utilizador user, Projeto projeto){
        user.addConvite(projeto);
    }
    
    
    /**
     * ADICIONAR CONVIDADO A UM PROJETO
     * @param projeto - nome do projeto a adicionar
     */
    public void addConvidado(String projeto){
        for(Projeto p : this.projetos){
            if(p.getNome().equals(projeto)){
                p.addConvidado(userLogado);
                return;
            }
        }
        throw new IllegalArgumentException("Nome de projeto não existe!");
            
    }
    
    /**
     * PROJETOS REALTIVOS A UM UTILIZADOR
     * @param user -username do utilizador
     * @return - todos os projetos relativos a um utilizador
     */
    
    public ArrayList<Projeto> getProjetosByUser(Utilizador user){
        
        ArrayList<Projeto> lista = new ArrayList<>();
        
        for(Projeto p:projetos)
            if(p.getDono().equals(user) || p.getConvidados().contains(user))
                lista.add(p);
            
        return lista;
        
    }
    
    
    /**
     * REMOVE UTILIZADOR DE PROJETO
     * @param utilizador - utilizador a remover
     * @param projeto - projeto em questão
     */
    
    public void removeUtilizadorDeProjeto(Utilizador utilizador, Projeto projeto){
        projeto.removeConvidado(utilizador);
    }
    
    /**
     * GET PROJETO ATRAVÉS DE TAREFA
     * @param t - Tarefa
     * @return - Projeto que contem a tarefa
     */
    public Projeto getProjetoByTarefa(Tarefa t){
        return t.getProjeto();
    }
    
    
    /**
     * ADICIONAR TAREFA
     * @param descricao - descrição da tarefa
     * @param nome - nome da tarefa
     * @param dataInicio - data inciail da tarefa
     * @param preco - preco da tarefa
     * @param dono - dono da tarefa
     * @throws nomeRepetido - Se houver uma tarefa existente com o mesmo nome lança exceçao
     */
    public void addTarefa(String descricao, String nome, Date dataInicio, float preco, Utilizador dono) throws nomeRepetido{
        
        Tarefa t = new Tarefa(descricao, nome, dataInicio, preco, dono);
        this.tarefas.add(t);
        dono.addTarefa(t);
    }
    
    
   /**
    * * REMOVE TAREFA
    * @param t - tarefa a remover
    */
    public void removeTarefa(Tarefa t){
        t.getDono().removeTarefa(t);
        this.tarefas.remove(t);
        t.getProjeto().getTarefas().remove(t);
        
    }
    
    /**
     * GET TAREFA PELO NOME
     * @param nomeTarefa - nome da tarefa
     * @return tarefa
     */
    public Tarefa getTarefaNome(String nomeTarefa){
        for(Tarefa t: this.tarefas)
            if(t.getNome().equals(nomeTarefa))
                return t;
        
        throw new IllegalArgumentException("Nome de tarefa inexestente");
    }
    
    
    /**
     * ALTERA DESCRICAO
     * @param username - username do utilizador que altera a tarefa
     * @param nomeTarefa - nome da tarefa
     * @param novaDescricao - nova descricao da tarefa
     */
    public void alteraDescricaoTarefa(String username, String nomeTarefa, String novaDescricao){
        
        for(int i=0 ; i<utilizadores.size(); i++){
            if(utilizadores.get(i).getUsername().equals(username)){
                for(int j = 0; j< utilizadores.get(i).getTarefas().size();j++){
                    if(utilizadores.get(i).getTarefas().get(j).getNome().equals(nomeTarefa)){
                        utilizadores.get(i).getTarefas().get(j).setDescricao(novaDescricao);
                        return;
                    }
                }
                return;
            }
        }
        
    }
    
    
    
    /**
     * ALTERA PRECO TAREFA
     * @param username - username do utilizador que altera a tarefa
     * @param nomeTarefa - 
     * @param preco - novo preco da tarefa
     */
    public void alteraPrecoTarefa(String username, String nomeTarefa, float preco){
        
        for(int i=0 ; i<utilizadores.size(); i++){
            if(utilizadores.get(i).getUsername().equals(username)){
                for(int j = 0; j< utilizadores.get(i).getTarefas().size();j++){
                    if(utilizadores.get(i).getTarefas().get(j).getNome().equals(nomeTarefa)){
                        utilizadores.get(i).getTarefas().get(j).setPreco(preco);
                        return;
                    }
                }
                return;
            }
        }
        
    }
    
    
    /**
     * ADICIONAR TAEFA A PROJETO
     * @param tarefa - tarefa em questão
     * @param projeto - nome do projeto a alterar
     */
    
    public void addTarefaProjeto(Tarefa tarefa, Projeto projeto){
        tarefa.setProjeto(projeto);
    }
    
    /**
     * REMOVER TAREFA DO PROJETO EM QUESTÃO
     * @param tarefa - nome da tarefa a remover
     */
    public void removeTarefaProjeto(Tarefa tarefa){
        tarefa.setProjeto(null);
    }
    
    
    
    
    /**
     * TAREFAS  TERMINADAS
     * @param user - utilizador em questão
     * @param dateInicio - data de inicio
     * @param dateFim - datafinal
     * @return tarefas que foram terminadas 
     */
    public ArrayList<Tarefa> tarefasTerminadas(Utilizador user, Date dateInicio, Date dateFim){
        
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        
        for(Tarefa t: user.getTarefas()){
            if(t.getDataFim().after(dateInicio) && t.getDataFim().before(dateFim)){
                tarefas.add(t);
            }
        }
        
        return tarefas;
        
    }
    
    
    /**
     * TAREFAS DO UTILIZADOR
     * @param datainicio - data inicial
     * @param datafim - data final
     * @param terminado - boolean se a tarefa foi terminada
     * @param u - utilizador em questão
     * @return - tarefas do utilizador passado como parametro com base na data inicial final e se foram terminadas ou nao
     */
    public ArrayList<Tarefa> getTarefasRelatorioUtilizador(Date datainicio, Date datafim, boolean terminado, Utilizador u ){
        
        ArrayList<Tarefa> lista = new ArrayList<>();
        
        for(Tarefa t: u.getTarefas()){
            if(terminado){
                if(t.isFinalizada()){
                    if(t.getDataInicio().after(datainicio) && t.getDataFim().before(datafim)){
                        lista.add(t);
                    } 
                }
            }else{
                if(t.getDataInicio().after(datainicio) && t.getDataInicio().before(datafim)){
                    lista.add(t);
                }
            }
               
            
            
        }
        return lista;
        
    }
    
    /**
     * TAREFAS DO PROJETO
     * @param datainicio - data inicial
     * @param datafim - data final
     * @param terminado - boolean se a tarefa foi terminada
     * @param p - projeto em questão
     * @return - tarefas do projeto passado como parametro com base na data inicial final e se foram terminadas ou nao
     */
    public ArrayList<Tarefa> getTarefasRelatorioProjeto(Date datainicio, Date datafim, boolean terminado, Projeto p ){
        
        ArrayList<Tarefa> lista = new ArrayList<>();
        
        for(Tarefa t: p.getTarefas()){
            if(terminado){
                if(t.isFinalizada()){
                    if(t.getDataInicio().after(datainicio) && t.getDataFim().before(datafim)){
                        lista.add(t);
                    }
                }
            }else{
                if(t.getDataInicio().after(datainicio) && t.getDataInicio().before(datafim)){
                    lista.add(t);
                }
            } 
        }
        return lista;
    }
    
    
    
    
    /**
     * ESCRITA EM FICHEIROS
     * @param ficheiro - nome do ficheiro a escrever
     */
    public static void guardarInformacao(String ficheiro) {
        try {
            FileOutputStream ficheiroSaida = new FileOutputStream(ficheiro); 
            ObjectOutputStream out = new ObjectOutputStream(ficheiroSaida);
            out.writeObject(repo);
            out.close();
            ficheiroSaida.close();
            System.out.println("Informação guardada em: " + ficheiro);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    
   /**
    * LEITURA DO FICHEIRO
    * @param ficheiro - nome do ficheiro a ler
    */
    public void lerInformacao(String ficheiro) {
        try {
            FileInputStream ficheiroEntrada = new FileInputStream(ficheiro); 
            ObjectInputStream in = new ObjectInputStream(ficheiroEntrada);
            repo = (Repo) in.readObject();
            in.close();
            ficheiroEntrada.close();
            System.out.printf("Ficheiro " + ficheiro + " lido com sucesso.");
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada " + ex.getMessage());
        }
    }

   
    

    
    
    
}
