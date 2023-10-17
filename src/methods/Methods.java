package methods;
//import main.calificaciones;

// Importaciones
//import files.Files;

public class Methods {
    public double averageGroup(int[] average){
        double sum = 0;
        for (double prom : average)
            sum = sum + prom;
        
        return (sum/average.length);
    } 
    
    public double[] averageFinal(int[] averagePP, int[] averageSP, int[] averageTP, int[] averageCP, int size){
        double[] sum = new double[size];
        for(int i=0; i<size; i++)
            sum[i] = (averagePP[i] + averageSP[i] + averageTP[i] + averageCP[i])/4.0;
            
        return sum;
    }

    public double averageGroupFinal(double[] average){
        double sum = 0;
        for (double prom : average)
            sum = sum + prom;
        
        return (sum/average.length);
    }
}
