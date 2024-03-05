/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyzers;

/**
 *
 * @author Luisi
 */
public class Token {
    Object simbolo;
    Object columna;
    Object linea;
    Object texto;

    public Token(Object simbolo, Object columna, Object linea, Object texto) {
        this.simbolo = simbolo;
        this.columna = columna;
        this.linea = linea;
        this.texto = texto;
    }
}
