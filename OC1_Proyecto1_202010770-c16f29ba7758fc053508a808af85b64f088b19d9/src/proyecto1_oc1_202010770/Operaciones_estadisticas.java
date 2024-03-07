/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import java.util.ArrayList;
import proyecto1_oc1_202010770.tabla_de_simbolos;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Luisi
 */
public class Operaciones_estadisticas {
    public void Operaciones_estadisticas(){
        
    }
    
    
    public String media(ArrayList<tabla_de_simbolos> lista){
        int size = lista.size();
        double suma = 0;
        for (tabla_de_simbolos elemento : lista) {
            suma += (Double) elemento.dato;
        }
        double resultado = suma / size;
        String devolver = String.valueOf(resultado);
        return devolver;
    }
    
    public String moda(ArrayList<tabla_de_simbolos> lista) {
        
        Map<Double, Integer> frecuencia = new HashMap<>();

        for (tabla_de_simbolos elemento : lista) {
            double dato = (Double) elemento.dato;
            frecuencia.put(dato, frecuencia.getOrDefault(dato, 0) + 1);
        }
        double moda = 0;
        int maxFrecuencia = 0;
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        return String.valueOf(moda);
        }
}
