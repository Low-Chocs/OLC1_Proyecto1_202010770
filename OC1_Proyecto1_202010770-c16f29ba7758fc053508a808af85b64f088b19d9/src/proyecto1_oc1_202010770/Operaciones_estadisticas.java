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
        double suma = 0.0f;
        for (tabla_de_simbolos elemento : lista) {
            String dato = elemento.dato.toString();
            suma += Double.parseDouble(dato);
            
         
        }
        double resultado = suma / size;
        String devolver = String.valueOf(resultado);
        return devolver;
    }

    public String mediana(ArrayList<tabla_de_simbolos> lista) {
 
        ArrayList<Double> valores = new ArrayList<>();

       
        for (tabla_de_simbolos elemento : lista) {
            valores.add((Double) elemento.dato);
        }

       
        valores.sort(null);

       
        double mediana;
        int size = valores.size();
        if (size % 2 == 0) {
       
            mediana = (valores.get(size / 2 - 1) + valores.get(size / 2)) / 2.0;
        } else {
       
            mediana = valores.get(size / 2);
        }

        return String.valueOf(mediana);
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
    
 
     public String varianza(ArrayList<tabla_de_simbolos> lista) {

        double media = Double.parseDouble(media(lista));

        double sumaCuadradosDiferencias = 0;
        for (tabla_de_simbolos elemento : lista) {
            double dato = (Double) elemento.dato;
            sumaCuadradosDiferencias += Math.pow(dato - media, 2);
        }

        double varianza = sumaCuadradosDiferencias / lista.size();
        
        return String.valueOf(varianza);
    }

    
    public String valor_maximo(ArrayList<tabla_de_simbolos> lista) {
        double maximo = 0;
        for (tabla_de_simbolos elemento : lista) {
            double dato = (Double) elemento.dato;
            if (dato > maximo) {
                maximo = dato;
            }
        }
        return String.valueOf(maximo);
    }
    

    public String valor_minimo(ArrayList<tabla_de_simbolos> lista) {
        double minimo = 0;
        for (tabla_de_simbolos elemento : lista) {
            double dato = (Double) elemento.dato;
            if (dato < minimo) {
                minimo = dato;
            }
        }
        return String.valueOf(minimo);
    }

}
