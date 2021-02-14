/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
public class TarefaTest {
    
    public TarefaTest() {
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
     * Test of getDataInicio method, of class Tarefa.
     */
    @Test
    public void testGetters() {
        System.out.println("GETTERS/SETTERS");
        
        Utilizador utilizador = new Utilizador("username", "password", "nome", 0, Role.User);
        Date data = new Date();
        Tarefa instance = new Tarefa("descricao", "nome", data, 0, utilizador);
        
        //GETTERS
        assertEquals("descricao", instance.getDescricao());
        assertEquals("nome", instance.getNome());
        assertEquals(data, instance.getDataInicio());
        assertEquals(0, instance.getPreco(), 0);
        assertEquals(utilizador, instance.getDono());
        assertEquals(false, instance.isFinalizada());
        
        //SETTERS
        instance.setDescricao("descTeste");
        assertEquals("descTeste", instance.getDescricao());
        
        instance.setNome("nomeTeste");
        assertEquals("nomeTeste", instance.getNome());
        
        data= new Date();
        instance.setDataInicio(data);
        assertEquals(data, instance.getDataInicio());
        
        instance.setPreco(1);
        assertEquals(1, instance.getPreco(), 0);
        
        utilizador.setPassword("novaPass");
        instance.setDono(utilizador);
        assertEquals(utilizador, instance.getDono());
        
        data = new Date();
        instance.terminaTarefa(data);
        assertEquals(data, instance.getDataFim());
        assertEquals(true, instance.isFinalizada());
        
        Projeto p = new Projeto("cliente", "nome", 1, utilizador);
        instance.setProjeto(p);
        
        assertEquals(p, instance.getProjeto());
        
    }

    
    
}
