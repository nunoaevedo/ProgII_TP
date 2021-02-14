/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuno
 */
public class ProjetoTest {
    
    public ProjetoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNomeCliente method, of class Projeto.
     */
    @Test
    public void tests() {
        System.out.println("Teste Projetos");
        
        Utilizador utilizador = new Utilizador("username", "password", "nome", 0, Role.User);
        Projeto instance = new Projeto("cliente", "nome", 1, utilizador);
        
        
        assertEquals("cliente", instance.getNomeCliente());
        assertEquals("nome", instance.getNome());
        assertEquals(1, instance.getPrecoHora(), 0);
        assertEquals(utilizador, instance.getDono());
        
        instance.setNomeCliente("clienteTeste");
        assertEquals("clienteTeste", instance.getNomeCliente());
        
        instance.setNome("nomeTeste");
        assertEquals("nomeTeste", instance.getNome());
        
        instance.setPrecoHora(0);
        assertEquals(0, instance.getPrecoHora(), 0);
        
        utilizador.setNome("outronome");
        instance.setDono(utilizador);
        assertEquals(utilizador, instance.getDono());
        
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        ArrayList<Utilizador> listaUtilizadores = new ArrayList<>();

        listaTarefas.add(new Tarefa("desc", "nome", new Date(), 1, utilizador));
        listaUtilizadores.add(new Utilizador("username", "password", "nome", 0, Role.User));
        
        instance.setConvidados(listaUtilizadores);
        instance.setTarefas(listaTarefas);
        assertEquals(listaTarefas, instance.getTarefas());
        assertEquals(listaUtilizadores, instance.getConvidados());
        
        Utilizador novoUser = new Utilizador("useraaa", "password", "nome", 0, Role.User);
        Tarefa novaTarefa = new Tarefa("desc", "adsads", new Date(), 1, utilizador);
        
        listaTarefas.add(novaTarefa);
        instance.addTarefa(novaTarefa);
        assertEquals(listaTarefas, instance.getTarefas());
        
        listaUtilizadores.add(novoUser);
        instance.addConvidado(novoUser);
        assertEquals(listaUtilizadores, instance.getConvidados());
        
        listaUtilizadores.remove(novoUser);
        instance.removeConvidado(novoUser);
        assertEquals(listaUtilizadores, instance.getConvidados());
        
    }

    
    
}
