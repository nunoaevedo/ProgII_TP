/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Nuno
 */
public class nomeRepetido extends Exception {
    /**
     * Constructs an instance of <code>UsernameInexistente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public nomeRepetido(String msg) {
        super(msg);
    }
}
