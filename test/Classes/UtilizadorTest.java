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
public class UtilizadorTest {
    
    public UtilizadorTest() {
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

    
    
    /*
    /**
     * Test of getUsername method, of class Utilizador.
     */
    @Test
    public void testGetters() {
        System.out.println("GETTERS");
        Utilizador instance = new Utilizador("username", "password", "nome", 0, Role.User);
        //GET USERNAME
        System.out.println("Get Username");
        String expResult = "username";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        //GET PASSWORD
        System.out.println("Get Password");
        expResult = "password";
        result = instance.getPassword();
        assertEquals(expResult, result);
                
        //GET NOME
        System.out.println("Get Nome");
        expResult = "nome";
        result = instance.getNome();
        assertEquals(expResult, result);
        
        //GET HORAS
        System.out.println("Get Horas");
        int expResultHora = 0;
        int resultHora = instance.getnHorasDiarias();
        assertEquals(expResultHora, resultHora);
        
        //GET ROLE
        System.out.println("Get Role");
        Role expResultRole = Role.User;
        Role resultRole = instance.getRole();
        assertEquals(expResultRole, resultRole);
        
    }
    
    
    @Test
    public void testSetters(){
        System.out.println("SETTERS");
        Utilizador instance = new Utilizador("username", "password", "nome", 0, Role.User);
        //GET USERNAME
        System.out.println("Set Username");
        String expResult = "usernameSet";
        instance.setUsername("usernameSet");
        assertEquals(expResult, instance.getUsername());
        
        //GET PASSWORD
        System.out.println("Set Password");
        expResult = "passwordSet";
        instance.setPassword("passwordSet");
        assertEquals(expResult, instance.getPassword());
                
        //GET NOME
        System.out.println("Set Nome");
        expResult = "nomeSet";
        instance.setNome("nomeSet");
        assertEquals(expResult, instance.getNome());
        
        //GET HORAS
        System.out.println("Set Horas");
        int expResultHora = 3;
        instance.setnHorasDiarias(3);
        assertEquals(expResultHora, instance.getnHorasDiarias());
        
        //GET ROLE
        System.out.println("Set Role");
        Role expResultRole = Role.Admin;
        instance.setRole(Role.Admin);
        assertEquals(expResultRole, instance.getRole());
    }
    
    
    @Test
    public void testTarefas(){
        System.out.println("TAREFAS");
        
        Utilizador instance = new Utilizador("username", "password", "nome", 0, Role.User);
        Tarefa tarefa = new Tarefa("desc", "nome", new Date(), 1, instance);
        ArrayList<Tarefa> lista = new ArrayList<>();
        lista.add(tarefa);
        
        System.out.println("Adicionar Tarefas");
        instance.addTarefa(tarefa);
        assertEquals(tarefa, instance.getTarefas().get(0));
        
        System.out.println("Remover Tarefas");
        instance.removeTarefa(tarefa);
        assertEquals(0, instance.getTarefas().size());
        
        System.out.println("Set/Get Tarefas");
        instance.setTarefas(lista);
        assertEquals(lista, instance.getTarefas());
    }
    
    @Test
    public void testConvites(){
        System.out.println("CONVITES");
        
        Utilizador instance = new Utilizador("username", "password", "nome", 0, Role.User);
        Projeto projeto = new Projeto("cliente", "nome", 1, instance);
        ArrayList<Projeto> lista = new ArrayList<>();
        lista.add(projeto);
        
        System.out.println("Adicionar Convites");
        instance.addConvite(projeto);
        assertEquals(projeto, instance.getConvites().get(0));
        
        System.out.println("Remover Convites");
        instance.removeConvite(projeto.getNome());
        assertEquals(0, instance.getConvites().size());
        
        System.out.println("Set/Get Convites");
        instance.setConvites(lista);
        assertEquals(lista, instance.getConvites());
    }
    
    
    @Test
    public void testHistorico(){
        System.out.println("HISTORICO");
        
        Utilizador instance = new Utilizador("username", "password", "nome", 0, Role.User);
        
        System.out.println("Adicionar Historico");
        instance.addHistorico("teste");
        assertEquals("teste", instance.getHistorico().get(0).getAcao());  
        
        System.out.println("Set/Get Historico");
        
        ArrayList<Historico> lista = new ArrayList<>();
        Historico historico = new Historico("teste2");
        lista.add(historico);
        instance.setHistorico(lista);
        assertEquals(lista, instance.getHistorico());
    }
    
    
    
    
    

    
    
}
