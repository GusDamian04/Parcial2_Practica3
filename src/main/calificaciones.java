package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import files.Files;
import methods.Methods;

public class calificaciones {

    public static void main(String[] args) throws IOException {
        Files file = new Files();
        Methods methods = new Methods();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        // Creacion de arrelos
        int[] calPP;
        int[] calSP;
        int[] calTP;
        int[] calCP;

        double[] average = new double[4];

        // Cronsruccion y lectura del arreglo 1
        System.out.println("Calcular las calificaciones del un grupo");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        calPP = file.fileToIntArray(fileName);
        average[0] = methods.averageGroup(calPP);
        

        // Cronsruccion y lectura del arreglo 2
        System.out.println("Calcular las calificaciones del un grupo");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        calSP = file.fileToIntArray(fileName);
        average[1] = methods.averageGroup(calSP);
        
        // Cronsruccion y lectura del arreglo 3
        System.out.println("Calcular las calificaciones del un grupo");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        calTP = file.fileToIntArray(fileName);
        average[2] = methods.averageGroup(calTP);
        
        // Cronsruccion y lectura del arreglo 4
        System.out.println("Calcular las calificaciones del un grupo");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        calCP = file.fileToIntArray(fileName);
        average[3] = methods.averageGroup(calCP);

        
        // Promedio final de cada alumno
        int size = file.countFileLines(fileName);
        double[] averagFinal = new double[size];  
        for(int i = 0; i < size; i++)
            averagFinal = methods.averageFinal(calPP, calSP, calTP, calCP, size);     
        
        //Calcular promedio Final Grupal
        System.out.println("Calcular promedio final del grupo");
        double avgrfn;
        avgrfn = methods.averageGroupFinal(average);

        
        // Guardar los promedios parciales en un archivo
        System.out.println("Nombre de archivo de calificaciones de los grupos");
        System.out.println("Escribe el nombre del documento a guardar: ");
        fileName = bufer.readLine();
        bufer.readLine();
        file.writeArraytoFile(fileName, average);

        // Guardar los promedios por alumno en un archivo
        System.out.println("Nombre del archivo de promedio final de cada alumno");
        System.out.println("Escribe el nombre del documento a guardar: ");
        fileName = bufer.readLine();
        file.writeArraytoFileFinal(fileName, averagFinal);

        //Guardar el promedio final en un archivo
        System.out.println("Nombre del archivo del promedio final del grupo");
        System.out.println("Escribe el nombre del documento a guardar: ");
        fileName = bufer.readLine();
        file.writetoDouleFile(fileName, avgrfn);

    }
}
