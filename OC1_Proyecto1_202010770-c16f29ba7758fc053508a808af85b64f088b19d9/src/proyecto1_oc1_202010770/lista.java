/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import java.util.ArrayList;
import proyecto1_oc1_202010770.tabla_de_simbolos;
/**
 *
 * @author Luisi
 */
public class lista {
    public String variable = "";
    public ArrayList<tabla_de_simbolos> lista;
    
    
    public lista(String variable) {
        this.variable = variable;
        this.lista = new ArrayList<>();
    }
    
    public void agregarElemento(String tipo, String variable, Object dato) {
        dato = dato.toString().replace("Ñ", " ");
        this.lista.add(new tabla_de_simbolos(tipo, variable, dato));
    }

    public void mostrarElementos() {
        for (tabla_de_simbolos elemento : this.lista) {
            if(elemento.variable.equals("Tremdo")){
            continue;
            }
            System.out.println(elemento.dato);
        }
    }
}
