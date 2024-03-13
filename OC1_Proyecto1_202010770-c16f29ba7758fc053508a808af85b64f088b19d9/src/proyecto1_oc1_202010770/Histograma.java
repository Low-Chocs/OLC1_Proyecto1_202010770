/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_oc1_202010770;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Luisi
 */
public class Histograma extends JFrame{
    public Histograma(){
       

        // Crear datos para el histograma
        double[] data = {1.1, 1.2, 1.3, 1.6, 1.7, 2.0, 2.1, 2.2, 2.5, 2.8, 3.0, 3.2, 3.3, 3.5};

        // Crear un conjunto de datos para el histograma
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Histogram", data, 5); // El último parámetro es el número de contenedores/bins

        // Crear el histograma
  

        // Personalizar la apariencia del histograma si es necesario
        // Por ejemplo:
        // XYPlot plot = (XYPlot) chart.getPlot();
        // plot.setForegroundAlpha(0.85f);

        // Crear un panel de gráfico y agregar el gráfico

    }
    
}
