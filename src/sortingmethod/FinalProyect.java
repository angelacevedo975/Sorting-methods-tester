/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmethod;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class FinalProyect {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        // TODO code application logic here
        String menu = "OPCIONES\n"
                + "1° Ordenar Ascendente por BURBUJA\n"
                + "2° Ordenar Ascendente por INSERCION DIRECTA\n"
                + "3° Ordenar Ascendente por INSERCION BINARIA\n"
                + "4° Ordenar Ascendente por SELECCION\n"
                + "5° Ordenar Ascendente por SHELL\n"
                + "6° Ordenar Ascendente por QUICKSORT\n"
                + "7° Salir";
        int op, numOp = 7;
        long iTime, fTime, time;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    int n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    int[] vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.burbuja(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 2:
                    n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.insercionDirecta(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 3:
                    n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.insercionBinaria(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 4:
                    n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.selection(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 5:
                    n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.shell(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 6:
                    n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del vector a generar"));
                    vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.quickSort(vector, 0 , vector.length-1);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    JOptionPane.showMessageDialog(null, "El tiempo total fue de "+time/1000.0+" segundos para ordenar "+n);
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while (op != numOp);
    }*/
    
    public static String[] getData(String method, int n){
        if (method.equals("Burbuja"))
            return calculate(1, n);
        if (method.equals("Insercion directa"))
            return calculate(2, n);
        if (method.equals("Insercion Binaria"))
            return calculate(3, n);
        if (method.equals("Seleccion"))
            return calculate(4, n);
        if (method.equals("Shell"))
            return calculate(5, n);
        else return calculate(6, n);
                
    }
    
    public static String[] calculate(int method, int n){
        long iTime, fTime, time;
        String[] salida = new String[2];
        switch (method) {
                case 1:
                    
                    int[] vector= AleatoryNumbers.generateNewVector(n);
                    if (n<=100)
                        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
                    iTime= Timer.getTime();
                    SortingMethods.burbuja(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
                case 2:
                    
                    vector= AleatoryNumbers.generateNewVector(n);
                    
                    iTime= Timer.getTime();
                    SortingMethods.insercionDirecta(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                   
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
                    
                case 3:
                    
                    vector= AleatoryNumbers.generateNewVector(n);
                    
                    iTime= Timer.getTime();
                    SortingMethods.insercionBinaria(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
                    
                case 4:
                    
                    vector= AleatoryNumbers.generateNewVector(n);
                   
                    iTime= Timer.getTime();
                    SortingMethods.selection(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
                    
                case 5:
                    
                    vector= AleatoryNumbers.generateNewVector(n);
                    
                    iTime= Timer.getTime();
                    SortingMethods.shell(vector);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
                case 6:
                    
                    vector= AleatoryNumbers.generateNewVector(n);
                    
                    iTime= Timer.getTime();
                    SortingMethods.quickSort(vector, 0 , vector.length-1);
                    fTime= Timer.getTime();
                    time=fTime-iTime;
                    
                    salida[0]=""+time/1000.0;
                    salida[1]=""+n;
                    return salida;
    }
        return salida;
    }
}
