package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Files {
    public int countFileLines(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        int numLineas = 0;
        try{
            archivo = new File("C:\\par2prac3\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            // Contar las lineas que contiene el archivo 👍
            while( (bufer.readLine())!= null ){
                numLineas++;
            }
            reader.close();
        } catch(Exception e ){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return numLineas;
    }
    
    public int[] fileToIntArray(String name){
        File archivo; // Apunta a un archivo físico del dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recupera info. del archivo
        String linea;
        int[] array = null;
        int t;
        int i =0;
        
        try{
            t = countFileLines(name);
            array = new int[t];
            archivo = new File("C:\\par2prac3\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            while( (linea = bufer.readLine())!= null ){
                array[i] = Integer.parseInt(linea);
                i++;
            }
            reader.close();
        } catch(Exception e ){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return array;
    }
    
    // Crear un archivo con informacion de un arreglo :)
    public void writeArraytoFile(String name, double[] array){
        FileWriter archivo;
        PrintWriter writer;
        
        try{
            archivo = new FileWriter("C:\\par2prac3\\" + name +".txt");
            writer = new PrintWriter(archivo);
            // Guaardar el arreglo a un archivo 
            for(double unDato: array){
                writer.println(unDato);
            }
            archivo.close();
        } catch( Exception e ){
            System.out.println("Error al escribir al archivo "+ e.toString());
        }
    
    
    }
    public void writeArraytoFileFinal(String name, double[] averagFinal){
        FileWriter archivo;
        PrintWriter writer;
        
        try{
            archivo = new FileWriter("C:\\par2prac3\\" + name +".txt");
            writer = new PrintWriter(archivo);
            // Guaardar el arreglo a un archivo
            for(double anAverage: averagFinal){
                writer.println(anAverage);
            }
            archivo.close();
        } catch( Exception e ){
            System.out.println("Error al escribir al archivo "+ e.toString());
        }
    
    }

    // Crear un archivo con informacion de una variable
    public void writetoDouleFile(String name, double var){
        FileWriter archivo;
        PrintWriter writer;
        
        try{
            archivo = new FileWriter("C:\\par2prac3\\" + name +".txt");
            writer = new PrintWriter(archivo);
            // Guaardar el arreglo a un archivo 
            writer.println(var);
            archivo.close();
        } catch( Exception e ){
            System.out.println("Error al escribir al archivo "+ e.toString());
        }
    }
}
