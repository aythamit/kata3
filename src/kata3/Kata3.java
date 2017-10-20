
package kata3;


public class Kata3 {


    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<String>();
        rellenaHisto(histogram);
        //histogram.mostrar();
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
       
    }

    private static void rellenaHisto(Histogram<String> histogram) {
        
        for (int i = 0; i < 15; i++) {
            histogram.increment("gmail.com");
        }
        for (int i = 0; i < 10; i++) {
             histogram.increment("ulpgc.es");
        }
        for (int i = 0; i < 8; i++) {
            histogram.increment("ull.es");
        }
        for (int i = 0; i < 5; i++) {
            histogram.increment("hotmail.com");
        }
       
        
        
    
    }
    
    
    
}
