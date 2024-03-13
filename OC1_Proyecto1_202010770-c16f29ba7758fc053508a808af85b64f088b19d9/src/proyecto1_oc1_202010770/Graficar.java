/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
/**
 *
 * @author Luisi
 */

//CODIGO SACADO DEL REPOSITORIO DEL AUXILIAR: AlexIngGuerra: https://github.com/AlexIngGuerra/OLC1-2S2023/blob/main/Clase%206%20-%20Ejemplo%20Graficas/ejemplo/src/func/Graficar.java
public class Graficar extends JFrame {

    
 public static void barras(String Titulo, String TituloX, String TituloY, double valores[], String ejex [])
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        dataset.addValue(2.0, "Valor", "EjeX");
        
        for(int i = 0; i < 5; i++){
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createBarChart(
                Titulo, //TITULO
                TituloX, TituloY, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, true, true);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }

public static void linea(String Titulo, String TituloX, String TituloY,double valores[],String ejex []){
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        
        for(int i = 0; i < 5; i++){
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createLineChart(
                    Titulo, 
                    TituloX,
                    TituloY, 
                    dataset);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }

 public static void Pie(String Titulo, String TituloX, String TituloY, double valores[], String ejex []){
        //Ingreso de datos
        DefaultPieDataset dataset = new DefaultPieDataset( );
      
        for(int i = 0; i < 5; i++){
            dataset.setValue(ejex[i], valores[i]);
        }
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createPieChart(Titulo, dataset);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
 
 public static void Histogram(){
    double[] value = new double[100];
     JFreeChart chart = null;
       Random generator = new Random();
       for (int i=1; i < 100; i++) {
       value[i] = generator.nextDouble();
           int number = 10;
       HistogramDataset dataset = new HistogramDataset();
       dataset.setType(HistogramType.RELATIVE_FREQUENCY);
       dataset.addSeries("Histogram",value,number);
       String plotTitle = "Histogram"; 
       String xaxis = "number";
       String yaxis = "value"; 
       PlotOrientation orientation = PlotOrientation.VERTICAL; 
       boolean show = false; 
       boolean toolTips = false;
       boolean urls = false; 
       chart = ChartFactory.createHistogram( plotTitle, xaxis, yaxis, 
                dataset, orientation, show, toolTips, urls);
       int width = 500;
       int height = 300; 
       
       
}
       ChartFrame frame = new ChartFrame("Ejemplo", chart);
        frame.pack();
        frame.setVisible(true);
}
}

