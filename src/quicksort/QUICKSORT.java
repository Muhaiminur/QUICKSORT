/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Muhaiminur
 */
public class QUICKSORT {
    int[]a;
    QUICKSORT(){
        try {
            Scanner abir=new Scanner(new File("UserInput"));
            a=new int[abir.nextInt()];
            for (int c =0; c < a.length; c++) {
                a[c]=abir.nextInt();
                
            }
        } catch (Exception e) {
        }
    }
    
    public int partition(int[]a,int i,int j){
        int x=a[i];
        int c=i;
        for (int d = c+1; d <= j; d++) {
            if (a[d]<=x) {
                c=c+1;
                exchange(a, c, d);
            }
            
        }
        exchange(a, c, i);
        return c;
    }
    public void exchange(int[]a,int c,int d){
        int temp=a[c];
        a[c]=a[d];
        a[d]=temp;
    }
    public void sort(int[]a,int i,int j){
        int index;
        if(i<j){
            index=partition(a, i, j);
            sort(a, i, index-1);
            sort(a,index+1, j);
        }
    }
    
    
    
    public void PRINT(int[]a){
        System.out.println("==============================================");
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c]+" ");
            
        }
        System.out.println("");
        System.out.println("==============================================");
    }
    
}
