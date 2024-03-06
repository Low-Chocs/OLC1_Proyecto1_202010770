/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;

/**
 *
 * @author Luisi
 */
public class operaciones_aritmeticas {
    public operaciones_aritmeticas(){
        
    }
    
    public String Suma(String operador_izquierdo, String operador_derecho){
        String resultado = "";
        double izquierda = Double.parseDouble(operador_izquierdo);
        double derecha = Double.parseDouble(operador_derecho);
        resultado = String.valueOf(izquierda + derecha);
        return resultado;
    }
}
