/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
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

    /**
     * Test of getUsername method, of class Utilizador.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Utilizador instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Utilizador.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Utilizador instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Utilizador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilizador instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Utilizador.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Utilizador instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Utilizador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Utilizador instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Utilizador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Utilizador instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnHorasDiarias method, of class Utilizador.
     */
    @Test
    public void testGetnHorasDiarias() {
        System.out.println("getnHorasDiarias");
        Utilizador instance = null;
        int expResult = 0;
        int result = instance.getnHorasDiarias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnHorasDiarias method, of class Utilizador.
     */
    @Test
    public void testSetnHorasDiarias() {
        System.out.println("setnHorasDiarias");
        int nHorasDiarias = 0;
        Utilizador instance = null;
        instance.setnHorasDiarias(nHorasDiarias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Utilizador.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Utilizador instance = null;
        Role expResult = null;
        Role result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class Utilizador.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        Role role = null;
        Utilizador instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistorico method, of class Utilizador.
     */
    @Test
    public void testGetHistorico() {
        System.out.println("getHistorico");
        Utilizador instance = null;
        ArrayList<Historico> expResult = null;
        ArrayList<Historico> result = instance.getHistorico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistorico method, of class Utilizador.
     */
    @Test
    public void testSetHistorico() {
        System.out.println("setHistorico");
        ArrayList<Historico> historico = null;
        Utilizador instance = null;
        instance.setHistorico(historico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConvites method, of class Utilizador.
     */
    @Test
    public void testGetConvites() {
        System.out.println("getConvites");
        Utilizador instance = null;
        ArrayList<Projeto> expResult = null;
        ArrayList<Projeto> result = instance.getConvites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConvites method, of class Utilizador.
     */
    @Test
    public void testSetConvites() {
        System.out.println("setConvites");
        ArrayList<Projeto> convites = null;
        Utilizador instance = null;
        instance.setConvites(convites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarefas method, of class Utilizador.
     */
    @Test
    public void testGetTarefas() {
        System.out.println("getTarefas");
        Utilizador instance = null;
        ArrayList<Tarefa> expResult = null;
        ArrayList<Tarefa> result = instance.getTarefas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarefas method, of class Utilizador.
     */
    @Test
    public void testSetTarefas() {
        System.out.println("setTarefas");
        ArrayList<Tarefa> tarefas = null;
        Utilizador instance = null;
        instance.setTarefas(tarefas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHistorico method, of class Utilizador.
     */
    @Test
    public void testAddHistorico() {
        System.out.println("addHistorico");
        String acao = "";
        Utilizador instance = null;
        instance.addHistorico(acao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addConvite method, of class Utilizador.
     */
    @Test
    public void testAddConvite() {
        System.out.println("addConvite");
        Projeto projeto = null;
        Utilizador instance = null;
        instance.addConvite(projeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConvite method, of class Utilizador.
     */
    @Test
    public void testRemoveConvite() {
        System.out.println("removeConvite");
        String nomeProjeto = "";
        Utilizador instance = null;
        instance.removeConvite(nomeProjeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTarefa method, of class Utilizador.
     */
    @Test
    public void testAddTarefa() {
        System.out.println("addTarefa");
        Tarefa t = null;
        Utilizador instance = null;
        instance.addTarefa(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTarefa method, of class Utilizador.
     */
    @Test
    public void testRemoveTarefa() {
        System.out.println("removeTarefa");
        Tarefa t = null;
        Utilizador instance = null;
        instance.removeTarefa(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
