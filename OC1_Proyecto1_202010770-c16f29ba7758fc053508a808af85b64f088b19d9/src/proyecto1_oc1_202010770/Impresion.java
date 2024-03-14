/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import proyecto1_oc1_202010770.lista;
import java.util.ArrayList;

/**
 *
 * @author Luisi
 */
public class Impresion {
    
    public void Impresion(){
        
    }
    
    public void imprimir(String dato){
        System.out.print(dato);
    }
    
    public String imprimir_lista(int actual, lista lista_a_mostrar){

        return lista_a_mostrar.obtenerElemento(actual);
    }
    
    
}
