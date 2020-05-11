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
public class AleatoryNumbers {
    public static int[] generateNewVector(int n){
        int [] vector= new int[n];
        for(int i=0;i< vector.length;i++){
            vector[i]= (int)(Math.random()*999+1);
        }
        return vector;
    }
}
