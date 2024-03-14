/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import proyecto1_oc1_202010770.tabla_de_simbolos;
import proyecto1_oc1_202010770.Operaciones_estadisticas;
/**
 *
 * @author Luisi
 */
public class lista {
    public String variable = "";
    public ArrayList<tabla_de_simbolos> lista;
    public Operaciones_estadisticas operacion = new Operaciones_estadisticas();
    
    
    public lista(String variable) {
        this.variable = variable;
        this.lista = new ArrayList<>();
    }
    
    public void refresh_list(){
        this.lista.clear();
    }
    
    public void agregarElemento(String tipo, String variable, Object dato) {
        dato = dato.toString().replace("Ñ", " ");
        this.lista.add(new tabla_de_simbolos(tipo, variable, dato));
    }

    public void mostrarElementos(String dato) {
        for (tabla_de_simbolos elemento : this.lista) {
            dato += elemento.dato + "\n";
            System.out.println(elemento.dato);
        }
    }
 public String obtenerElemento(int indice) {
    if (indice >= 0 && indice < this.lista.size()) {
        int contador = 0;
        for (tabla_de_simbolos elemento : this.lista) {
            if (contador == indice) {
                return elemento.dato.toString();
            }
            contador++;
        }
    }
    return ""; // o lanzar una excepción si lo prefieres
}

    
     public static void generarReporteListaElementos(ArrayList<lista> listaElementos) {
        // Crear el contenido HTML del reporte
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>");
        htmlContent.append("<html>");
        htmlContent.append("<head>");
        htmlContent.append("<title>Reporte Lista de Elementos</title>");
        htmlContent.append("</head>");
        htmlContent.append("<body>");
        htmlContent.append("<h1>Reporte Lista de Elementos</h1>");
        for (lista elemento : listaElementos) {
            htmlContent.append("<h2>").append("Variable: ").append(elemento.variable).append("</h2>");
            htmlContent.append("<table border=\"1\">");
            htmlContent.append("<tr><th>Tipo</th><th>Variable</th><th>Dato</th></tr>");
            for (tabla_de_simbolos entrada : elemento.lista) {
                htmlContent.append("<tr>");
                htmlContent.append("<td>").append(entrada.tipo).append("</td>");
                htmlContent.append("<td>").append(entrada.variable.toString()).append("</td>");
                htmlContent.append("<td>").append(entrada.dato.toString()).append("</td>");
                htmlContent.append("</tr>");
            }
            htmlContent.append("</table>");
            
        }
        htmlContent.append("</body>");
        htmlContent.append("</html>");

        // Escribir el contenido HTML en un archivo
        String fileName = "lista_elementos_reporte.html";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(htmlContent.toString());
            writer.close();
            System.out.println("El archivo HTML se ha generado exitosamente: " + fileName);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo HTML: " + e.getMessage());
        }

        // Abrir el archivo HTML en el navegador web predeterminado
        try {
            File htmlFile = new File(fileName);
            java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo HTML: " + e.getMessage());
        }
    }
    
    public String la_media(){
        
        return operacion.media(this.lista) ;
    }
    public String la_mediana(){
        return operacion.mediana(this.lista) ;
    }
    public String la_moda(){
        return operacion.moda(this.lista) ;
    }
    
    public String la_varianza(){
        
        return operacion.varianza(this.lista);
    }
    
    public String la_maxima(){
        return operacion.valor_maximo(this.lista);
    }
    
    public String la_minima(){
        return operacion.valor_minimo(this.lista);
    }
}
