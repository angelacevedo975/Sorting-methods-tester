/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmethod;

/**
 *
 * @author angel
 */
public class SortingMethods {

    public static void burbuja(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            for (int e = 1; e <= vector.length - i; e++) {
                if (vector[e] < vector[e - 1]) {
                    int aux = vector[e];
                    vector[e] = vector[e - 1];
                    vector[e - 1] = aux;
                }
            }
        }
    }

    public static void insercionDirecta(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int e = i - 1;
            int aux = vector[i];
            while (e >= 0 && vector[e] > aux) {
                vector[e + 1] = vector[e];
                e--;
            }
            vector[e + 1] = aux;
        }
    }

    public static void insercionBinaria(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int inicio = 0, fin = i - 1, med = 0, aux = vector[i];
            while (inicio <= fin) {
                med = (inicio + fin) / 2;
                if (vector[i] <= vector[med]) {
                    fin = med - 1;
                } else {
                    inicio = med + 1;
                }
            }
            for (int e = i - 1; e >= inicio; e--) {
                vector[e + 1] = vector[e];
            }
            vector[inicio] = aux;
        }
    }

    public static void selection(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int menor = i;
            for (int e = i; e < vector.length; e++) {
                if (vector[e] < vector[menor]) {
                    menor = e;
                }
            }
            int aux = vector[i];
            vector[i] = vector[menor];
            vector[menor] = aux;
        }
    }

    public static void shell(int[] vector) {
        int intervalo = vector.length / 2;
        while (intervalo > 0) {
            boolean control;
            do {
                control = false;
                for (int i = 0; i + intervalo < vector.length; i++) {
                    if (vector[i] > vector[i + intervalo]) {
                        int aux = vector[i];
                        vector[i] = vector[i + intervalo];
                        vector[i + intervalo] = aux;
                        control = true;
                    }
                }
            } while (control);
            System.out.println("pasada " + intervalo);
            intervalo /= 2;
        }
    }

    public static void quickSort(int[] a, int inicio, int fin) {
        int x = a[inicio];
        int izq = inicio;
        int der = fin;
        int aux;

        while (izq < der) { 
            while (a[izq] <= x && izq < der)
            {
                izq++;			
            }
            while (a[der] > x) 
            {
                der--;
            }
            if (izq < der) {      
                aux = a[izq];
                a[izq] = a[der];
                a[der] = aux;
            }
        }
        a[inicio] = a[der];          
        a[der] = x;
        
        if (inicio < der - 1)
        {
            quickSort(a, inicio, der - 1);  
        }
        if (der + 1 < fin) 
        {
            quickSort(a, der + 1, fin); 
        }

    }
}


