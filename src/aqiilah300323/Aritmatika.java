/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah300323;

/**
 *
 * @author User
 */
public class Aritmatika {
    public int tambah(int a, int b) {
        return a + b ;
    }
    
    public boolean cekGanjil(int a){
        return(a%2 != 0);
    }
    
    public int BilanganGanjil(int a){
        int bilGanjil = 0;
        //int counter = 0;
        for (int i = 1; bilGanjil < a; i += 2){
            System.out.print(i+", ");
            bilGanjil++;
        }
        System.out.println();
        return 0;
    }
    
    public boolean isPrima(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0){
            return false;
        }
    }
    return true;
    }


    public int BilanganPrima(int a){
        int counter = 0;
        for (int i = 2; counter < a; i++){
            if (isPrima(i)){
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println();
        return 0;
    }
}


        