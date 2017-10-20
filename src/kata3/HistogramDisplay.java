
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane( createPanel() );
        pack();
    }

    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel panel = new ChartPanel( createChart( createDataset() ));
        panel.setPreferredSize(new Dimension(500,400));
        return panel;
    }
    
     private JFreeChart createChart(DefaultCategoryDataset dataSet) {
         JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                 "Dominio","Nº Emails",dataSet,
                 PlotOrientation.VERTICAL,false,true,false);
         
         return chart;
         
     }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(15,"","gmail.com");
        dataset.addValue(3,"","yahoo.com");
        dataset.addValue(9,"","ulpgc.com");
         dataset.addValue(8,"","ull.es");
        
        
        return dataset;
    }
    
    
}
