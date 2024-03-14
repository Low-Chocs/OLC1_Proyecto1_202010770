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
/**
 *
 * @author Luisi
 */
public class tabla_de_simbolos {
    public String tipo;
    public String variable;
    public Object dato;

    
   public tabla_de_simbolos(String tipo, String variable, Object dato){
       this.tipo = tipo;
       this.variable = variable;
       this.dato = dato;
       
   }
   
   public static void generarReporteTablaSimbolos(ArrayList<tabla_de_simbolos> tablaSimbolos) {
        // Crear el contenido HTML del reporte
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>");
        htmlContent.append("<html>");
        htmlContent.append("<head>");
        htmlContent.append("<title>Reporte Tabla de Símbolos</title>");
        htmlContent.append("</head>");
        htmlContent.append("<body>");
        htmlContent.append("<h1>Reporte Tabla de Símbolos</h1>");
        htmlContent.append("<table border=\"1\">");
        htmlContent.append("<tr><th>Tipo</th><th>Variable</th><th>Dato</th></tr>");
        for (tabla_de_simbolos entrada : tablaSimbolos) {
            htmlContent.append("<tr>");
            htmlContent.append("<td>").append(entrada.tipo).append("</td>");
            htmlContent.append("<td>").append(entrada.variable).append("</td>");
            htmlContent.append("<td>").append(entrada.dato.toString()).append("</td>");
            htmlContent.append("</tr>");
        }
        htmlContent.append("</table>");
        htmlContent.append("</body>");
        htmlContent.append("</html>");

        // Escribir el contenido HTML en un archivo
        String fileName = "tabla_simbolos_reporte.html";
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
    
}
